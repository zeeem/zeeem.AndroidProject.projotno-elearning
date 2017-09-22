package com.jeeon.zeeem.projotnoelearning;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class PrimaryLevelLearn extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button primaryL1, primaryL2, primaryL3, primaryL4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_level_learn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        primaryL1 = (Button) findViewById(R.id.primaryLearn1);
        primaryL2 = (Button) findViewById(R.id.primaryLearn2);
        primaryL3 = (Button) findViewById(R.id.primaryLearn3);
        primaryL4 = (Button) findViewById(R.id.primaryLearn4);

        if(StaticLogics.unlocked_primary_Learn_level==2){
            primaryL1.setBackgroundResource(R.drawable.primary_completed_btn);
            primaryL2.setBackgroundResource(R.drawable.primary_unlocked_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL2.setForeground(null);
            }


        }
        else if(StaticLogics.unlocked_primary_Learn_level==3){

            primaryL1.setBackgroundResource(R.drawable.primary_completed_btn);
            primaryL2.setBackgroundResource(R.drawable.primary_completed_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL2.setForeground(null);
            }
            primaryL3.setBackgroundResource(R.drawable.primary_unlocked_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL3.setForeground(null);
            }
        }
        else if(StaticLogics.unlocked_primary_Learn_level==4){

            primaryL1.setBackgroundResource(R.drawable.primary_completed_btn);
            primaryL2.setBackgroundResource(R.drawable.primary_completed_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL2.setForeground(null);
            }
            primaryL3.setBackgroundResource(R.drawable.primary_completed_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL3.setForeground(null);
            }
            primaryL4.setBackgroundResource(R.drawable.primary_unlocked_btn);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                primaryL4.setForeground(null);
            }

            Toast.makeText(this, "CASE SOLVE (level 1: Primary) - UNLOCKED", Toast.LENGTH_SHORT).show();
            StaticLogics.isCaseSolvingUnlocked = true;

        }

        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryLearn1_PT_score=0;
        StaticLogics.PrimaryLearn1_PostT_score=0;
    }

    //making the question count 1
    @Override
    protected void onResume() {
        super.onResume();
        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryLearn1_PT_score=0;
        StaticLogics.PrimaryLearn1_PostT_score=0;
    }

    //go to pre test
    //button activity
    public void goToPreTest_PrimaryLearn1(View v){

        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryLearn1_PT_score=0;
        StaticLogics.PrimaryLearn1_PostT_score=0;

        if(StaticLogics.unlocked_primary_Learn_level<1)
        StaticLogics.unlocked_primary_Learn_level = 1;

        StaticLogics.current_PrimaryLearning_LevelRunning = 1;
        Intent intent = new Intent(this, Primary1_PreTest.class);
        startActivity(intent);
        finish();
    }

    public void goToPreTest_PrimaryLearn2(View v){

        if(StaticLogics.unlocked_primary_Learn_level>1 ) {
            StaticLogics.PTquestionNum = 1;
            StaticLogics.PrimaryLearn1_PT_score = 0;
            StaticLogics.PrimaryLearn1_PostT_score = 0;

           StaticLogics.current_PrimaryLearning_LevelRunning = 2;

            Intent intent = new Intent(this, Primary1_PreTest.class);
            startActivity(intent);
            finish();
        }
        else Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }

    public void goToPreTest_PrimaryLearn3 (View v){

        if(StaticLogics.unlocked_primary_Learn_level>2 ) {
            StaticLogics.PTquestionNum = 1;
            StaticLogics.PrimaryLearn1_PT_score = 0;
            StaticLogics.PrimaryLearn1_PostT_score = 0;

            StaticLogics.current_PrimaryLearning_LevelRunning = 3;

            Intent intent = new Intent(this, Primary1_PreTest.class);
            startActivity(intent);
            finish();
        }
        else Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }

    public void locked_PrimaryLearnLevels (View v){

        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_primaryL1) {

            //need to start the main pre-TEST
            //its a dummy for test now
            Intent intent = new Intent(this, PrimaryLevelLearn.class);
            startActivity(intent);


        } else if (id == R.id.nav_primaryL2) {

            //if unlocked do
            if(StaticLogics.isPrimaryLearn2Unlocked){
                //need to start the main pre-TEST
                //its a dummy for test now
//                Intent intent = new Intent(this, PrimaryLevelLearn2.class);
//                startActivity(intent);
            }

            //if not toast
            else {
                Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
            }



        } else if (id == R.id.nav_primaryL3) {

            //if unlocked do
            if(StaticLogics.isPrimaryLearn3Unlocked){
                //need to start the main pre-TEST
                //its a dummy for test now
//                Intent intent = new Intent(this, PrimaryLevelLearn3.class);
//                startActivity(intent);
            }

            //if not toast
            else {
                Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
            }



        } else if (id == R.id.nav_primaryL4) {
            Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();


        } else if (id == R.id.nav_primaryCS1) {

            //if unlocked do
            if(StaticLogics.isCaseSolvingUnlocked){
                //need to start the main pre-TEST
                //its a dummy for test now
                Intent intent = new Intent(this, PrimaryLevelCsaeSolve.class);
                startActivity(intent);
            }

            //if not toast
            else {
                Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
            }


        } else if (id == R.id.nav_primaryCS2) {
            Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_primaryCS3) {
            Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.nav_primaryCS4) {
            Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

            //for testing purpose only
//            StaticLogics.current_PrimaryLearning_LevelRunning=1;
//            Intent intent = new Intent(this, ShowVideo.class);
//            startActivity(intent);


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
