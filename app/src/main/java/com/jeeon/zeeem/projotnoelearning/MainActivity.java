package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView slideImage;
    Button NextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TinyDB tinydb = new TinyDB(getApplicationContext());

        getSavedData();
        //gettting the saved data from DATABASE

        //Toast.makeText(this, "saved data one: " + a + "saved data two: " + b, Toast.LENGTH_SHORT).show();

        //slideImage = (ImageView) findViewById(R.id.slideImage);
        //NextButton = (Button) findViewById(R.id.NextButton);


        //onSwipe Listener
//        slideImage.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
//            public void onSwipeTop() {
//                Toast.makeText(MainActivity.this, "Swipe left/right to go to next page", Toast.LENGTH_SHORT).show();
//            }
//            public void onSwipeRight() {
//                //Toast.makeText(MainActivity.this, "Swipe left to go to next page", Toast.LENGTH_SHORT).show();
//
//                Intent intent = new Intent(MainActivity.this, MainMenu.class);
//                startActivity(intent);
//                finish();
//
//            }
//            public void onSwipeLeft() {
//                //Toast.makeText(MainActivity.this, "swipe left - worked", Toast.LENGTH_SHORT).show();
//
//                //Swipe left to go to next page
//                Intent intent = new Intent(MainActivity.this, MainMenu.class);
//                startActivity(intent);
//                finish();
//
//            }
//            public void onSwipeBottom() {
//                Toast.makeText(MainActivity.this, "Swipe left/right to go to next page", Toast.LENGTH_SHORT).show();
//            }
//
//        });

    }

    public void goToHomePage(View view){
        Intent intent = new Intent(MainActivity.this, MainMenu.class);
                startActivity(intent);
                finish();
    }


    public void saveData(Context context){

        TinyDB tinydb = new TinyDB(context);

        int isCaseSolvedUnlockedInt;

        if(StaticLogics.isCaseSolvingUnlocked) {
            isCaseSolvedUnlockedInt = 1;
        } else isCaseSolvedUnlockedInt =0;

        ArrayList datalist = new ArrayList<Integer>();
        datalist.add(StaticLogics.unlocked_primary_Learn_level);
        datalist.add(StaticLogics.unlocked_case_solved_level);
        datalist.add(isCaseSolvedUnlockedInt);

        tinydb.putListInt("StaticData", datalist);
    }

    public void getSavedData(){

        TinyDB tinydb = new TinyDB(getApplicationContext());
        ArrayList savedData = new ArrayList<Integer>();

        try {
            savedData = tinydb.getListInt("StaticData");
            int a = (int) savedData.get(0);
            int b = (int) savedData.get(1);
            int c = (int) savedData.get(2);

            StaticLogics.unlocked_primary_Learn_level = a;
            StaticLogics.unlocked_case_solved_level = b;

            if(c==1)
                StaticLogics.isCaseSolvingUnlocked = true;
            else StaticLogics.isCaseSolvingUnlocked = false;

         //   Toast.makeText(this, "saved data list is : " + a + " , " + b + " , " + c, Toast.LENGTH_SHORT).show();

        }
        catch (Throwable e) {
       // Toast.makeText(this, "no saved data found", Toast.LENGTH_SHORT).show();

        }

    }

}
