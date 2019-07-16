package co.app.viajero.viajero_seguro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import co.app.viajero.viajero_seguro.fragments.BienvenidaFragment;
import co.app.viajero.viajero_seguro.fragments.ConsultaListaCiudadImagenUrlFragment;

public class Ver_informacion_ciudad extends AppCompatActivity  {



    Button buttonr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_informacion_ciudad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String c1 = "";
        String c2 = "";
        String c3 = "";
        String c4 = "";
        String c5 = "";
        String c6 ="";


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            c1 = extras.getString("c1");
            c2 = extras.getString("c2");
            c3 = extras.getString("c3");
            c4 = extras.getString("c4");
            c5 = extras.getString("c5");
            c6 = extras.getString("c6");
        }



       TextView txt_view = (TextView) findViewById(R.id.txt_view);
        txt_view.setText(c1);

        TextView txt_view1 = (TextView) findViewById(R.id.txt_view1);
        txt_view1.setText(c2);

        TextView txt_view2 = (TextView) findViewById(R.id.txt_view2);
        txt_view2.setText(c3);

        TextView txt_view3 = (TextView) findViewById(R.id.txt_view3);
        txt_view3.setText(c4);

        TextView txt_view4 = (TextView) findViewById(R.id.txt_view4);
        txt_view4.setText(c5);
        /*
        TextView txt_view5 = (TextView) findViewById(R.id.txt_view5);
        txt_view5.setText(c7);
*/



        buttonr  = (Button) findViewById(R.id.Regresar);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //Para regresar a la vista anterior

                //Intent i = new Intent(DosActivity.this, SplashActivity.class);  //Para ir a una vista específica
                //startActivity(i);
            }
        });
    }




    }
