package com.nurdancaliskan.htracker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddDietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_diet_activity);

        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                setResult(Activity.RESULT_CANCELED, returnIntent);
                finish();
            }
        });

        findViewById(R.id.button_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                Integer dietNumber;
                EditText text = findViewById(R.id.edt_add_diet_text);
                if (!text.getText().toString().equals("")) {
                    dietNumber = Integer.parseInt(text.getText().toString());
                } else {
                    dietNumber = 0;
                }
                returnIntent.putExtra("result", dietNumber);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });
    }
}
