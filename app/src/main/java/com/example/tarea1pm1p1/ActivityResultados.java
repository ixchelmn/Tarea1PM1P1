package com.example.tarea1pm1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityResultados extends AppCompatActivity {
    private TextView pt_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        Bundle extras = getIntent().getExtras();
        int resultado = extras.getInt("Resultado");

        pt_result = findViewById(R.id.pt_result);

        pt_result.setText("Resultado: " + resultado);


    }
}
