package com.example.proyecto_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class SistemaMedidas extends AppCompatActivity {

    Button internacional, ingles, relacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_medidas);

        internacional=findViewById(R.id.btn_Inter);
        ingles=findViewById(R.id.btn_ingles);
        relacion=findViewById(R.id.btn_relacion);

        Intent irInter=new Intent(getApplicationContext(), Internacional.class);
        Intent irIngles=new Intent(getApplicationContext(), Ingles.class);
        Intent irRela=new Intent(getApplicationContext(),Relacion.class);


        internacional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(irInter);
            }
        });

        ingles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(irIngles);
            }
        });

        relacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(irRela);
            }
        });

    }
}