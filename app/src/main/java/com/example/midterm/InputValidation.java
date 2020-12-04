package com.example.midterm;

import android.util.Patterns;

import java.util.regex.Pattern;

public class InputValidation extends MainActivity{
    MainActivity mainActivity;



    public InputValidation(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    //Sign In inputs validation
    boolean validateEmailSignIn() {
        String emailInput = mainActivity.textInputEmail.getEditText().getText().toString().trim();
        if (emailInput.isEmpty()) {
            mainActivity.textInputEmail.setError("Field can't be empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            mainActivity.textInputEmail.setError("Please enter a valid email address");
            return false;
        } else {
            mainActivity.textInputEmail.setError(null);
            return true;
        }
    }

}

