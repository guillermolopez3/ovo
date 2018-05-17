package com.gru.ovo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.view.CarrerasActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by guill on 12/03/2018.
 */

public class AdapterMenu extends RecyclerView.Adapter<AdapterMenu.MenuHolder>
{
    Activity activity;
    ArrayList<Integer> array;
    ArrayList<String> nombres;
    int posicion_color=0; //valores para que al llegar al final del array de colores vuelva a iniciar el array y pintar nuevamente con los colores
    int posicion_color_fondo=0;
    private int array_colores[];
    private int array_fondo[];

    public AdapterMenu(Activity activity, ArrayList<String> arrayList)
    {
        this.activity=activity;
        //array=arrayList;
        this.nombres=arrayList;
        //array_colores = activity.getResources().getIntArray(R.array.borde_color); //traigo el array de colores de colors
        array_colores = activity.getResources().getIntArray(R.array.nuevo_borde); //traigo el array de colores de colors
        array_fondo = activity.getResources().getIntArray(R.array.color_fondo); //traigo el array de colores de colors
    }
    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //View view = LayoutInflater.from(activity).inflate(R.layout.card_menu_imagen,parent,false);
        View view = LayoutInflater.from(activity).inflate(R.layout.card_menu_texto,parent,false);
        return new AdapterMenu.MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuHolder holder, final int position) {
        //int i = array.get(position);
        String i = nombres.get(position);

        //Picasso.with(activity).load(i).into(holder.imagen);
        holder.texto.setText(i);



        holder.bordeColor.setBackgroundColor(colorBorde());
        holder.cardView.setBackgroundColor(colorFondo());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuSeleccionado(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        //return array.size();
        return nombres.size();
    }

    private void menuSeleccionado(int position)
    {
        Intent i;
        switch (position){
            case 0:
                i = new Intent(activity,CarrerasActivity.class);
                i.putExtra("categoria","arqui");
                i.putExtra("title",activity.getResources().getString(R.string.arqui));
                activity.startActivity(i);
                break;
            case 3:
                break;
            case 4:
                break;
            case 1:
               break;
            case 2:
                 break;
            case 5:
                  break;
        }
    }

    private int colorBorde()
    {
        int m_color;
        int leng_array_color= array_colores.length;

        if(posicion_color<=leng_array_color -1)
        {
            m_color= array_colores[posicion_color];
            posicion_color++;
        }
        else {
            posicion_color=0;
            m_color= array_colores[posicion_color];
        }
        return m_color;
    }

    private int colorFondo()
    {
        int m_color;
        int leng_array_color= array_fondo.length;

        if(posicion_color_fondo<=leng_array_color -1)
        {
            m_color= array_fondo[posicion_color_fondo];
            posicion_color_fondo++;
        }
        else {
            posicion_color_fondo=0;
            m_color= array_fondo[posicion_color_fondo];
        }
        return m_color;
    }

    class MenuHolder extends RecyclerView.ViewHolder
    {
        ImageView   imagen;
        TextView    texto;
        CardView    cardView;
        FrameLayout bordeColor;
        public MenuHolder(View itemView) {
            super(itemView);
            //imagen   =  itemView.findViewById(R.id.itemMenuSrc);
            texto       = itemView.findViewById(R.id.txtCarrera);
            cardView    = itemView.findViewById(R.id.cardMenu);
            bordeColor  = itemView.findViewById(R.id.bordeColor);


        }
    }
}
