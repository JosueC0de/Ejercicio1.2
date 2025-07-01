package com.example.enviarinformacion;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SegundaActivity extends AppCompatActivity {


    TextView resultado;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segunda);
        resultado = findViewById(R.id.resultado);

        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellidos");
        String edad = getIntent().getStringExtra("edad");
        String correo = getIntent().getStringExtra("correo");

        String textoFinal = "Nombre: " + nombre + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Edad: " + edad + "\n" +
                "Correo: " + correo;

        resultado.setText(textoFinal);


        Button regresar = findViewById(R.id.regresar);
        regresar.setOnClickListener(v -> finish());


    }
}