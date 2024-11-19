package com.example.lab2zolotarev;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        // Получение кнопки
        Button newButton = findViewById(R.id.newButton);

        // Обработка нажатия на кнопку
        newButton.setOnClickListener(v -> {
            // Действие при нажатии, например, отображение сообщения
            newButton.setBackgroundColor(getResources().getColor(android.R.color.holo_green_light));
        });
    }
}
