package com.nurdancaliskan.htracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    ImageView profile_frame;
    TextView txt_username, txt_date_of_birth, txt_height_weight, txt_gender;
    Button btn_edit_profile, btn_signout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        profile_frame = findViewById(R.id.profile_picture_profileFrame);
        txt_username = findViewById(R.id.txt_username_profilFrame);
        txt_date_of_birth = findViewById(R.id.txt_profilBio_date_of_birth);
        txt_height_weight = findViewById(R.id.txt_profilBio_height_weight);
        txt_gender = findViewById(R.id.txt_profileBio_gender);
        btn_edit_profile = findViewById(R.id.imgBtn_edit_profile);
        btn_signout = findViewById(R.id.imgBtn_sign_out);


        btn_edit_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });

        btn_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ProfileActivity.this, LoginActivity.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                finish();
            }
        });
    }

}

