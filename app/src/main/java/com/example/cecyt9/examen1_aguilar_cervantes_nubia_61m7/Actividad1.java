package com.example.cecyt9.examen1_aguilar_cervantes_nubia_61m7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Actividad1 extends AppCompatActivity {

    EditText numero;
    int numeroC=0;
    String resultado= "Resultado: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad1);
    }

    public void onClickConvertir(){

        numero = (EditText) findViewById(R.id.Cantidad);
        numeroC = (Integer.parseInt(numero.getText().toString())/15);
        resultado = resultado + numeroC;
        Intent envia = new Intent(this, Actividad2.class);
        Bundle datos = new Bundle();
        datos.putString("resultado",resultado);
        finish();
        startActivity(envia);

    }

}
