package com.gru.ovo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gru.ovo.view.MenuTabActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private long splashDelay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //Intent mainIntent = new Intent().setClass(Splash.this,NuevaSeleccioonActivity.class);
                Intent mainIntent = new Intent().setClass(SplashActivity.this,MenuTabActivity.class);
                startActivity(mainIntent);
                finish();//Destruimos esta activity para prevenit que el usuario retorne aqui presionando el boton Atras.
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, splashDelay);//Pasado los 3 segundos dispara la tarea
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
