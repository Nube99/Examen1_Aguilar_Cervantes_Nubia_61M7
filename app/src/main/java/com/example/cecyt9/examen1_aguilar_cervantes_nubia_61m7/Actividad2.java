package com.example.cecyt9.examen1_aguilar_cervantes_nubia_61m7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad2 extends AppCompatActivity {

    TextView Respuesta;
    String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        Respuesta = (TextView) findViewById(R.id.Respuesta);
       Intent recibe = getIntent();
      Bundle Datos = recibe.getExtras();

        resultado = Datos.getString("resultado");
        Respuesta.setText("Nubia Aguilar Cervantes     Resultado: " + resultado);

    }
    public void onClickEnvia(View vista){

        Intent intencion =new Intent(Intent.ACTION_SEND);
        intencion.setType("text/plain");
        intencion.putExtra(Intent.EXTRA_SUBJECT, "Asunto: Examen 1er parcial ");
        intencion.putExtra(Intent.EXTRA_TEXT, "Contenido del correo: " + Respuesta.getText().toString());
        intencion.putExtra(Intent.EXTRA_EMAIL, new String[] { "nubia-04@live.com.mx"} );
        startActivity(intencion);


    }


}
