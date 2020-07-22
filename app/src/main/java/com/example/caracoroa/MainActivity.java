package com.example.caracoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    private static final String NUMERO = "NUMERO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnPlay = findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int index = new Random().nextInt(2);

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                intent.putExtra(NUMERO, index);

                startActivity(intent);
            }
        });
    }
}
