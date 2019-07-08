package co.app.viajero.viajero_seguro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ver_informacion_sitios extends AppCompatActivity {


    Button buttonr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_informacion_sitios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



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


        TextView txt_view5 = (TextView) findViewById(R.id.txt_view5);
        txt_view5.setText(c7);

        TextView txt_view05 = (TextView) findViewById(R.id.txt_view05);
        txt_view05.setText(c8);

        TextView txt_view051 = (TextView) findViewById(R.id.txt_view051);
        txt_view051.setText(c9);

        TextView txt_view052 = (TextView) findViewById(R.id.txt_view052);
        txt_view052.setText(c10);

        TextView txt_view053 = (TextView) findViewById(R.id.txt_view053);
        txt_view053.setText(c11);

        TextView txt_view054 = (TextView) findViewById(R.id.txt_view054);
        txt_view054.setText(c12);

        TextView txt_view055 = (TextView) findViewById(R.id.txt_view055);
        txt_view055.setText(c13);

        TextView txt_view056 = (TextView) findViewById(R.id.txt_view056);
        txt_view056.setText(c14);


        TextView txt_view057 = (TextView) findViewById(R.id.txt_view057);
        txt_view057.setText(c15);

        TextView txt_view058 = (TextView) findViewById(R.id.txt_view058);
        txt_view058.setText(c16);

        TextView txt_view059 = (TextView) findViewById(R.id.txt_view059);
        txt_view059.setText(c17);

        TextView txt_view060 = (TextView) findViewById(R.id.txt_view060);
        txt_view060.setText(c18);

        buttonr  = (Button) findViewById(R.id.Regresar);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //Para regresar a la vista anterior

            }
        });
    }

}
