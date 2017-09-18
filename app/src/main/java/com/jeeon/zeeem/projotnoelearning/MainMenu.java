package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainMenu extends Activity {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    //DISABLE back button on menu
    @Override
    public void onBackPressed() {
    }

    //button click activities
    public void lockButtonClick(View view){
        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }

    public void goToEyeSlide(View view) {
        //Intent intent = new Intent(this, EyeSlide.class);
        //startActivity(intent);
    }

}
