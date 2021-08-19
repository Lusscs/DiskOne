package com.example.diskone.frag;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.example.diskone.ColorTransparentUtils;
import com.example.diskone.FakeDatabase;
import com.example.diskone.R;
import com.example.diskone.act.DetalhesReceitasActivity;

import java.util.ArrayList;

public class ReceitasFragmentAdapter extends RecyclerView.Adapter<ReceitasFragmentAdapter.ViewHolder> {
    Context context;
    private LayoutInflater mInflater;
    private ArrayList<FakeDatabase.Receitas> arrayList;

    public ReceitasFragmentAdapter(Context context, ArrayList<FakeDatabase.Receitas> arrayList){
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.arrayList = arrayList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_card, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int colorSet(int transparency, Color color){
        return Color.argb(color.red(), color.green(), color.blue(), transparency);
    }

    @Override
    public void onBindViewHolder(ReceitasFragmentAdapter.ViewHolder holder, int position) {
        holder.cardView.setBackgroundColor(Color.parseColor(ColorTransparentUtils.transparentColor(holder.cardView.getResources().getColor(R.color.primaryColor), 25)));
        holder.title.setText(arrayList.get(holder.getAdapterPosition()).getNome());
        holder.numeroPorcao.setText(arrayList.get(holder.getAdapterPosition()).getRediment());
        holder.preparationTime.setText(arrayList.get(holder.getAdapterPosition()).getPreparationTime());
        holder.kcal.setText(arrayList.get(holder.getAdapterPosition()).getKcal());
        RequestOptions options = new RequestOptions()
                .override(180, 180)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .error(R.mipmap.ic_launcher_round);
        Glide.with(context).load(arrayList.get(holder.getAdapterPosition()).getImageURL()).apply(options).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetalhesReceitasActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("from", 1);
                bundle.putSerializable("recipe", arrayList.get(holder.getAdapterPosition()));
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, kcal, numeroPorcao, preparationTime;
        CardView cardView;
        ImageView imageView;
        public ViewHolder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardcard);
            title = itemView.findViewById(R.id.titleCard);
            kcal = itemView.findViewById(R.id.kcal);
            numeroPorcao = itemView.findViewById(R.id.numeroPorcoes);
            preparationTime = itemView.findViewById(R.id.preparationTime);
            imageView = itemView.findViewById(R.id.imageCard1);
        }
    }
}
