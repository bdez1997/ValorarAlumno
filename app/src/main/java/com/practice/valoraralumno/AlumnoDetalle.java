package com.practice.valoraralumno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class AlumnoDetalle extends AppCompatActivity {
    public static RatingBar starScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno_detalle);

        ImageView imageViewAlumnado = findViewById(R.id.imageViewAlumnado);
        TextView txtNombreDetalle = (TextView) findViewById(R.id.txtNombreDetalle);
        TextView txtGrupoDetalle = (TextView) findViewById(R.id.txtGrupoDetalle);
        starScore = (RatingBar) findViewById(R.id.starScore);

        imageViewAlumnado.setImageResource(AlumnoAdapter.imagesIdArr[Clase.AlumnoSelected]);
        txtNombreDetalle.setText(Clase.lstAlumnos.get(Clase.AlumnoSelected).getsNombre());
        txtGrupoDetalle.setText(Clase.lstAlumnos.get(Clase.AlumnoSelected).getsGrado());
        starScore.setRating(Clase.lstAlumnos.get(Clase.AlumnoSelected).getiStars());


        starScore.setOnRatingBarChangeListener((RatingBar ratingBar, float v, boolean b) -> {
            Clase.lstAlumnos.get(Clase.AlumnoSelected).setiStars(v);
        });


    }
}