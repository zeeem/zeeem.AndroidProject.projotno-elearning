package com.jeeon.zeeem.projotnoelearning;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LastScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_screen);
    }


    public void goTomenu(View view){
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }

    public void exitApp(View view){

        Intent intent = new Intent(this, MainMenu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("EXIT", true);
        startActivity(intent);
        finish();

    }

}
