package com.example.cecyt9.examen1_aguilar_cervantes_nubia_61m7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Actividad1 extends AppCompatActivity {

    EditText numero;
    int numeroC=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
        numero = (EditText) findViewById(R.id.Cantidad);
    }

    public void onClick(View vista){
        numeroC = Integer.parseInt(numero.getText().toString());
        Toast.makeText(getApplicationContext(),""+numeroC/15, Toast.LENGTH_LONG).show();
        Intent envia = new Intent(this,Actividad2.class);
        Bundle datos = new Bundle();
        datos.putString("resultado",""+numeroC/15);
        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }

}
