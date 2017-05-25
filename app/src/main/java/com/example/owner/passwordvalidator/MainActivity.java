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


        return rulesPassed;
    }
}
