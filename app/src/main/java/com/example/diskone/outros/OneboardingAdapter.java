package com.example.diskone.outros;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.diskone.FakeDatabase;
import com.example.diskone.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class OneboardingAdapter extends RecyclerView.Adapter<OneboardingAdapter.OnboardingViewHolder>{

    private List<FakeDatabase.Walkthrough> oneboardingItems;
    private Context context;

    public OneboardingAdapter(Context context, List<FakeDatabase.Walkthrough> onboardingItems){
        this.oneboardingItems = onboardingItems;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public OnboardingViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new OnboardingViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item_container_onboarding, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull OnboardingViewHolder holder, int position) {
        holder.textViewDescription.setText(oneboardingItems.get(holder.getAdapterPosition()).getDescription());
        holder.textViewTitle.setText(oneboardingItems.get(holder.getAdapterPosition()).getTitle());
        holder.imageOnboarding.setImageResource(oneboardingItems.get(holder.getAdapterPosition()).getImageURL());
    }

    @Override
    public int getItemCount() {
        return oneboardingItems.size();
    }

    public class OnboardingViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewTitle, textViewDescription;
        private ImageView imageOnboarding;
        public OnboardingViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.textViewTitleOnboarding);
            textViewDescription = itemView.findViewById(R.id.textViewDescriptionOnboarding);
            imageOnboarding = itemView.findViewById(R.id.imageOnboarding);
        }
    }
}
