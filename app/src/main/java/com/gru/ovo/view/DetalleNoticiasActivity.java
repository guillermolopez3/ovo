package com.gru.ovo.view;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.model.NoticiaModel;

public class DetalleNoticiasActivity extends AppCompatActivity
{

    TextView titulo, detalle, fecha;
    Button btnMas;
    NoticiaModel data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_noticias);

         data = new NoticiaModel();
         data = (NoticiaModel) getIntent().getExtras().get("data");

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(data.getNombre());


        titulo  = findViewById(R.id.detalleNoticiaTxtTitulo);
        detalle = findViewById(R.id.DetalleNoticiaTxtDescripcion);
        fecha   = findViewById(R.id.DetalleFechaTxtFecha);
        btnMas  = findViewById(R.id.DetalleNoticiaBtnMas);

        titulo.setText(data.getNombre());
        detalle.setText(data.getDescripcion_larga());
        fecha.setText("15/4/2018");

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse(data.getLink());
                Intent i = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(i);
            }
        });


    }
}
