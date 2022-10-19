package com.example.kalkulatorbangundatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Lingkaran = (Button) findViewById(R.id.lingkaran);

        Lingkaran.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent lingkaran = new Intent(MainActivity.this, Activity_Lingkaran.class);
                startActivity(lingkaran);
            }
        });

        Button segitiga = (Button) findViewById(R.id.segitiga);

        segitiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent segitiga = new Intent(MainActivity.this, Segitiga.class);
                startActivity(segitiga);
            }
        });
        Button persegi = (Button) findViewById(R.id.persegi);

        persegi.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent persegi = new Intent(MainActivity.this, persegi.class);
                startActivity(persegi);
            }
        });

        Button bangundatar = (Button) findViewById(R.id.bangundatar);

        bangundatar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent bangundatar = new Intent(MainActivity.this, bangundatar.class);
                startActivity(bangundatar);
            }
        });

    }
    public void keluar(View view){
        System.exit(0);
    }
}