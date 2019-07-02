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
import co.app.viajero.viajero_seguro.Ver_informacion_ciudad;
import co.app.viajero.viajero_seguro.entidades.Ciudad;
import co.app.viajero.viajero_seguro.entidades.VolleySingleton;

/**
 * Created by tecno on 1/07/2019.
 */

public class CiudadImagenUrlAdapter extends RecyclerView.Adapter<CiudadImagenUrlAdapter.CiudadHolder> {

    List<Ciudad> listaCiudad;
    //  RequestQueue request;
    Context context;
    Button b7OnClickListener;


    public CiudadImagenUrlAdapter(List<Ciudad> listaCiudad, Context context) {
        this.listaCiudad = listaCiudad;
        this.context = context;


        //  request= Volley.newRequestQueue(context);
    }

    @Override
    public CiudadImagenUrlAdapter.CiudadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.ciudad_list_image, parent, false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new CiudadImagenUrlAdapter.CiudadHolder(vista);


    }

    @Override
    public void onBindViewHolder(CiudadImagenUrlAdapter.CiudadHolder holder, int position) {
       // holder.idCiudad.setText(listaCiudad.get(position).getCiudad().toString());
        holder.c1.setText(listaCiudad.get(position).getC1().toString());
        holder.c2.setText(listaCiudad.get(position).getC2().toString());
        holder.c3.setText(listaCiudad.get(position).getC3().toString());
        holder.c4.setText(listaCiudad.get(position).getC4().toString());
        holder.c5.setText(listaCiudad.get(position).getC5().toString());
        holder.c6.setText(listaCiudad.get(position).getC6().toString());
        holder.c7.setText(listaCiudad.get(position).getC7().toString());
        holder.c8.setText(listaCiudad.get(position).getC8().toString());
        holder.c9.setText(listaCiudad.get(position).getC9().toString());
        holder.c10.setText(listaCiudad.get(position).getC10().toString());
        holder.c11.setText(listaCiudad.get(position).getC11().toString());
        holder.c12.setText(listaCiudad.get(position).getC12().toString());
        holder.c13.setText(listaCiudad.get(position).getC13().toString());
        holder.c14.setText(listaCiudad.get(position).getC14().toString());
        holder.c15.setText(listaCiudad.get(position).getC15().toString());
        holder.c16.setText(listaCiudad.get(position).getC16().toString());
        holder.c17.setText(listaCiudad.get(position).getC17().toString());
        holder.c18.setText(listaCiudad.get(position).getC18().toString());



        if (listaCiudad.get(position).getRutaImagen() != null) {
            //
            cargarImagenWebService(listaCiudad.get(position).getRutaImagen(), holder);
        } else {
            holder.imagen.setImageResource(R.drawable.img_base);
        }

        holder.setOnclicklisteners();
    }


    private void cargarImagenWebService(String rutaImagen, final CiudadImagenUrlAdapter.CiudadHolder holder) {

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
        return listaCiudad.size();
    }


    public class CiudadHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18;
        ImageView imagen;
        Context context;
        Button b7OnClickListener;

        public CiudadHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
           // idCiudad = (TextView) itemView.findViewById(R.id.idCiudad);
            c1= (TextView) itemView.findViewById(R.id.c1);
            c2= (TextView) itemView.findViewById(R.id.c2);
            c3= (TextView) itemView.findViewById(R.id.c3);
            c4= (TextView) itemView.findViewById(R.id.c4);
            c5= (TextView) itemView.findViewById(R.id.c5);
            c6= (TextView) itemView.findViewById(R.id.c6);
            c7= (TextView) itemView.findViewById(R.id.c7);
            c8= (TextView) itemView.findViewById(R.id.c8);
            c9= (TextView) itemView.findViewById(R.id.c9);
            c10= (TextView) itemView.findViewById(R.id.c10);
            c11= (TextView) itemView.findViewById(R.id.c11);
            c12= (TextView) itemView.findViewById(R.id.c12);
            c13= (TextView) itemView.findViewById(R.id.c13);
            c14= (TextView) itemView.findViewById(R.id.c14);
            c15= (TextView) itemView.findViewById(R.id.c15);
            c16= (TextView) itemView.findViewById(R.id.c16);
            c17= (TextView) itemView.findViewById(R.id.c17);
            c18= (TextView) itemView.findViewById(R.id.c18);

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
                    Intent intent = new Intent(context, Ver_informacion_ciudad.class);
                    intent.putExtra("c1",c1.getText());
                    intent.putExtra("c2",c2.getText());
                    intent.putExtra("c3",c3.getText());
                    intent.putExtra("c4",c4.getText());
                    intent.putExtra("c5",c5.getText());
                    intent.putExtra("c6",c6.getText());
                    intent.putExtra("c7",c7.getText());
                    intent.putExtra("c8",c8.getText());
                    intent.putExtra("c9",c9.getText());
                    intent.putExtra("c10",c10.getText());
                    intent.putExtra("c11",c11.getText());
                    intent.putExtra("c12",c12.getText());
                    intent.putExtra("c13",c13.getText());
                    intent.putExtra("c14",c14.getText());
                    intent.putExtra("c15",c15.getText());
                    intent.putExtra("c16",c16.getText());
                    intent.putExtra("c17",c17.getText());
                    intent.putExtra("c18",c18.getText());

                    context.startActivity(intent);
                    break;
            }
        }


    }
}


