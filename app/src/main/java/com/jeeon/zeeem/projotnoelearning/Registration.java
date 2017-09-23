package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Registration extends AppCompatActivity {

    public static final String PREFS_NAME = "MyPrefsFile_eLearn_zeem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_registration);

    }

    public void regButton(View view){

        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
        finish();

        //store the preference of registration done
        SharedPreferences prefs = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("isRegistrationDone", true);
        editor.commit();

    }
}
