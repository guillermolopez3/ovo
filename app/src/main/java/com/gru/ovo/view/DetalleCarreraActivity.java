package com.gru.ovo.view;

import android.content.Intent;
import android.support.design.widget.TabLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.maps.MapsActivity;
import com.gru.ovo.model.CarreraDetalleModel;

import java.util.ArrayList;

public class DetalleCarreraActivity extends AppCompatActivity {

     private SectionsPagerAdapter mSectionsPagerAdapter;
     private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_carrera);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toolbar.setTitle(getIntent().getStringExtra("titulo"));

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);


        for (CarreraDetalleModel deta : detalle()) {
            tabLayout.addTab(tabLayout.newTab().setText(deta.getNombre()));
        }

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));



    }



    public static class PlaceholderFragment extends Fragment {
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_detalle_carrera, container, false);
            TextView txtDetalle = rootView.findViewById(R.id.txtCardDetalle);
            TextView txtDuracion = rootView.findViewById(R.id.txtDuracion);
            Button btn_plan = rootView.findViewById(R.id.btnPlanEstudio);
            Button btn_mapa = rootView.findViewById(R.id.btnMapa);

            CarreraDetalleModel carr = detalle().get(getArguments().getInt(ARG_SECTION_NUMBER));
            txtDuracion.setText("Duración: "+carr.getDuracion());
            txtDetalle.setText(carr.getDetalle());

            btn_plan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(),PdfActivity.class);
                    getActivity().startActivity(i);
                }
            });

            btn_mapa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(getActivity(), MapsActivity.class);
                    getActivity().startActivity(i);
                }
            });

            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PlaceholderFragment.newInstance(position);
        }

        @Override
        public int getCount() {
           return detalle().size();
        }
    }
    
    private static ArrayList<CarreraDetalleModel> detalle()
    {
        ArrayList<CarreraDetalleModel> lista = new ArrayList<>();
        lista.add(new CarreraDetalleModel(1,"UNC","6 años",
                "La palabra arquitectura proviene del latín “architectura y significa arte de proyectar y construir edificios. Es una de las artes más antiguas cultivadas"));
        lista.add(new CarreraDetalleModel(2,"UCC","5 años","La palabra arquitectura proviene del latín “architectura y significa arte de proyectar y construir edificios. Es una de las artes más antiguas cultivadas"));
        
        return  lista;
    }
}
