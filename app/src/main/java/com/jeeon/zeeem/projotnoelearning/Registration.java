package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile_eLearn_zeem";

    EditText input_name, input_phn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);

        input_name = (EditText) findViewById(R.id.input_name);
        input_phn = (EditText) findViewById(R.id.input_phn);

    }

    public void regButton(View view){

        if(!input_name.getText().toString().trim().equals("") && !input_phn.getText().toString().trim().equals("")) {
            Intent intent = new Intent(this, HomePage.class);
            startActivity(intent);
            finish();

            //store the preference of registration done
            SharedPreferences prefs = getSharedPreferences(PREFS_NAME, 0);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("isRegistrationDone", true);
            editor.commit();
        }
        else Toast.makeText(this, "Username or Phone number can not be empty", Toast.LENGTH_SHORT).show();
    }
}
