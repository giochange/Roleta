package com.facens.aula_22022021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterar(View view) {

        TextView texto = findViewById(R.id.textView2);
        int x = new Random().nextInt(11);
        texto.setText("numero sorteado: " + x );
    }
}