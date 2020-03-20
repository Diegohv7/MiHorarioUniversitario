package com.example.mihorariouniversitario;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;

import java.util.ArrayList;

public class Horario extends AppCompatActivity {
    private TableLayout tableLayout;
    private EditText txtName;
    private EditText txtLastName;
    private String[]header={"Id","Nombre","Apellido"};
    private ArrayList  <String[]>rows=new ArrayList<>() ;//filas
    private tablehorario tablehorario ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
        tableLayout =(TableLayout)findViewById(R.id.table );
        txtName =(EditText)findViewById(R.id.txtName );
        txtName =(EditText)findViewById(R.id.txtLastName );

          tablehorario=new tablehorario(tableLayout ,getApplicationContext() );
        tablehorario .addHeader(header ) ;
        tablehorario .addData(getmateria() );
        tablehorario .backgroundHeader(Color.BLUE) ;
        tablehorario .backgroundData(Color.RED ,Color.YELLOW ) ;
        tablehorario .LineColor(Color.BLACK );
        tablehorario.txtColorData(Color.WHITE );
        tablehorario .txtColorHeader(Color.MAGENTA);

    }
    public void save(View view){
        String[]item=new String[]{"5",txtName .getText() .toString() ,txtLastName .getText() .toString() };
        tablehorario .addItems(item);
    }
    private ArrayList <String[]> getmateria(){
        rows.add(new String[]{"1","prueba","prueba"});
        rows.add(new String[]{"2","prueba","prueba"});
        rows.add(new String[]{"3","prueba","prueba"});
        rows.add(new String[]{"4","prueba","prueba"});
        return rows;

    }
}
