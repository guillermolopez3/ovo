package com.gru.ovo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.gru.ovo.R;
import com.gru.ovo.helpers.MetodosComunes;

import java.util.ArrayList;

public class CarrerasActivity extends AppCompatActivity
{
    String categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_carreras);

        categoria= getIntent().getStringExtra("categoria");
        MetodosComunes.showToolbar(getIntent().getStringExtra("title"),false,this);

        ListView listView = findViewById(R.id.listCarreras);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arqui());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(CarrerasActivity.this,adapter.getItem(position),Toast.LENGTH_LONG).show();
                Intent i = new Intent(CarrerasActivity.this,DetalleCarreraActivity.class);
                i.putExtra("titulo",adapter.getItem(position));
                startActivity(i);

            }
        });
    }

    private ArrayList<String> arqui()
    {
        ArrayList<String> list=new ArrayList<>();

        list.add("Arquitectura");
        list.add("Diseño Industrial");
        return list;
    }
}
