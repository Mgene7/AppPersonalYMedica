package com.example.apppersonalymedica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Los 5 botones (Intents Implícitos)
    Button btnMapa, btnWeb, btnLlamar, btnCorreo, btnSms;

    // Los 3 botones (Intents Explícitos)
    Button btnPatologias, btnMedicamentos, btnAyuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Conexion de botones con el XML
        btnMapa = findViewById(R.id.btnMapa);
        btnWeb = findViewById(R.id.btnWeb);
        btnLlamar = findViewById(R.id.btnLlamar);
        btnCorreo = findViewById(R.id.btnCorreo);
        btnSms = findViewById(R.id.btnSms);

        btnPatologias = findViewById(R.id.btnPatologias);
        btnMedicamentos = findViewById(R.id.btnMedicamentos);
        btnAyuda = findViewById(R.id.btnAyuda);


        // =========================================
        // EVENTOS CLIC DE LOS 3 INTENTS EXPLICITOS
        // =========================================
        btnPatologias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PatologiasActivity.class);
                startActivity(intent);
            }
        });

        btnMedicamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MedicamentosActivity.class);
                startActivity(intent);
            }
        });

        btnAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PrimerosAuxiliosActivity.class);
                startActivity(intent);
            }
        });


        // =========================================
        // EVENTOS CLIC DE LOS 5 INTENTS IMPLICITOS
        // =========================================
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirMapaHospital(); }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { abrirFarmacias(); }
        });

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { llamarFamiliar(); }
        });

        btnCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { enviarExamenes(); }
        });

        btnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { enviarSmsSos(); }
        });
    }

    // =============================================
    //        METODOS DE LOS 5 INTENTS IMPLÍCITOS
    // =============================================

    private void abrirMapaHospital() {
        Uri ubicacion = Uri.parse("geo:-33.5413,-70.6273?q=Hospital+Barros+Luco");
        Intent intent = new Intent(Intent.ACTION_VIEW, ubicacion);
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "No tienes app de mapas instalada", Toast.LENGTH_SHORT).show();
        }
    }

    private void abrirFarmacias() {
        Uri sitio = Uri.parse("https://seremienlinea.minsal.cl/asdigital/index.php?mfarmacias");
        Intent intent = new Intent(Intent.ACTION_VIEW, sitio);
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "No tienes navegador web", Toast.LENGTH_SHORT).show();
        }
    }

    private void llamarFamiliar() {
        Uri numero = Uri.parse("tel:+56912345678");
        Intent intent = new Intent(Intent.ACTION_DIAL, numero);
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "Error al abrir el teléfono", Toast.LENGTH_SHORT).show();
        }
    }

    private void enviarCorreo() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"doctorj@hospitalbl.cl"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Isabel Bobadilla tuvo una convulsión");
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "No tienes app de correo", Toast.LENGTH_SHORT).show();
        }
    }

    private void enviarSmsSos() {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:+56912345678"));
        try {
            startActivity(intent);
        } catch (Exception e) {
            Toast.makeText(this, "No tienes app de mensajes", Toast.LENGTH_SHORT).show();
        }
    }
}