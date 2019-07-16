package co.app.viajero.viajero_seguro.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.entidades.Ciudad;

/**
 * Created by tecno on 1/07/2019.
 */

public class CiudadAdapter {

    List<Ciudad> listaCiudad;

    public CiudadAdapter(List<Ciudad> listaCiudad) {
        this.listaCiudad = listaCiudad;
    }


    public CiudadAdapter.CiudadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.ciudad_list,parent,false);
        RecyclerView.LayoutParams layoutParams=new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new CiudadAdapter.CiudadHolder(vista);
    }


    public void onBindViewHolder(CiudadAdapter.CiudadHolder holder, int position) {
        // holder.i.setText(listaCiudad.get(position).getCod().toString());
     //   holder.idCiudad.setText(listaCiudad.get(position).getCiudad().toString());
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

    }


    public int getItemCount() {
        return listaCiudad.size();
    }

    public class CiudadHolder extends RecyclerView.ViewHolder{

        TextView c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28, c29, c30, c31, c32, c33, c34;

        public CiudadHolder(View itemView) {
            super(itemView);

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




        }
    }


}

