package com.ampaschal.ticketer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private Button btRegister;
    private EditText etName, etEmail, etPhone, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btRegister = findViewById(R.id.bt_register);
        etName = findViewById(R.id.et_name);
        etEmail = findViewById(R.id.et_email);
        etPhone = findViewById(R.id.et_phone);
        etPassword = findViewById(R.id.et_password);

        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, ProfileActivity.class);
                intent.putExtra("name", etName.getText().toString().trim());
                intent.putExtra("email", etEmail.getText().toString().trim());
                intent.putExtra("phone", etPhone.getText().toString().trim());
                intent.putExtra("password", etPassword.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}
