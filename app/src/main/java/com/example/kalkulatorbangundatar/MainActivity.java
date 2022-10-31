package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rl_persegi,rl_persegipanjang, rl_segitiga, rl_lingkaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        rl_persegi = findViewById(R.id.rl_persegi);
        rl_persegipanjang = findViewById(R.id.rl_persegipanjang);
        rl_segitiga = findViewById(R.id.rl_segitiga);
        rl_lingkaran = findViewById(R.id.rl_lingkaran);

        rl_persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia = new Intent(MainActivity.this, countPersegi.class);
                startActivity(ia);
            }
        });
        rl_persegipanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ib = new Intent(MainActivity.this, countPersegiPanjang.class);
                startActivity(ib);
            }
        });
        rl_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ic = new Intent(MainActivity.this, countSegitiga.class);
                startActivity(ic);
            }
        });
        rl_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent id = new Intent(MainActivity.this, countLingkaran.class);
                startActivity(id);
            }
        });

    }
}