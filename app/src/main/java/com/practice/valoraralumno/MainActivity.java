package com.practice.valoraralumno;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chargeData();
        mostrarData();

    }

    private void mostrarData(){

        RecyclerView recyclerView = findViewById(R.id.reciclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        AlumnoAdapter adaptadorAlumno = new AlumnoAdapter(this);

        recyclerView.setAdapter(adaptadorAlumno);

        adaptadorAlumno.setOnClickListener(view ->{
            Clase.AlumnoSelected = recyclerView.getChildAdapterPosition(view);
            Toast.makeText(this,"Item"+Clase.lstAlumnos.get(Clase.AlumnoSelected).getsNombre(),Toast.LENGTH_SHORT).show();

            Intent i = new Intent(this,AlumnoDetalle.class);
            startActivity(i);
        });


    }

    private void chargeData(){

        Clase.lstAlumnos.add(new Alumno("Antonio José","Desarrollo de Aplicaciones Multiplataforma",4));
        Clase.lstAlumnos.add(new Alumno("Rubén Ruda","Desarrollo de Aplicaciones Web",3));


    }
}