package com.ianatulkh.submission_2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnInstantCourier, btnGofood, btnTransport, btnShopping;

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_send);

        btnInstantCourier = findViewById(R.id.bike);
        btnGofood = findViewById(R.id.car);
        btnTransport = findViewById(R.id.food);
        btnShopping = findViewById(R.id.express);

        btnInstantCourier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Berada di menu Go Ride", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MainActivity.this, GoSend.class);
                startActivity(move);
            }
        });
        btnGofood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Berada di menu Go Food", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MainActivity.this, GoFood.class);
                startActivity(move);
            }
        });
        btnTransport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Berada di menu Send", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MainActivity.this, GoRide.class);
                startActivity(move);
            }
        });
        btnShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Berada di menu Mart", Toast.LENGTH_SHORT).show();
                Intent move = new Intent(MainActivity.this, GoMart.class);
                startActivity(move);
            }
        });
    }
}