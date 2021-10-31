package com.example.tarea_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ActivityResult extends AppCompatActivity {
    EditText nombre,apellido,edad,correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        nombre = (EditText) findViewById(R.id.txtrnombre);
        apellido = (EditText) findViewById(R.id.txtrapellidos);
        edad = (EditText) findViewById(R.id.txtredad);
        correo = (EditText) findViewById(R.id.txtrcorreo);
        
        nombre.setEnabled(false);
        apellido.setEnabled(false);
        edad.setEnabled(false);
        correo.setEnabled(false);


        Intent intent = this.getIntent();
        Bundle extra = intent.getExtras();

        nombre.setText(extra.getString("nombre"));
        apellido.setText(extra.getString("apellido"));
        edad.setText(extra.getString("edad"));
        correo.setText(extra.getString("correo"));
    }
}