package co.app.viajero.viajero_seguro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ver_informacion extends AppCompatActivity {


    Button buttonr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_informacion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String idPais ="";
        String idIdioma ="";
        String idMoneda ="";
        String idRequisitos  ="";


        Bundle extras = getIntent().getExtras();
        if (extras!=null)
        {
            idPais = extras.getString("idPais");
            idIdioma = extras.getString("idIdioma");
            idMoneda = extras.getString("idMoneda");
            idRequisitos = extras.getString("idRequisitos");
        }


        TextView txt_view = (TextView) findViewById(R.id.txt_view);
        txt_view.setText(idPais);

        TextView txt_view1 = (TextView) findViewById(R.id.txt_view1);
        txt_view1.setText(idIdioma);

        TextView txt_view2 = (TextView) findViewById(R.id.txt_view2);
        txt_view2.setText(idMoneda);

        TextView txt_view3 = (TextView) findViewById(R.id.txt_view3);
        txt_view3.setText(idRequisitos);

        buttonr  = (Button) findViewById(R.id.Regresar);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //Para regresar a la vista anterior

            }
        });

    }

}
