package com.example.enviarinformacion;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText nombre, apellidos, edad, correo;
    Button enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        apellidos = findViewById(R.id.apellidos);
        edad = findViewById(R.id.edad);
        correo = findViewById(R.id.correo);
        enviar = findViewById(R.id.enviar);

        enviar.setOnClickListener(v -> {
            String nom = nombre.getText().toString();
            String ape = apellidos.getText().toString();
            String ed = edad.getText().toString();
            String mail = correo.getText().toString();

            Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
            intent.putExtra("nombre", nom);
            intent.putExtra("apellidos", ape);
            intent.putExtra("edad", ed);
            intent.putExtra("correo", mail);
            startActivity(intent);

            nombre.setText("");
            apellidos.setText("");
            edad.setText("");
            correo.setText("");



        });

    }
}