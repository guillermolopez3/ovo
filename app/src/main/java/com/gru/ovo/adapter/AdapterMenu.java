package com.gru.ovo.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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
    public AdapterMenu(Activity activity, ArrayList<Integer> arrayList)
    {
        this.activity=activity;
        array=arrayList;
    }
    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.card_menu,parent,false);
        return new AdapterMenu.MenuHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuHolder holder, final int position) {
        int i = array.get(position);

        Picasso.with(activity).load(i).into(holder.imagen);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuSeleccionado(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return array.size();
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

    class MenuHolder extends RecyclerView.ViewHolder
    {
        ImageView   imagen;
        CardView    cardView;
        public MenuHolder(View itemView) {
            super(itemView);
            imagen   = (ImageView) itemView.findViewById(R.id.itemMenuSrc);
            cardView = (CardView) itemView.findViewById(R.id.cardMenu);
        }
    }
}
