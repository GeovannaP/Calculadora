package com.example.exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit1 = findViewById(R.id.nb1);
        final EditText edit2 = findViewById(R.id.nb2);
        final RadioGroup op = findViewById(R.id.rg);
        final TextView result = findViewById(R.id.result);
        Button Calcular = findViewById(R.id.button);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(edit1.getText().toString());
                float n2 = Float.parseFloat(edit2.getText().toString());
                float res = 1;
                int operacao = op.getCheckedRadioButtonId();
                if (operacao== R.id.adicao){
                 res= n1+n2;
                }
                else if (operacao==R.id.subtracao){
                    res=n1-n2;
                }
                else if (operacao==R.id.multiplicacao){
                    res=n1*n2;
                }
                else if(operacao==R.id.divisao){
                    res=n1/n2;
                }
                result.setText("Resultado "+ res);
            }
        });
    }
}