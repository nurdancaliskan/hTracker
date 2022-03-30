package com.nurdancaliskan.htracker;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LandingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_acitivty);
    }

    public void onRecipeClick(View View){
        startActivity(new Intent(this,DietActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void onDietClick(View View){
        startActivity(new Intent(this, DietActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void onCounterClick(View View){
        startActivity(new Intent(this, CounterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }

    public void onProfileClick(View View){
        startActivity(new Intent(this, ProfileActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);
    }
}