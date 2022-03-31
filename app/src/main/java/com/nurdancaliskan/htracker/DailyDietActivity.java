package com.nurdancaliskan.htracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class DailyDietActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText edt_breakfast, edt_lunch , edt_dinner;
    Button btn_save;
    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    String spinnerText;
    String spinner2Text;
    String spinner3Text;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_diet);

        position = getIntent().getExtras().getInt("position");
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner_two);
        spinner3 = findViewById(R.id.spinner_three);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.hours, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);

        edt_breakfast = findViewById(R.id.edt_breakfast);
        edt_lunch = findViewById(R.id.edt_lunch);
        edt_dinner = findViewById(R.id.edt_dinner);

        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(view -> {
                    Intent returnIntent = new Intent(DailyDietActivity.this,DietActivity.class);
                    returnIntent.putExtra("breakfastText",edt_breakfast.getText().toString());
                    returnIntent.putExtra("dinnerText",edt_dinner.getText().toString());
                    returnIntent.putExtra("launchText",edt_lunch.getText().toString());
                    returnIntent.putExtra("spinnerText",spinnerText);
                    returnIntent.putExtra("spinner2Text",spinner2Text);
                    returnIntent.putExtra("spinner3Text",spinner3Text);
                    returnIntent.putExtra("position",position);
                    setResult(Activity.RESULT_OK,returnIntent);
                    finish();
                });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if(parent == spinner){
            spinnerText = parent.getItemAtPosition(position).toString();
        }else if(parent == spinner2){
            spinner2Text = parent.getItemAtPosition(position).toString();
        }else if(parent == spinner3){
            spinner3Text = parent.getItemAtPosition(position).toString();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
        //Nothing
    }
}