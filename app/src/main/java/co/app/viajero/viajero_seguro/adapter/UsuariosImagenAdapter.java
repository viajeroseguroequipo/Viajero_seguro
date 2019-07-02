package co.app.viajero.viajero_seguro.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.Ver_informacion;
import co.app.viajero.viajero_seguro.entidades.Usuario;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaUsuarioImagenUrlFragment;

/**/

public class UsuariosImagenAdapter extends RecyclerView.Adapter<UsuariosImagenAdapter.UsuariosHolder>{

    List<Usuario> listaUsuarios;

    public UsuariosImagenAdapter(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public UsuariosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.usuarios_list_image,parent,false);
        RecyclerView.LayoutParams layoutParams=new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new UsuariosHolder(vista);
    }

    @Override
    public void onBindViewHolder(UsuariosHolder holder, int position) {
        holder.campoNombre.setText(listaUsuarios.get(position).getNombre().toString());
        holder.campoEmail.setText(listaUsuarios.get(position).getEmail().toString());
        holder.campoNacionalidad.setText(listaUsuarios.get(position).getNacionalidad().toString());

        if (listaUsuarios.get(position).getImagen()!=null){
            holder.imagen.setImageBitmap(listaUsuarios.get(position).getImagen());
        }else{
            holder.imagen.setImageResource(R.drawable.img_base);
        }

        final View.OnClickListener b7OnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Do something
            }
        };
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuariosHolder extends RecyclerView.ViewHolder{

        TextView campoNombre,campoEmail,campoNacionalidad;
        ImageView imagen;

        public UsuariosHolder(View itemView) {
            super(itemView);
            campoNombre= (TextView) itemView.findViewById(R.id.campoNombre);
            campoEmail= (TextView) itemView.findViewById(R.id.campoEmail);
            campoNacionalidad= (TextView) itemView.findViewById(R.id.campoNacionalidad);
            imagen=(ImageView) itemView.findViewById(R.id.idImagen);



        }

        }



}
