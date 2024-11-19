package com.example.lab2zolotarev;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2); // Убедитесь, что файл `activity_2.xml` привязан к этой активности

        // Получение кнопок из разметки
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);

        // Установка действий для кнопок
        button1.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button1 clicked!", Toast.LENGTH_SHORT).show());

        button2.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button2 clicked!", Toast.LENGTH_SHORT).show());

        button3.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button3 clicked!", Toast.LENGTH_SHORT).show());

        button4.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button4 clicked!", Toast.LENGTH_SHORT).show());

        button5.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button5 clicked!", Toast.LENGTH_SHORT).show());

        button6.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button6 clicked!", Toast.LENGTH_SHORT).show());

        button7.setOnClickListener(v ->
                Toast.makeText(Activity2.this, "Button7 clicked!", Toast.LENGTH_SHORT).show());
    }
}
