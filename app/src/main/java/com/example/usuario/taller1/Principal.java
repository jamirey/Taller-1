package com.example.usuario.taller1;


import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    private TextView total, unidad;
    private EditText cantidad;
    private Spinner material, dije, bano, divisa;
    private Resources resources;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        unidad = (TextView) findViewById(R.id.LblUnidad);
        total = (TextView) findViewById(R.id.lblResultado);

        cantidad = (EditText) findViewById(R.id.LblUnidad);

        material = (Spinner) findViewById(R.id.spn1);
        dije = (Spinner) findViewById(R.id.spn2);
        bano = (Spinner) findViewById(R.id.spn3);
        divisa = (Spinner) findViewById(R.id.spn4);

        resources = this.getResources();

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.materiales, android.R.layout.simple_spinner_item);
        material.setAdapter(adapter);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.dijes, android.R.layout.simple_spinner_item);
        dije.setAdapter(adapter1);

        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.banos, android.R.layout.simple_spinner_item);
        bano.setAdapter(adapter2);

        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.divisas, android.R.layout.simple_spinner_item);
        divisa.setAdapter(adapter3);
    }


    public void calcular(View view) {

        int valorU = 0, valorT, canti;
        canti = Integer.parseInt(cantidad.getText().toString());
        unidad.setText("");

        if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 0) {
            valorU = 100;
        }
        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 1) {
                valorU = 100;
            }
        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 2) {
                valorU = 80;
            }

        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 3) {
                valorU = 70;
            }
        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 0) {
                valorU = 120;
            }

        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 1) {
                valorU = 120;
            }

        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 2) {
                valorU = 100;
            }
        else if (material.getSelectedItemPosition() == 0 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 3) {
                valorU = 90;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 0) {
                valorU = 90;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 1) {
                valorU = 90;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 2) {
                valorU = 70;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 0 && bano.getSelectedItemPosition() == 3) {
                valorU = 50;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 0) {
                valorU = 110;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 1) {
                valorU = 110;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 2) {
                valorU = 90;
            }
        else if (material.getSelectedItemPosition() == 1 && dije.getSelectedItemPosition() == 1 && bano.getSelectedItemPosition() == 3) {
                valorU = 80;
            }
        if (divisa.getSelectedItemPosition()==0){
                valorT = valorU * canti;
                total.setText("US$"+valorT);
                unidad.setText(""+valorU);


            }else if(divisa.getSelectedItemPosition()==1){
                    valorT = valorU * canti;
                    valorT = valorT * 3200;
                    total.setText("COP$"+valorT);
                    unidad.setText(""+valorU);

            }


    }

}
