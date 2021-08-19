package com.example.diskone.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.diskone.FakeDatabase;
import com.example.diskone.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class DetalhesReceitasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_receita);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();
        FakeDatabase.Receitas receitas = (FakeDatabase.Receitas) bundle.getSerializable("recipe");
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingToolbarLayout);
        collapsingToolbarLayout.setTitle(receitas.getNome());
        TextView textView = findViewById(R.id.nested_second_activity_textView1);
        TextView textView2 = findViewById(R.id.nested_second_activity_textView2);
        TextView textView3 = findViewById(R.id.textView3);
        ImageView imageView = findViewById(R.id.collapsingImage);

        textView.setText(receitas.getDescription());
        textView2.setText(receitas.getIngredients());
        textView3.setText(receitas.getPreparationMode());
        RequestOptions requestOptions = new RequestOptions()
                //.circleCrop()
                //.override(180, 180)
                .error(R.drawable.unnamed);
        Glide.with(this).load(receitas.getImageURL()).apply(requestOptions).into(imageView);
    }
}