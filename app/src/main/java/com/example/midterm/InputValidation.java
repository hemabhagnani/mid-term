package com.example.midterm;

import android.util.Patterns;

import java.util.regex.Pattern;

public class InputValidation extends MainActivity{
    MainActivity mainActivity;



    public InputValidation(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^" +
                    //"(?=.*[0-9])" +         //at least 1 digit
                    //"(?=.*[a-z])" +         //at least 1 lower case letter
                    //"(?=.*[A-Z])" +         //at least 1 upper case letter
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=.*[@#$%^&+=])" +    //at least 1 special character
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");
    private static final Pattern USER_NAME =
            Pattern.compile("^" +
                    "(?=.*[a-zA-Z])" +      //any letter
                    "(?=\\S+$)" +           //no white spaces
                    ".{4,}" +               //at least 4 characters
                    "$");
    private static final Pattern VALID_PHONE =
            Pattern.compile("^" +
                    "(?=\\S+$)" +           //no white spaces
                    ".{10,}" +               //at least 10 characters
                    "$");


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

