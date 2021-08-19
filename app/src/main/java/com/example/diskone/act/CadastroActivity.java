package com.example.diskone.act;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.diskone.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button salvar = findViewById(R.id.cadastro_salvar);

        TextView email = findViewById(R.id.cadastro_login);
        TextView senha = findViewById(R.id.cadastro_senha);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = email.getText().toString();
                String b = senha.getText().toString();
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
                firebaseAuth.createUserWithEmailAndPassword(a, b).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            startActivity(new Intent(CadastroActivity.this, LoginActivity.class));
                            Toast.makeText(CadastroActivity.this, "Cadrastro efetuado com sucesso", Toast.LENGTH_SHORT).show();
                            finish();
                        } else {
                            Toast.makeText(CadastroActivity.this, "Erro", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}