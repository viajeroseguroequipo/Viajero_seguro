package co.app.viajero.viajero_seguro.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import java.util.List;
import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.Ver_informacion;
import co.app.viajero.viajero_seguro.entidades.Usuario;
import co.app.viajero.viajero_seguro.entidades.VolleySingleton;

/**/

public class UsuariosImagenUrlAdapter extends RecyclerView.Adapter<UsuariosImagenUrlAdapter.UsuariosHolder> {

    List<Usuario> listaUsuarios;
    //  RequestQueue request;
    Context context;
    Button b7OnClickListener;


    public UsuariosImagenUrlAdapter(List<Usuario> listaUsuarios, Context context) {
        this.listaUsuarios = listaUsuarios;
        this.context = context;


        //  request= Volley.newRequestQueue(context);
    }

    @Override
    public UsuariosHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.usuarios_list_image, parent, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new UsuariosHolder(vista);


    }

    @Override
    public void onBindViewHolder(UsuariosHolder holder, int position) {
        holder.campoNombre.setText(listaUsuarios.get(position).getNombre().toString());
        holder.campoEmail.setText(listaUsuarios.get(position).getEmail().toString());
        holder.campoNacionalidad.setText(listaUsuarios.get(position).getNacionalidad().toString());


        if (listaUsuarios.get(position).getRutaImagen() != null) {
            //
            cargarImagenWebService(listaUsuarios.get(position).getRutaImagen(), holder);
        } else {
            holder.imagen.setImageResource(R.drawable.img_base);
        }

        holder.setOnclicklisteners();
    }


    private void cargarImagenWebService(String rutaImagen, final UsuariosHolder holder) {

        String ip = context.getString(R.string.ip);

        String urlImagen = ip + "archivos/ejemploBDRemota/" + rutaImagen;
        urlImagen = urlImagen.replace(" ", "%20");

        ImageRequest imageRequest = new ImageRequest(urlImagen, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap response) {
                holder.imagen.setImageBitmap(response);
            }
        }, 0, 0, ImageView.ScaleType.CENTER, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, "Error al cargar la imagen", Toast.LENGTH_SHORT).show();
            }
        });
        //request.add(imageRequest);
        VolleySingleton.getIntanciaVolley(context).addToRequestQueue(imageRequest);
    }


    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }


    public class UsuariosHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView campoNombre,campoEmail,campoNacionalidad;
        ImageView imagen;
        Context context;
        Button b7OnClickListener;

        public UsuariosHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            campoNombre= (TextView) itemView.findViewById(R.id.campoNombre);
            campoEmail= (TextView) itemView.findViewById(R.id.campoEmail);
            campoNacionalidad= (TextView) itemView.findViewById(R.id.campoNacionalidad);
            imagen = (ImageView) itemView.findViewById(R.id.idImagen);
            b7OnClickListener = (Button) itemView.findViewById(R.id.b7OnClickListener);


        }

        void setOnclicklisteners() {
            b7OnClickListener.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.b7OnClickListener:
                    Intent intent = new Intent(context, Ver_informacion.class);
                    intent.putExtra("campoNombre",campoNombre.getText());
                    intent.putExtra("campoEmail",campoEmail.getText());

                    context.startActivity(intent);
                    break;
            }
        }


    }
}
