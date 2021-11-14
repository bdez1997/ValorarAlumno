package com.practice.valoraralumno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlumnoAdapter extends RecyclerView.Adapter<AlumnoAdapter.ViewHolder> implements View.OnClickListener{

    LayoutInflater inflater;
    Context context;
    public static int imagesIdArr[]= new int[] {R.drawable.a1,R.drawable.a2};

    private View.OnClickListener listener;

    public AlumnoAdapter(Context context) {
        inflater=LayoutInflater.from(context);
        this.context = context;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }



    public AlumnoAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View view = inflater.inflate(R.layout.alumno_lista,parent,false);
        view.setOnClickListener((View.OnClickListener) this);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String strNombre=Clase.lstAlumnos.get(position).getsNombre();
        String strGrado=Clase.lstAlumnos.get(position).getsGrado();
        ImageView imageView=Clase.lstAlumnos.get(position).getImagen();

        holder.lblNombre.setText(strNombre);
        holder.lblGrado.setText(strGrado);
        holder.imgAlumno.setImageResource(imagesIdArr[position]);
        Clase.lstAlumnos.get(position).setImagen(holder.imgAlumno);

    }


    @Override
    public int getItemCount() {
        return Clase.lstAlumnos.size();
    }

    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }
    }
    public void onClick(View.OnClickListener listener){this.listener=listener;}

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView lblNombre;
        TextView lblGrado;
        ImageView imgAlumno;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgAlumno=itemView.findViewById(R.id.imgAlumno);
            lblNombre = itemView.findViewById(R.id.lblNombre);
            lblGrado = itemView.findViewById(R.id.lblGrado);

        }
    }


}
