package co.app.viajero.viajero_seguro.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.entidades.Usuario;

/**/
public class UsuariosAdapter extends RecyclerView.Adapter<UsuariosAdapter.UsuariosHolder>{

    List<Usuario> listaUsuarios;

    public UsuariosAdapter(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @Override
    public UsuariosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.usuarios_list,parent,false);
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
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuariosHolder extends RecyclerView.ViewHolder{

        TextView campoNombre,campoEmail,campoNacionalidad;

        public UsuariosHolder(View itemView) {
            super(itemView);
            campoNombre= (TextView) itemView.findViewById(R.id.campoNombre);
            campoEmail= (TextView) itemView.findViewById(R.id.campoEmail);
            campoNacionalidad= (TextView) itemView.findViewById(R.id.campoNacionalidad);



        }
    }


}
