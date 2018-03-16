package com.gru.ovo.helpers;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.gru.ovo.R;

/**
 * Created by guill on 14/03/2018.
 */

public class MetodosComunes
{
    public static void showToolbar(String tittle, boolean upButton, AppCompatActivity activity)
    {
        Toolbar toolbar = activity.findViewById(R.id.toolbar);
        activity.setSupportActionBar(toolbar);
        activity.getSupportActionBar().setTitle(tittle);
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
