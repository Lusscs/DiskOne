package com.example.diskone.frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.example.diskone.FakeDatabase;
import com.example.diskone.R;

public class ReceitasFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        recyclerView = view.findViewById(R.id.recyclerViewFragOne);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
        FakeDatabase fakeDatabase = new FakeDatabase();
        fakeDatabase.setData();
        ReceitasFragmentAdapter adapter = new ReceitasFragmentAdapter(getActivity(), fakeDatabase.getRecipes());
        recyclerView.setAdapter(adapter);


        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                int action = e.getAction();
                if (!recyclerView.canScrollHorizontally(RecyclerView.FOCUS_FORWARD)) {
                    switch (action) {
                        case MotionEvent.ACTION_DOWN:
                            rv.getParent().requestDisallowInterceptTouchEvent(true);
                        case MotionEvent.ACTION_MOVE:
                            rv.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                } else {

                    rv.getParent().requestDisallowInterceptTouchEvent(false);

                }
                //recyclerView.removeOnItemTouchListener(this);
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        });
        //adapter.notifyDataSetChanged();
       /* RecyclerView.OnItemTouchListener onItemTouchListener = new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                int action = e.getAction();
                Toast.makeText(getActivity(), ""+action, Toast.LENGTH_SHORT).show();
                if (!recyclerView.canScrollHorizontally(RecyclerView.FOCUS_FORWARD)) {
                    switch (action) {
                        case MotionEvent.ACTION_DOWN:
                            rv.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                } else {
                    switch (action) {
                        case MotionEvent.ACTION_DOWN:
                            rv.getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                recyclerView.removeOnItemTouchListener(this);
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {
            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
            }
        };
        */

        return view;
    }
}