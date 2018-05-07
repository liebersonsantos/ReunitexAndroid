package com.example.lieberson.reunitexandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class CadastroActivity extends AppCompatActivity {

    private AppCompatTextView textLogin;
    private AppCompatButton botaoCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        textLogin = findViewById(R.id.text_login_id);
        botaoCadastrar = findViewById(R.id.btn_cadastro_id);

        textLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                telaCadastro();
            }
        });

        botaoCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                telaCadastro();
            }
        });


    }

    private void telaCadastro() {

        Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
