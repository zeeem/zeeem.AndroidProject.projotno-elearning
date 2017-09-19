package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    Button caseSolveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        caseSolveButton = (Button) findViewById(R.id.caseSolveButton);

        if(StaticLogics.isCaseSolvingUnlocked){
            caseSolveButton.setBackgroundResource(R.drawable.homepage_b1);
        }


    }

    //change color of button when 2nd button unlocked (pressing back)
    @Override
    protected void onResume() {
        super.onResume();

        caseSolveButton = (Button) findViewById(R.id.caseSolveButton);
        if(StaticLogics.isCaseSolvingUnlocked){
            caseSolveButton.setBackgroundResource(R.drawable.homepage_b1);
        }
    }


    //learn button activity
    public void learnButton(View view){
        Intent intent = new Intent(this, LearningLevels.class);
        startActivity(intent);
    }

    //Case button click activity
    public void goToCaseSolving(View view){
        //check if CASE SOLVING IS UNLOCKED

        //if unlocked do
        if(StaticLogics.isCaseSolvingUnlocked){
            Intent intent = new Intent(this, CaseSolvingLevels.class);
            startActivity(intent);
        }

        //if not toast
        else {
            Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
        }

    }

}


