package com.example.tarea_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellido,edad,correo;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.txtnombre);
        apellido = (EditText) findViewById(R.id.txtapellidos);
        edad = (EditText) findViewById(R.id.txtedad);
        correo = (EditText) findViewById(R.id.txtcorreo);

        btnEnviar= (Button) findViewById(R.id.btnenviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityResult.class);
                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("apellido", apellido.getText().toString());
                intent.putExtra("edad", edad.getText().toString());
                intent.putExtra("correo", correo.getText().toString());
                startActivity(intent);
            }
        });

    }
}