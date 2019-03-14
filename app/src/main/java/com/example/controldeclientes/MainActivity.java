package com.example.controldeclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int entrar = 0, salir = 0;
    TextView text1,text2;
    Button boton1,boton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.entran);
        text1 = findViewById(R.id.textEntrar);
        boton2 =findViewById(R.id.salen);
        text2 = findViewById(R.id.textSalir);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrar++;
                text1.setText(Integer.toString(entrar));
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salir++;
                text2.setText(Integer.toString(salir));
            }
        });
    }


}
