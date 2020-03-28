package com.example.mihorariouniversitario;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CalendarView;

public class AgendaActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {


    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);


        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(this);
    }

    @Override
    public void onSelectedDayChange(CalendarView calendarView, int i, int i1, int i2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        CharSequence []items = new CharSequence[3];
        items[0] = "Agregar eventos";
        items[1] = "Ver eventos";
        items[2] = "Cancelar";

        final int dia, mes, año;
        int mes1;
        dia = i;
        mes1 = i1;
        año = i2;
        mes1++;

        mes = mes1;
        builder.setTitle("Seleccione una tarea")
                .setItems(items, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialoginterface, int i) {
                        if (i == 0) {
                            Intent intent = new Intent(getApplication(), AddeventosActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("día", dia);
                            bundle.putInt("mes", mes);
                            bundle.putInt("año", año);
                            intent.putExtras(bundle);
                            startActivity(intent);

                        } else if (i == 1) {
                            Intent intent = new Intent(getApplication(), ListeventosActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("día", dia);
                            bundle.putInt("mes", mes);
                            bundle.putInt("año", año);
                            intent.putExtras(bundle);
                            startActivity(intent);

                        } else {
                            return;
                        }
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
