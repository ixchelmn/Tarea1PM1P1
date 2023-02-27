package com.example.tarea1pm1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Variables globales

    EditText pt_num1, pt_num2;
    Button btn_suma, btn_resta, btn_division, btn_multiplicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pt_num1 = (EditText) findViewById(R.id.pt_num1);
        pt_num2 = (EditText) findViewById(R.id.pt_num2);
        btn_suma = (Button) findViewById(R.id.btn_suma);
        btn_resta = (Button) findViewById(R.id.btn_resta);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_multiplicacion = (Button) findViewById(R.id.btn_multiplicacion);

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(pt_num1.getText().toString());
                int num2 = Integer.parseInt(pt_num2.getText().toString());
                int resultado = num1 + num2;

                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);

            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(pt_num1.getText().toString());
                int num2 = Integer.parseInt(pt_num2.getText().toString());
                int resultado = num1 - num2;

                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);

            }
        });
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(pt_num1.getText().toString());
                int num2 = Integer.parseInt(pt_num2.getText().toString());
                int resultado = num1 / num2;

                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);

            }
        });

        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(pt_num1.getText().toString());
                int num2 = Integer.parseInt(pt_num2.getText().toString());
                int resultado = num1 * num2;

                Intent intent = new Intent(MainActivity.this, ActivityResultados.class);
                intent.putExtra("Resultado", resultado);
                startActivity(intent);

            }
        });


    }
}