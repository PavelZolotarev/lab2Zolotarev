package com.example.lab2zolotarev;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        // Получение кнопок
        Button buttonLeft = findViewById(R.id.buttonLeft);
        Button buttonRight = findViewById(R.id.buttonRight);
        Button buttonCenterLeft = findViewById(R.id.buttonCenterLeft);
        Button buttonCenter = findViewById(R.id.buttonCenter);
        Button buttonCenterRight = findViewById(R.id.buttonCenterRight);
        Button buttonBottom = findViewById(R.id.buttonBottom);

        // Установка действий для кнопок
        buttonLeft.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Left 50% clicked!", Toast.LENGTH_SHORT).show());

        buttonRight.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Right 50% clicked!", Toast.LENGTH_SHORT).show());

        buttonCenterLeft.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Center_left clicked!", Toast.LENGTH_SHORT).show());

        buttonCenter.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Center clicked!", Toast.LENGTH_SHORT).show());

        buttonCenterRight.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Center_right clicked!", Toast.LENGTH_SHORT).show());

        buttonBottom.setOnClickListener(v ->
                Toast.makeText(Activity3.this, "Bottom clicked!", Toast.LENGTH_SHORT).show());
    }
}
