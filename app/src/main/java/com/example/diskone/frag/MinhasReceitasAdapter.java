package com.example.diskone.frag;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diskone.R;
import com.example.diskone.act.DetalhesMinhasReceitasActivity;
import com.example.diskone.act.EditarReceitaActivity;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.DocumentSnapshot;

public class MinhasReceitasAdapter extends FirestoreRecyclerAdapter<Receitas, MinhasReceitasAdapter.MinhasReceitasAdapterHolder> {

    private Context context;
    private RecyclerView recyclerView;
    private FirestoreRecyclerOptions<Receitas> receitas;
    private FragmentActivity mainActivity;


    public MinhasReceitasAdapter(FirestoreRecyclerOptions receitas, Context context, RecyclerView recyclerView, FragmentActivity mainActivity) {
        super(receitas);
        this.context = context;
        this.receitas = receitas;
        this.recyclerView = recyclerView;
        this.mainActivity = mainActivity;
    }

    @Override
    protected void onBindViewHolder(MinhasReceitasAdapter.MinhasReceitasAdapterHolder holder, int position, Receitas receita) {
        holder.nome.setText(receita.getTitle() + "");

        holder.linearLayout.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetalhesMinhasReceitasActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("recipe", receita);
            intent.putExtras(bundle);
            context.startActivity(intent);
        });

        holder.edit.setOnClickListener(v -> {
            Intent intent = new Intent(context, EditarReceitaActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("from", 2);
            bundle.putSerializable("recipe", receita);
            DocumentSnapshot documentSnapshot = receitas.getSnapshots().getSnapshot(holder.getAdapterPosition());
            bundle.putSerializable("doc", documentSnapshot.getId());
            intent.putExtras(bundle);
            context.startActivity(intent);
        });

      holder.delete.setOnClickListener(v -> getSnapshots().getSnapshot(holder.getAdapterPosition()).getReference().delete());
    }

    @Override
    public MinhasReceitasAdapterHolder onCreateViewHolder(ViewGroup group, int i) {
        View view = LayoutInflater.from(group.getContext())
                .inflate(R.layout.item_card_simples, group, false);
        return new MinhasReceitasAdapterHolder(view);
    }

    public class MinhasReceitasAdapterHolder extends RecyclerView.ViewHolder {

        TextView nome;
        LinearLayout linearLayout;
        ImageView edit, delete;

        public MinhasReceitasAdapterHolder(View itemView) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.item_card_simples);
            nome = itemView.findViewById(R.id.nome);
            edit = itemView.findViewById(R.id.edit);
            delete = itemView.findViewById(R.id.delete);
        }
    }
}


