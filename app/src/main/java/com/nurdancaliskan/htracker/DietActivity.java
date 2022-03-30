package com.nurdancaliskan.htracker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DietActivity extends AppCompatActivity {

    ArrayList<DietData> dietData = new ArrayList<>();
    RecyclerView recyclerView;
    Integer dietNumber = 0;
    int LAUNCH_FIRST_ACTIVITY = 1;
    int LAUNCH_SECOND_ACTIVITY = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        findViewById(R.id.floating_action_button).setOnClickListener(view -> {
            Intent i = new Intent(DietActivity.this, AddDietActivity.class);
            startActivityForResult(i, LAUNCH_FIRST_ACTIVITY);
        });
        recyclerView = findViewById(R.id.recyclerView_diet);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getBaseContext(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        Intent i = new Intent(DietActivity.this, DailyDietActivity.class);
                        startActivityForResult(i, LAUNCH_SECOND_ACTIVITY);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                    }
                })
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data != null && resultCode == RESULT_OK && requestCode == LAUNCH_FIRST_ACTIVITY) {
            Bundle extras = data.getExtras();
            dietNumber = extras.getInt("result");
            for (int i=0; i<dietNumber; i++){
                dietData.add(new DietData(String.valueOf(i+1),"","","","","",""));
            }
            DietRecyclerViewAdapter recipesAdapter = new DietRecyclerViewAdapter(dietData,DietActivity.this);
            recyclerView.setAdapter(recipesAdapter);
        }
        else if(data!=null && requestCode == LAUNCH_SECOND_ACTIVITY){

        }
    }
}
