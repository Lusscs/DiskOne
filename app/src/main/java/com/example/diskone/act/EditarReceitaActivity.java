package com.example.diskone.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diskone.FakeDatabase;
import com.example.diskone.R;
import com.example.diskone.frag.Receitas;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Date;

public class EditarReceitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_receita);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Receitas receita = (Receitas) bundle.getSerializable("recipe");

        String doc = bundle.getSerializable("doc") + "";

        Button salvar = findViewById(R.id.editar_button_salvar);

        TextView nome = findViewById(R.id.editar_nome);
        TextView intrucoes = findViewById(R.id.editar_intrucoes);
        TextView editar_preparo = findViewById(R.id.editar_preparo);
        TextView editar_ingredientes = findViewById(R.id.editar_ingredientes);

        nome.setText(receita.getTitle());
        intrucoes.setText(receita.getDescription());
        editar_preparo.setText(receita.getPreparationMode());
        editar_ingredientes.setText(receita.getIngredients());

        salvar.setOnClickListener(v -> {
            String a = nome.getText().toString();
            String b = "";
            String c= intrucoes.getText().toString();
            String d = editar_ingredientes.getText().toString();
            String e = editar_preparo.getText().toString();


            FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            firebaseFirestore.collection(firebaseAuth.getCurrentUser().getUid())
                    .document(doc)
                    .update("title", a,
                            "imageURL", b,
                            "description", c,
                            "ingredients", d,
                            "preparationMode", e
                            //"preparationTime", f,
                           // "rediment", g,
                            //"kcal", h
                            )
                    .addOnSuccessListener(unused -> {
                        Toast.makeText(EditarReceitaActivity.this, "Editado com sucesso", Toast.LENGTH_SHORT).show();
                         finish();
                    })
                    .addOnFailureListener(ee -> {
                        Toast.makeText(EditarReceitaActivity.this, "Erro ao editar", Toast.LENGTH_SHORT).show();
                        finish();
                    });
        });
    }
}