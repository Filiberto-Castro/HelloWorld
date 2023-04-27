package com.zerocode.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nombre;
    private TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.etName);
        saludo = findViewById(R.id.tvSaludo);
    }

    public void btnSaludar(View view){

        saludo.setText("Hola, " + nombre.getText().toString());

    }
}