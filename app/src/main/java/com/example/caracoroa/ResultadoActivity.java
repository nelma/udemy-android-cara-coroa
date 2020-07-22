package com.example.caracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {

    Button btnBack;
    ImageView imgResultado;
    private static final String NUMERO = "NUMERO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgResultado = findViewById(R.id.img_resultado);

        Bundle data = getIntent().getExtras();
        int numero = data.getInt(NUMERO);

        this.chooseOne(numero);

        btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void chooseOne(int numero) {
        if(numero == 0) {
            imgResultado.setImageResource(R.drawable.moeda_cara);
            Toast.makeText(getApplicationContext(), "Cara", Toast.LENGTH_SHORT).show();
        } else {
            imgResultado.setImageResource(R.drawable.moeda_coroa);
            Toast.makeText(getApplicationContext(), "Coroa", Toast.LENGTH_SHORT).show();
        }
    }
}
