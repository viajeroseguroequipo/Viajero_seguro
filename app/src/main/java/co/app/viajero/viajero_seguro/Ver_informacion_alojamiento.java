package co.app.viajero.viajero_seguro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ver_informacion_alojamiento extends AppCompatActivity {


    Button buttonr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_informacion_alojamiento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        String c19 ="";
        String c20  ="";
        String c21 ="";
        String c22 ="";
        String c23 ="";
        String c24  ="";
        String c25 ="";
        String c26 ="";
        String c27 ="";
        String c28  ="";
        String c29 ="";
        String c30 ="";



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            c19 = extras.getString("c19");
            c20 = extras.getString("c20");
            c21 = extras.getString("c21");
            c22 = extras.getString("c22");
            c23 = extras.getString("c23");
            c24 = extras.getString("c24");
            c25 = extras.getString("c25");
            c26 = extras.getString("c26");
            c27 = extras.getString("c27");
            c28 = extras.getString("c28");
            c29 = extras.getString("c29");
            c30 = extras.getString("c30");
        }




        TextView txt_view6 = (TextView) findViewById(R.id.txt_view6);
        txt_view6.setText(c19);

        TextView txt_view06 = (TextView) findViewById(R.id.txt_view06);
        txt_view06.setText(c20);

        TextView txt_view061 = (TextView) findViewById(R.id.txt_view061);
        txt_view061.setText(c21);

        TextView txt_view062 = (TextView) findViewById(R.id.txt_view062);
        txt_view062.setText(c22);

        TextView txt_view063 = (TextView) findViewById(R.id.txt_view063);
        txt_view063.setText(c23);

        TextView txt_view064 = (TextView) findViewById(R.id.txt_view064);
        txt_view064.setText(c24);

        TextView txt_view065 = (TextView) findViewById(R.id.txt_view065);
        txt_view065.setText(c25);

        TextView txt_view066 = (TextView) findViewById(R.id.txt_view066);
        txt_view066.setText(c26);


        TextView txt_view067 = (TextView) findViewById(R.id.txt_view067);
        txt_view067.setText(c27);

        TextView txt_view068 = (TextView) findViewById(R.id.txt_view068);
        txt_view068.setText(c28);

        TextView txt_view069 = (TextView) findViewById(R.id.txt_view069);
        txt_view069.setText(c29);

        TextView txt_view070 = (TextView) findViewById(R.id.txt_view070);
        txt_view070.setText(c30);

        buttonr  = (Button) findViewById(R.id.Regresar);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //Para regresar a la vista anterior

            }
        });


    }

}
