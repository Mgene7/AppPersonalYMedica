package com.example.apppersonalymedica;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // THREAD SOLICITADO
        Thread hiloSplash = new Thread() {
            @Override
            public void run() {
                try {
                    // Detiene la pantalla por 3 segundos
                    sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Pasa a la pantalla principal
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Cierra el splash
                }
            }
        };
        hiloSplash.start();
    }
}