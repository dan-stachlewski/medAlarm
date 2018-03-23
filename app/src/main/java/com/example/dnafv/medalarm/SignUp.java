package com.example.dnafv.medalarm;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by dnafv on 23/03/2018.
 */

public class SignUp extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void onSignUpClick(View v){
        if(v.getId() == R.id.signUpBtn){
            EditText name = (EditText)findViewById(R.id.textFieldName);
            EditText email = (EditText)findViewById(R.id.textFieldEmail);
            EditText uname = (EditText)findViewById(R.id.textFieldUname);
            EditText pwd1 = (EditText)findViewById(R.id.textFieldPwd1);
            EditText pwd2 = (EditText)findViewById(R.id.textFieldPwd2);

            EditText a = (EditText)findViewById(R.id.textFieldUsername);
            String str = a.getText().toString();


            String nameStr = name.getText().toString();
            String emailStr = email.getText().toString();
            String unameStr = uname.getText().toString();
            String pwd1Str = pwd1.getText().toString();
            String pwd2Str = pwd2.getText().toString();

            if(!pwd1Str.equals(pwd2Str)){
                //Popup msg
                Toast pwd = Toast.makeText(SignUp.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                pwd.show();
            }
        }
    }

}
