package com.gru.ovo.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gru.ovo.R;
import com.gru.ovo.adapter.AdapterNoticia;
import com.gru.ovo.helpers.DatosCarreras;

public class FragmentNoticias extends Fragment {

    private static FragmentNoticias instancia;

    public FragmentNoticias() {
    }

    public static FragmentNoticias newInstance() {
        if(instancia == null){
            instancia = new FragmentNoticias();
        }
        return instancia;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_noticias, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setAdapter(new AdapterNoticia(getActivity(), DatosCarreras.noticias()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }

}
