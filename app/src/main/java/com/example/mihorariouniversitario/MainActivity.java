package com.example.mihorariouniversitario;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    private RelativeLayout fondo;
    private Switch tema;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        fondo = (RelativeLayout) findViewById(R.id.fondo);
        tema = findViewById(R.id.switch1);
    }

    //cambiar tema
    public void eventoClick(View view) {
        if (tema.isChecked()) {
            fondo.setBackgroundColor(Color.BLACK);
        } else {
            fondo.setBackgroundColor(Color.WHITE);
        }
    }

    //llamar a activity ver horario
    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, Horario.class);
        startActivity(siguiente);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

}


