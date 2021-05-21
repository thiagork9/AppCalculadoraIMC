package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularImc(View view){

        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        /* Fórmula IMC = peso/(altura*altura)*/

        double resultadoImc = peso/(altura*altura);

        if(resultadoImc < 18.5){
            textResultado.setText("ABAIXO DO PESO, O IMC É: "+resultadoImc);
        }else if(resultadoImc >= 18.5 && resultadoImc <= 24.9){
            textResultado.setText("PESO NORMAL, O IMC É: "+resultadoImc);
        }else if(resultadoImc >= 25 && resultadoImc <= 29.9){
            textResultado.setText("EXCESSO DE PESO, O IMC É: "+resultadoImc);
        }else if(resultadoImc >= 30 && resultadoImc <= 34.9){
            textResultado.setText("OBESIDADE CLASSE I, O IMC É: "+resultadoImc);
        }else if(resultadoImc >= 35 && resultadoImc <= 39.9){
            textResultado.setText("OBESIDADE CLASSE II, O IMC É: "+resultadoImc);
        }else if(resultadoImc >= 40){
            textResultado.setText("OBESIDADE CLASSE III, O IMC É: "+resultadoImc);
        }

    }
}