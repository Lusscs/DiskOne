package com.example.diskone.frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diskone.R;
import com.example.diskone.act.AdicionarReceitaActivity;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class MinhasReceitasFragment extends Fragment {
    private MinhasReceitasAdapter adapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
        adapter.notifyDataSetChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_minhas_receitas, container, false);
        RecyclerView rv = view.findViewById(R.id.recycler_view_minhas_receitas);

        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        String identificadorUsuario = firebaseAuth.getCurrentUser().getUid();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        Query query = db.collection(identificadorUsuario);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        adapter = new MinhasReceitasAdapter(new FirestoreRecyclerOptions.Builder<Receitas>()
                .setQuery(query, Receitas.class)
                .build(), getContext(), rv, getActivity());


        rv.setLayoutManager(linearLayoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        FloatingActionButton floatingActionButton = view.findViewById(R.id.fab_minhas_receitas);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AdicionarReceitaActivity.class);
                getContext().startActivity(intent);
            }
        });

        return view;
    }
}