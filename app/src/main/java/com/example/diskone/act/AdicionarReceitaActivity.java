package com.example.diskone.act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diskone.R;
import com.example.diskone.frag.Receitas;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AdicionarReceitaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_receita);
        Button salvar = findViewById(R.id.receita_button_salvar);

        TextView nome = findViewById(R.id.receita_nome);
        TextView intrucoes = findViewById(R.id.receita_intrucoes);
        TextView receita_preparo = findViewById(R.id.receita_preparo);
        TextView receita_ingredientes = findViewById(R.id.receita_ingredientes);

        salvar.setOnClickListener(v -> {
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
            FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
            DocumentReference documentReference = firebaseFirestore.collection(firebaseAuth.getCurrentUser().getUid()).document();
            documentReference.set(new Receitas(
                    nome.getText().toString(),
                    "",
                            intrucoes.getText().toString(),
                            receita_ingredientes.getText().toString(),
                    receita_preparo.getText().toString()))
                    .addOnSuccessListener(unused -> {
                        Toast.makeText(AdicionarReceitaActivity.this, "Adicionado com sucesso", Toast.LENGTH_SHORT).show();
                        finish();
                    })
                    .addOnFailureListener(e -> {
                        Toast.makeText(AdicionarReceitaActivity.this, "Erro ao adicionar", Toast.LENGTH_SHORT).show();
                        finish();
                    });
        });

    }
}