package co.app.viajero.viajero_seguro.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import java.util.List;
import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.Ver_informacion;
import co.app.viajero.viajero_seguro.entidades.Pais;
import co.app.viajero.viajero_seguro.entidades.VolleySingleton;

/**
 * Created by tecno on 1/07/2019.
 */

public class PaisImagenUrlAdapter extends RecyclerView.Adapter<PaisImagenUrlAdapter.PaisHolder> {

    List<Pais> listaPais;
    //  RequestQueue request;
    Context context;
    Button b7OnClickListener;


    public PaisImagenUrlAdapter(List<Pais> listaPais, Context context) {
        this.listaPais = listaPais;
        this.context = context;


        //  request= Volley.newRequestQueue(context);
    }

    @Override
    public PaisImagenUrlAdapter.PaisHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.pais_list_image, parent, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new PaisImagenUrlAdapter.PaisHolder(vista);


    }

    @Override
    public void onBindViewHolder(PaisImagenUrlAdapter.PaisHolder holder, int position) {
        holder.idPais.setText(listaPais.get(position).getPais().toString());
        holder.idIdioma.setText(listaPais.get(position).getIdioma().toString());
        holder.idMoneda.setText(listaPais.get(position).getMoneda().toString());
        holder.idRequisitos.setText(listaPais.get(position).getRequisitos().toString());


        if (listaPais.get(position).getRutaImagen() != null) {
            //
            cargarImagenWebService(listaPais.get(position).getRutaImagen(), holder);
        } else {
            holder.imagen.setImageResource(R.drawable.img_base);
        }

        holder.setOnclicklisteners();
    }


    private void cargarImagenWebService(String rutaImagen, final PaisImagenUrlAdapter.PaisHolder holder) {

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
        return listaPais.size();
    }


    public class PaisHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView idPais, idIdioma, idMoneda, idRequisitos;
        ImageView imagen;
        Context context;
        Button b7OnClickListener;

        public PaisHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            idPais = (TextView) itemView.findViewById(R.id.idPais);
            idIdioma = (TextView) itemView.findViewById(R.id.idIdioma);
            idMoneda = (TextView) itemView.findViewById(R.id.idMoneda);
            idRequisitos = (TextView) itemView.findViewById(R.id.idRequisitos);
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
                    intent.putExtra("idPais",idPais.getText());
                    intent.putExtra("idIdioma",idIdioma.getText());
                    intent.putExtra("idMoneda",idMoneda.getText());
                    intent.putExtra("idRequisitos",idRequisitos.getText());

                    context.startActivity(intent);
                    break;
            }
        }


    }
}

