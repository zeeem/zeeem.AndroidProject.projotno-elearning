package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends Activity {

    boolean doubleBackToExitPressedOnce = false;

    boolean quitApp = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //exit on button pressing on Last Screeen
        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
            System.exit(0);
        }

    }

    //double back to exit
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();

            System.exit(0);

            return;
        }
        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit",
                Toast.LENGTH_SHORT).show();

    }

    //go to next page activity
    public void goToNext1(View v){
        Intent intent = new Intent(this, EyeSlider.class);
        startActivity(intent);

    }

    //button click activities
    public void lockButtonClick(View view){
        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }

    public void goToEyeSlide(View view) {
        Intent intent = new Intent(this, EyeSlider.class);
        startActivity(intent);
    }

}
