package com.example.mihorariouniversitario;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;

import java.util.Objects;
import java.util.zip.CheckedInputStream;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout fondo;
    private Switch  tema;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true) ;
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        fondo=(ConstraintLayout)  findViewById(R.id.fondo);
        tema= findViewById(R.id.switch1 );

    }

    public void eventoClick(View view){

        if (tema.isChecked() ){
            fondo.setBackgroundColor(Color.BLACK);
        }else {
            fondo.setBackgroundColor(Color.WHITE );
        }


    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    }


