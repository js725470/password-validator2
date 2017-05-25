package com.example.owner.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int Validate(String pass){
        int rulesPassed=0;
        if(!pass.equalsIgnoreCase("password"))
        {
            rulesPassed++;
        }

        if(pass.length()>=8)
        {
            rulesPassed++;
        }

        if(pass.matches(".*[0-9].*"))
        {
            rulesPassed++;
        }

        if(pass.matches(".*[a-z].*") && pass.matches(".*[A-Z].*"))
        {
            rulesPassed++;
        }

        if(pass.matches(".*[ !\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~].*"))
        {
            rulesPassed++;
        }
        return rulesPassed;
    }
}
