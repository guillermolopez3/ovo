package com.gru.ovo.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gru.ovo.R;
import com.gru.ovo.model.BecasModel;
import com.gru.ovo.model.NoticiaModel;

import java.util.ArrayList;

public class AdapterBecas extends RecyclerView.Adapter<AdapterBecas.BecasHolder>
{
    Activity activity;
    ArrayList<BecasModel> model;

    public AdapterBecas(Activity activity, ArrayList<BecasModel> model)
    {
        this.activity = activity;
        this.model = model;
    }

    @Override
    public BecasHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.card_becas,parent,false);
        return new BecasHolder(view);
    }

    @Override
    public void onBindViewHolder(BecasHolder holder, int position)
    {
        BecasModel data = model.get(position);

        holder.titulo.setText(data.getNombre());
        holder.detalle.setText(data.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    class BecasHolder extends RecyclerView.ViewHolder
    {
        TextView titulo, detalle;

        public BecasHolder(View itemView) {
            super(itemView);

            titulo  = itemView.findViewById(R.id.titulocardNoticia);
            detalle = itemView.findViewById(R.id.descripcionCardNoticia);
        }
    }
}
