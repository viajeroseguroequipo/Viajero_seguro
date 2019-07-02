package co.app.viajero.viajero_seguro.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import co.app.viajero.viajero_seguro.R;
import co.app.viajero.viajero_seguro.entidades.Pais;

/**
 * Created by tecno on 1/07/2019.
 */

public class PaisAdapter extends RecyclerView.Adapter<PaisAdapter.PaisHolder>{

        List<Pais> listaPais;

public PaisAdapter(List<Pais> listaPais) {
        this.listaPais = listaPais;
        }

@Override
public PaisHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.pais_list,parent,false);
        RecyclerView.LayoutParams layoutParams=new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new PaisHolder(vista);
        }

@Override
public void onBindViewHolder(PaisHolder holder, int position) {
   // holder.i.setText(listaPais.get(position).getCod().toString());
    holder.idPais.setText(listaPais.get(position).getPais().toString());
    holder.idMoneda.setText(listaPais.get(position).getIdioma().toString());
    holder.idPais.setText(listaPais.get(position).getMoneda().toString());
    holder.idRequisitos.setText(listaPais.get(position).getRequisitos().toString());
   /* holder.txtProfesion.setText(listaPais.get(position).getIda().toString());
    holder.txtProfesion.setText(listaPais.get(position).getIds().toString());
    holder.txtProfesion.setText(listaPais.get(position).getIdt().toString());
    holder.txtProfesion.setText(listaPais.get(position).getIdc().toString());
     */   }

@Override
public int getItemCount() {
        return listaPais.size();
        }

public class PaisHolder extends RecyclerView.ViewHolder{

    TextView idPais, idIdioma, idMoneda, idRequisitos;

    public PaisHolder(View itemView) {
        super(itemView);
        idPais= (TextView) itemView.findViewById(R.id.idPais);
        idIdioma= (TextView) itemView.findViewById(R.id.idIdioma);
        idMoneda= (TextView) itemView.findViewById(R.id.idMoneda);
        idRequisitos= (TextView) itemView.findViewById(R.id.idRequisitos);



    }
}


}

