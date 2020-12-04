package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout textInputEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputEmail = findViewById(R.id.text_input_email);
    }
    public void confirmInput(View v) {
        InputValidation inputValidation = new InputValidation( this);
        if (!inputValidation.validateEmailSignIn()) {
            return;
        }
        String input = "Email: " + textInputEmail.getEditText().getText().toString();

    }
}