package com.gru.ovo.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gru.ovo.R;
import com.gru.ovo.adapter.AdapterMenu;
import com.gru.ovo.model.MenuModel;

import java.util.ArrayList;

/**
 * Created by guill on 15/03/2018.
 */

public class FragmentCarreras extends Fragment
{
    public FragmentCarreras(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_menu_carreras,container,false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(new AdapterMenu(getActivity(),nombres()));
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2, LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    private ArrayList<Integer> lista()
    {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(R.drawable.arqui);
        array.add(R.drawable.artes);
        array.add(R.drawable.agro);
        array.add(R.drawable.economia);
        array.add(R.drawable.capacitacion);
        array.add(R.drawable.cortos);
        array.add(R.drawable.comunicacion);
        array.add(R.drawable.famaf);
        array.add(R.drawable.medicina);
        array.add(R.drawable.quimica);
        array.add(R.drawable.sociales);

        return array;
    }

    private ArrayList<String> nombres()
    {
        ArrayList<String> array = new ArrayList<>();
        array.add("Arquitectura, Urbanismo y Diseño");
        array.add("Artes");
        array.add("Ciencias Agropecuarias");
        array.add("Ciencias Económicas");
        array.add("Cursos de Capacitacón");
        array.add("Cursos Cortos");
        array.add("Ciencias de la Comunicación");
        array.add("Ciencias Exactas, Físicas y Naturales");
        array.add("Ciencias Médicas");
        array.add("Ciencias Químicas");
        array.add("Ciencias Sociales");

        return array;
    }


}
