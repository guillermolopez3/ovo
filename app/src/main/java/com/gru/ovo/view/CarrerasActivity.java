package com.gru.ovo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arqui());
        listView.setAdapter(adapter);
    }

    private ArrayList<String> arqui()
    {
        ArrayList<String> list=new ArrayList<>();

        list.add("Arquitectura");
        list.add("Diseño Industrial");
        return list;
    }
}
