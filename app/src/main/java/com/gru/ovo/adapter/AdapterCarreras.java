package com.gru.ovo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.github.ivbaranov.mli.MaterialLetterIcon;
import com.gru.ovo.R;
import com.gru.ovo.model.CarreraModel;
import com.gru.ovo.view.DetalleCarreraActivity;
import com.gru.ovo.view.IngresoCarreraActivity;

import java.util.ArrayList;

public class AdapterCarreras extends RecyclerView.Adapter<AdapterCarreras.CarrerasViewHolder>
{
    ArrayList<CarreraModel> data;
    Activity activity;
    int posicion_color=0; //valores para que al llegar al final del array de colores vuelva a iniciar el array y pintar nuevamente con los colores
    private int array_colores[];

    public AdapterCarreras(ArrayList<CarreraModel> data,Activity activity)
    {
        this.data = data;
        this.activity = activity;
        array_colores = activity.getResources().getIntArray(R.array.borde_color); //traigo el array de colores de colors
    }
    @Override
    public CarrerasViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_carreras,parent,false);
        return new CarrerasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarrerasViewHolder holder, final int position) {
        final CarreraModel model = data.get(position);

        holder.texto.setText(model.getNombre());
        holder.icon.setLetter(model.getNombre());
        holder.icon.setShapeColor(colorBorde());

        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity,IngresoCarreraActivity.class);
                i.putExtra("titulo",model.getNombre());
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
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

    class CarrerasViewHolder extends RecyclerView.ViewHolder
    {
        LinearLayout linear;
        MaterialLetterIcon icon;
        TextView texto;
        public CarrerasViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.inicialCarrera);
            texto = itemView.findViewById(R.id.txtItemCarrera);
            linear = itemView.findViewById(R.id.linearItem);
        }
    }
}
