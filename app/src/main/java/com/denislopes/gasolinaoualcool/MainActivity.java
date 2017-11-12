package com.denislopes.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = (EditText) findViewById(R.id.precoAlcoolID);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaID);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarID);


        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //recuperar valores digitados
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //converter os valores string para numeros
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                double resultado = valorAlcool / valorGasolina;

                if(resultado >= 0.7){
                    //Gasolina
                    Toast.makeText(getApplicationContext(),"É melhor utilizar a Gasolina", Toast.LENGTH_LONG).show();

                }else{
                    //Alcool
                    Toast.makeText(getApplicationContext(),"É melhor utilizar o Alcool", Toast.LENGTH_LONG).show();



                }
            }
        });
    }


}
