package com.example.dnafv.medalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method that will Login User when they add their credentials and click login.
    // It takes 1 View Object & checks if View Object Id matches with Btn Id
    // It creates 1 Intent Object (when the button is clicked) starting the New Activity using the onCreate Method
    public void onButtonClick(View v){
        if(v.getId() == R.id.logInBtn){

            // This is how we fetch the Username
            EditText a = (EditText)findViewById(R.id.textFieldUsername);
            String str = a.getText().toString();

            Intent i = new Intent(MainActivity.this, Display.class);
            //Transfer Username from this Activity to DIsplay Activity
            i.putExtra("Username",str);
            startActivity(i);
        }
    }
}
