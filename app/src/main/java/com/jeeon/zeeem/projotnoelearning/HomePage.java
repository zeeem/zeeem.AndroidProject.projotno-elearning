package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    //learn button activity
    public void learnButton(View view){
//        Intent intent = new Intent(this, LearnHomePage.class);
//        startActivity(intent);
    }

    //button click activities
    public void lockButtonClick(View view){
        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }
}


