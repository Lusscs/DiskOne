package com.example.diskone.frag;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.diskone.frag.ReceitasFragment;
import com.example.diskone.frag.MinhasReceitasFragment;

public class Adapter extends FragmentStateAdapter {
    public Adapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 1:
                return new MinhasReceitasFragment();

        }

        return new ReceitasFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
