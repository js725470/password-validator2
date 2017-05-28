package com.example.owner.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private EditText replace;
    private TextView display;
    private int num;

    public void buttonOnClick(View v){
        replace = (EditText) findViewById(R.id.edit);
        num = Validate(replace.getText().toString());
        display = (TextView) findViewById(R.id.strength);


        if(num>=0 && num<5){
            display.setText("Password not strong.");
        }
        else if(num == 5){
            display.setText("Password is strong.");
        }
        else{
            display.setText("Error. Try again.");
        }
        //display.setText(replace.getText());
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
