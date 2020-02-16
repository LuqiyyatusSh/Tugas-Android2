package com.example.tugaskalkulatorluas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText alas, tinggi;
    private TextView tvHasil;
    private Button btnsegitiga;
    private Button btnjajargenjang;
    private double sHasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsegitiga = findViewById(R.id.btn_segitiga);
        btnjajargenjang = findViewById(R.id.btn_jajargenjang);
        alas = findViewById(R.id.et_alas);
        tinggi = findViewById(R.id.et_tinggi);
        tvHasil = findViewById(R.id.tv_hasil);


        btnsegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Alas = Double.parseDouble(alas.getText().toString());
                    Double Tinggi = Double.parseDouble(tinggi.getText().toString());

                    Double segitiga = Alas * Tinggi / 2;
                    tvHasil.setText(String.valueOf(segitiga));

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btnjajargenjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double Alas = Double.parseDouble(alas.getText().toString());
                    Double Tinggi = Double.parseDouble(tinggi.getText().toString());

                    Double jajargenjang = Alas * Tinggi;
                    tvHasil.setText(String.valueOf(jajargenjang));

                } catch (Exception e) {
                    Toast.makeText(getApplicationContext(), "Field tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}
