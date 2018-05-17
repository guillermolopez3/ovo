package com.gru.ovo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.helpers.MetodosComunes;

public class IngresoCarreraActivity extends AppCompatActivity {

    TextView detalle;
    Button btnPlan;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_carrera);

        nombre = getIntent().getExtras().getString("titulo");
        MetodosComunes.showToolbar(nombre,false,this);

        detalle = findViewById(R.id.txtIngresoDetalle);
        btnPlan = findViewById(R.id.btnIngresoMas);

        detalle.setText("Arquitectura es el arte y la técnica de proyectar y organizar espacios internos y externos a fin de satisfacer las necesidades prácticas y expresivas del hombre");

        btnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IngresoCarreraActivity.this,DetalleCarreraActivity.class);
                i.putExtra("titulo",nombre);
                startActivity(i);
            }
        });
    }
}
