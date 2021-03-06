package com.example.lieberson.reunitexandroid;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                mostrarLogin();

            }
        }, 1500);

    }

    private void mostrarLogin() {

        Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
