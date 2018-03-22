package com.example.dnafv.medalarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method that will open the Display Activity when Clicked.
    public void onButtonClick(View v){
        if(v.getId() == R.id.displayBtn){
            Intent i = new Intent(MainActivity.this, Display.class);
            startActivity(i);
        }
    }
}
