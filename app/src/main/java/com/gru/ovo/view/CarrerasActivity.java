package com.gru.ovo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.gru.ovo.R;
import com.gru.ovo.adapter.AdapterCarreras;
import com.gru.ovo.helpers.MetodosComunes;
import com.gru.ovo.model.CarreraModel;

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

        RecyclerView recyclerView = findViewById(R.id.recyclerCarrra);
        recyclerView.setAdapter(new AdapterCarreras(arqui(),this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


       /* final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arqui());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(CarrerasActivity.this,adapter.getItem(position),Toast.LENGTH_LONG).show();
                Intent i = new Intent(CarrerasActivity.this,DetalleCarreraActivity.class);
                i.putExtra("titulo",adapter.getItem(position));
                startActivity(i);

            }
        });*/
    }

    private ArrayList<CarreraModel> arqui()
    {
        ArrayList<CarreraModel> list=new ArrayList<>();

        list.add(new CarreraModel( "Arquitectura"));
        list.add(new CarreraModel( "Diseño Industrial"));
        return list;
    }
}
