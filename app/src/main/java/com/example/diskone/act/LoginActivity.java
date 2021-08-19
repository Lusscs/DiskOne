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

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button logar = findViewById(R.id.logar);
        Button cadastrar = findViewById(R.id.cadastrar);

        TextView email = findViewById(R.id.login_email);
        TextView senha = findViewById(R.id.login_senha);



        logar.setOnClickListener(v -> {
            String a = email.getText().toString();
            String b = senha.getText().toString();
            FirebaseAuth auth = FirebaseAuth.getInstance();
            auth.signInWithEmailAndPassword(a, b).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        startActivity(new Intent(LoginActivity.this, TutorialActivity.class));
                    } else {
                        Toast.makeText(LoginActivity.this, "Verifique seus dados", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CadastroActivity.class));
            }
        });
    }
}