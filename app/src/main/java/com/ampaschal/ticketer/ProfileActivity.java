package com.ampaschal.ticketer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvName, tvEmail, tvPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tv_name);
        tvEmail = findViewById(R.id.tv_email);
        tvPhone = findViewById(R.id.tv_phone);

        tvName.setText(getIntent().getStringExtra("name"));
        tvEmail.setText(getIntent().getStringExtra("email"));
        tvPhone.setText(getIntent().getStringExtra("phone"));
    }
}
