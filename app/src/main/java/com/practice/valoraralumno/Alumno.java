package com.practice.valoraralumno;

import android.widget.ImageView;

public class Alumno {

    private String sNombre;
    private String sGrado;
    private float iStars;
    private ImageView imagen;

    public Alumno(String sNombre, String sGrado, float iStars) {

        setsNombre(sNombre);
        setsGrado(sGrado);
        setiStars(iStars);

    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsGrado() {
        return sGrado;
    }

    public void setsGrado(String sGrado) {
        this.sGrado = sGrado;
    }

    public float getiStars() {
        return iStars;
    }

    public void setiStars(float iStars) {
        this.iStars = iStars;
    }

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "sNombre='" + sNombre + '\'' +
                ", sGrado='" + sGrado + '\'' +
                ", iStars=" + iStars +
                '}';
    }
}
