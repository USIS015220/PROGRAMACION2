package com.ugb.miprimerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        TextView tempVal =(TextView)findViewById(R.id.txtnum1);
        double num1 = Double.parseDouble(tempVal.getText().toString());

        tempVal = (TextView)findViewById(R.id.txtnum2);
        double num2 =Double.parseDouble(tempVal.getText().toString());

        double respuesta = 1;
        RadioButton optOperacionesBasicas = findViewById(R.id.optsuma);
        if(optOperacionesBasicas.isChecked()) {
                respuesta = num1 + num2;
            }
            optOperacionesBasicas = findViewById(R.id.optResta);
            if(optOperacionesBasicas.isChecked()) {
                respuesta = num1 - num2;
            }

                optOperacionesBasicas = findViewById(R.id.optMultiplicacion);
                if(optOperacionesBasicas.isChecked()) {
                    respuesta = num1 * num2;
                }

                    optOperacionesBasicas = findViewById(R.id.optDivision);
                    if(optOperacionesBasicas.isChecked()) {
                        respuesta = num1 / num2;
                    }
        RadioButton optOperacionesBasicas = findViewById(R.id.optfactorial);
          // i++ -> i = i + 1 -> i+=1
        if(optOperacionesBasicas.isChecked()) {
            for(int i=1; i<=num1; i++)
                respuesta *=i;
               }
        }

        Spinner cboOperacionesBasicas = findViewById(R.id.cboOperacionesBasicas);
        Switch (cboOperacionesBasicas.getSelectItemPosition()){
        case 0:
            respuesta = num1+num2;
            break;
        case 1:
            respuesta = num1-num2;
            break;
        case 2:
            respuesta = num1*num2;
            break;
        case 3:
            respuesta = num/num2;




        tempVal = findViewById(R.id.lblRespuesta);
        tempVal.setText("Respuesta"+ respuesta);
    }
}