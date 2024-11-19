package com.example.lab2zolotarev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity2.class);
            startActivity(intent);
        });


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity3.class);
            startActivity(intent);
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity4.class);
            startActivity(intent);
        });


        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> finish());
    }
}
