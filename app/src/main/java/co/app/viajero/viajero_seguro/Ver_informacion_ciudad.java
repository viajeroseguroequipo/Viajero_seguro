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
        String c7 ="";
        String c8  ="";
        String c9 ="";
        String c10 ="";
        String c11 ="";
        String c12  ="";
        String c13 ="";
        String c14 ="";
        String c15 ="";
        String c16  ="";
        String c17 ="";
        String c18 ="";


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            c1 = extras.getString("c1");
            c2 = extras.getString("c2");
            c3 = extras.getString("c3");
            c4 = extras.getString("c4");
            c5 = extras.getString("c5");
            c6 = extras.getString("c6");
            c7 = extras.getString("c7");
            c8 = extras.getString("c8");
            c9 = extras.getString("c9");
            c10 = extras.getString("c10");
            c11 = extras.getString("c11");
            c12 = extras.getString("c12");
            c13 = extras.getString("c13");
            c14 = extras.getString("c14");
            c15 = extras.getString("c15");
            c16 = extras.getString("c16");
            c17 = extras.getString("c17");
            c18 = extras.getString("c18");
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

        TextView txt_view5 = (TextView) findViewById(R.id.txt_view5);
        txt_view5.setText(c7);

        TextView txt_view05 = (TextView) findViewById(R.id.txt_view05);
        txt_view05.setText(c8);

        TextView txt_view051 = (TextView) findViewById(R.id.txt_view051);
        txt_view051.setText(c9);

        TextView txt_view052 = (TextView) findViewById(R.id.txt_view052);
        txt_view052.setText(c10);

        TextView txt_view6 = (TextView) findViewById(R.id.txt_view6);
        txt_view6.setText(c11);

        TextView txt_view06 = (TextView) findViewById(R.id.txt_view06);
        txt_view06.setText(c12);

        TextView txt_view061 = (TextView) findViewById(R.id.txt_view061);
        txt_view061.setText(c13);

        TextView txt_view062 = (TextView) findViewById(R.id.txt_view062);
        txt_view062.setText(c14);


        TextView txt_view7 = (TextView) findViewById(R.id.txt_view7);
        txt_view7.setText(c15);

        TextView txt_view07 = (TextView) findViewById(R.id.txt_view07);
        txt_view07.setText(c16);

        TextView txt_view071 = (TextView) findViewById(R.id.txt_view071);
        txt_view071.setText(c17);

        TextView txt_view072 = (TextView) findViewById(R.id.txt_view072);
        txt_view072.setText(c18);

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
