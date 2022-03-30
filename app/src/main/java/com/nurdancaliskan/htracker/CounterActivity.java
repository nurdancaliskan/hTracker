package com.nurdancaliskan.htracker;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {

    EditText edt_water, edt_coffee;
    TextView important_TextView ;
    ImageView coffee_ImageView, water_ImageView;
    Button btn_plus1, btn_plus2, btn_minus1, btn_minus2;

      int number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        edt_water = findViewById(R.id.edtText_water);
        edt_coffee = findViewById(R.id.edtText_coffee);
        important_TextView = findViewById(R.id.important_txt);
        coffee_ImageView = findViewById(R.id.coffee_imageView);
        water_ImageView = findViewById(R.id.water_imageView);
        btn_plus1 = findViewById(R.id.button_plus1);
        btn_minus1 = findViewById(R.id.button_minus1);
        btn_plus2 = findViewById(R.id.button_plus2);
        btn_minus2 = findViewById(R.id.button_minus2);


        btn_plus1.setOnClickListener(v -> {
            number ++;
            edt_water.setText(String.valueOf(number));
        });
        

        btn_minus1.setOnClickListener(v -> {
            number -- ;
            edt_water.setText(String.valueOf(number));
        });


        btn_plus2.setOnClickListener(v -> {
            number ++ ;
            edt_coffee.setText(String.valueOf(number));
        });


        btn_minus2.setOnClickListener(v -> {
            number -- ;
            edt_coffee.setText(String.valueOf(number));
        });
    }
}