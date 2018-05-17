package com.gru.ovo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.model.NoticiaModel;
import com.gru.ovo.view.DetalleNoticiasActivity;

import java.util.ArrayList;

public class AdapterNoticia extends RecyclerView.Adapter<AdapterNoticia.NoticiaHolder>
{
    Activity activity;
    ArrayList<NoticiaModel> model;

    public AdapterNoticia(Activity activity,ArrayList<NoticiaModel> model)
    {
        this.activity = activity;
        this.model = model;
    }

    @Override
    public NoticiaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.card_noticias,parent,false);
        return new NoticiaHolder(view);
    }

    @Override
    public void onBindViewHolder(NoticiaHolder holder, int position)
    {
        final NoticiaModel data = model.get(position);

        holder.titulo.setText(data.getNombre());
        holder.detalle.setText(data.getDescripcion());

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity, DetalleNoticiasActivity.class);
                i.putExtra("data",data);
                activity.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class NoticiaHolder extends RecyclerView.ViewHolder
    {
        TextView titulo, detalle;
        CardView card;

        public NoticiaHolder(View itemView) {
            super(itemView);

            titulo  = itemView.findViewById(R.id.titulocardNoticia);
            detalle = itemView.findViewById(R.id.descripcionCardNoticia);
            card    = itemView.findViewById(R.id.cardRecursos);
        }
    }
}
