package co.app.viajero.viajero_seguro;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ver_informacion_trasnporte extends AppCompatActivity {



    Button buttonr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_informacion_trasnporte);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        String c31 ="";
        String c32  ="";
        String c33 ="";
        String c34 ="";



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            c31 = extras.getString("c31");
            c32 = extras.getString("c32");
            c33 = extras.getString("c33");
            c34 = extras.getString("c34");
        }


        TextView txt_view071 = (TextView) findViewById(R.id.txt_view071);
        txt_view071.setText(c31);

        TextView txt_view072 = (TextView) findViewById(R.id.txt_view072);
        txt_view072.setText(c32);

        TextView txt_view073 = (TextView) findViewById(R.id.txt_view073);
        txt_view073.setText(c33);

        TextView txt_view074 = (TextView) findViewById(R.id.txt_view074);
        txt_view074.setText(c34);

        buttonr  = (Button) findViewById(R.id.Regresar);
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();  //Para regresar a la vista anterior

            }
        });

    }

}
