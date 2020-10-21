package com.nilson.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtlat,txtlon,txtnom;
    Button btnmap,btnlimpiar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtlat = findViewById(R.id.txtlat);
        txtlon =  findViewById(R.id.txtlon);
        txtnom = findViewById(R.id.txtnom);
        btnmap = findViewById(R.id.btnmap);
        btnlimpiar = findViewById(R.id.btnlimpiar);




        btnmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float lat,lon;
                String nombre;

                lat =Float.parseFloat(txtlat.getText().toString());
                lon = Float.parseFloat(txtlon.getText().toString());
                nombre = txtnom.getText().toString();


                Intent intento = new Intent(MainActivity.this,MapsActivity.class);
                intento.putExtra("latitud",lat);
                intento.putExtra("longitud",lon);
                intento.putExtra("nombre",nombre);

                startActivity(intento);

            }
        });




    }
}