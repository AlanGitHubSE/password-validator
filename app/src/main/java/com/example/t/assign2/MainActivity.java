package com.example.t.assign2;

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

    public void ClickButton(View view){

        EditText passwordField = (EditText)findViewById(R.id.password_Field);
        TextView strengthIndicator = (TextView)findViewById(R.id.strength_Indicator);

        Validator validate = new Validator();
       int rulePassed = validate.Password_Strength(passwordField.getText().toString());

        if(rulePassed == 1){
            strengthIndicator.setText("Too Weak");
        }
        else if(rulePassed ==2){
            strengthIndicator.setText("Weak");
        }
        else if(rulePassed ==3){
            strengthIndicator.setText("Middle");
        }
        else if(rulePassed ==4){
            strengthIndicator.setText("Strong");
        }
        else if(rulePassed ==5){
            strengthIndicator.setText("Very Strong");
        }
        else{
            strengthIndicator.setText("Error occurred, # of rule passed: "+ rulePassed);
        }
    }
}
