package com.example.dnafv.medalarm;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by dnafv on 23/03/2018.
 */

public class Display extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.textViewUsername);
        tv.setText(username);
    }
}
