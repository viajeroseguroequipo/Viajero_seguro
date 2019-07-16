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
import co.app.viajero.viajero_seguro.Ver_informacion_alojamiento;
import co.app.viajero.viajero_seguro.Ver_informacion_ciudad;
import co.app.viajero.viajero_seguro.Ver_informacion_sitios;
import co.app.viajero.viajero_seguro.Ver_informacion_trasnporte;
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
        holder.c19.setText(listaCiudad.get(position).getC19().toString());
        holder.c20.setText(listaCiudad.get(position).getC20().toString());
        holder.c21.setText(listaCiudad.get(position).getC21().toString());
        holder.c22.setText(listaCiudad.get(position).getC22().toString());
        holder.c23.setText(listaCiudad.get(position).getC23().toString());
        holder.c24.setText(listaCiudad.get(position).getC24().toString());
        holder.c25.setText(listaCiudad.get(position).getC25().toString());
        holder.c26.setText(listaCiudad.get(position).getC26().toString());
        holder.c27.setText(listaCiudad.get(position).getC27().toString());
        holder.c28.setText(listaCiudad.get(position).getC28().toString());
        holder.c29.setText(listaCiudad.get(position).getC29().toString());
        holder.c30.setText(listaCiudad.get(position).getC30().toString());
        holder.c31.setText(listaCiudad.get(position).getC31().toString());
        holder.c32.setText(listaCiudad.get(position).getC32().toString());
        holder.c33.setText(listaCiudad.get(position).getC33().toString());
        holder.c34.setText(listaCiudad.get(position).getC34().toString());



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

        TextView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34;
        ImageView imagen;
        Context context;
        Button b7OnClickListener,b8OnClickListener,b9OnClickListener,b10OnClickListener;

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
            c19= (TextView) itemView.findViewById(R.id.c19);
            c20= (TextView) itemView.findViewById(R.id.c20);
            c21= (TextView) itemView.findViewById(R.id.c21);
            c22= (TextView) itemView.findViewById(R.id.c22);
            c23= (TextView) itemView.findViewById(R.id.c23);
            c24= (TextView) itemView.findViewById(R.id.c24);
            c25= (TextView) itemView.findViewById(R.id.c25);
            c26= (TextView) itemView.findViewById(R.id.c26);
            c27= (TextView) itemView.findViewById(R.id.c27);
            c28= (TextView) itemView.findViewById(R.id.c28);
            c29= (TextView) itemView.findViewById(R.id.c29);
            c30= (TextView) itemView.findViewById(R.id.c30);
            c31= (TextView) itemView.findViewById(R.id.c31);
            c32= (TextView) itemView.findViewById(R.id.c32);
            c33= (TextView) itemView.findViewById(R.id.c33);
            c34= (TextView) itemView.findViewById(R.id.c34);

            imagen = (ImageView) itemView.findViewById(R.id.idImagen);
            b7OnClickListener = (Button) itemView.findViewById(R.id.b7OnClickListener);
            b8OnClickListener = (Button) itemView.findViewById(R.id.b8OnClickListener);
            b9OnClickListener = (Button) itemView.findViewById(R.id.b9OnClickListener);
            b10OnClickListener = (Button) itemView.findViewById(R.id.b10OnClickListener);


        }

        void setOnclicklisteners() {

            b7OnClickListener.setOnClickListener(this);
            b8OnClickListener.setOnClickListener(this);
            b9OnClickListener.setOnClickListener(this);
            b10OnClickListener.setOnClickListener(this);
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

                    context.startActivity(intent);
                    break;
                case R.id.b8OnClickListener:
                    Intent intent1 = new Intent(context, Ver_informacion_sitios.class);
                    intent1.putExtra("c7",c7.getText());
                    intent1.putExtra("c8",c8.getText());
                    intent1.putExtra("c9",c9.getText());
                    intent1.putExtra("c10",c10.getText());
                    intent1.putExtra("c11",c11.getText());
                    intent1.putExtra("c12",c12.getText());
                    intent1.putExtra("c13",c13.getText());
                    intent1.putExtra("c14",c14.getText());
                    intent1.putExtra("c15",c15.getText());
                    intent1.putExtra("c16",c16.getText());
                    intent1.putExtra("c17",c17.getText());
                    intent1.putExtra("c18",c18.getText());

                    context.startActivity(intent1);
                    break;

                case R.id.b9OnClickListener:
                    Intent intent2 = new Intent(context, Ver_informacion_alojamiento.class);
                    intent2.putExtra("c19",c19.getText());
                    intent2.putExtra("c20",c20.getText());
                    intent2.putExtra("c21",c21.getText());
                    intent2.putExtra("c22",c22.getText());
                    intent2.putExtra("c23",c23.getText());
                    intent2.putExtra("c24",c24.getText());
                    intent2.putExtra("c25",c25.getText());
                    intent2.putExtra("c26",c26.getText());
                    intent2.putExtra("c27",c27.getText());
                    intent2.putExtra("c28",c28.getText());
                    intent2.putExtra("c29",c29.getText());
                    intent2.putExtra("c30",c30.getText());
                    context.startActivity(intent2);
                    break;



                case R.id.b10OnClickListener:
                    Intent intent3 = new Intent(context, Ver_informacion_trasnporte.class);
                    intent3.putExtra("c31",c31.getText());
                    intent3.putExtra("c32",c32.getText());
                    intent3.putExtra("c33",c33.getText());
                    intent3.putExtra("c34",c34.getText());
                    context.startActivity(intent3);
                    break;
            }
        }


    }
}


