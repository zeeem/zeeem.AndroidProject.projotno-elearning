package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView slideImage;
    Button NextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideImage = (ImageView) findViewById(R.id.slideImage);
        //NextButton = (Button) findViewById(R.id.NextButton);


        //onSwipe Listener
        slideImage.setOnTouchListener(new OnSwipeTouchListener(MainActivity.this) {
            public void onSwipeTop() {
                Toast.makeText(MainActivity.this, "Swipe left to go to next page", Toast.LENGTH_SHORT).show();
            }
            public void onSwipeRight() {
                Toast.makeText(MainActivity.this, "Swipe left to go to next page", Toast.LENGTH_SHORT).show();

            }
            public void onSwipeLeft() {
                Toast.makeText(MainActivity.this, "swipe left - worked", Toast.LENGTH_SHORT).show();

                //Swipe left to go to next page

            }
            public void onSwipeBottom() {
                Toast.makeText(MainActivity.this, "Swipe left to go to next page", Toast.LENGTH_SHORT).show();
            }

        });
    }


}
