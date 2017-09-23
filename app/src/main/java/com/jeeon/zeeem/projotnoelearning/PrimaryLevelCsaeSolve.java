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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PrimaryLevelCsaeSolve extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView primaryCS1, primaryCS2, primaryCS3, primaryCS4;
    ImageView lockedIcon1, lockedIcon2, lockedIcon3, lockedIcon4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary_level_csae_solve);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //making multiple ans false for next attept
        StaticLogics.mul_treatment_Ans_count_1 = false;
        StaticLogics.mul_treatment_Ans_count_2=false;

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        primaryCS1 = (TextView) findViewById(R.id.primaryCase1);
        primaryCS2 = (TextView) findViewById(R.id.primaryCase2);
        primaryCS3 = (TextView) findViewById(R.id.primaryCase3);
        primaryCS4 = (TextView) findViewById(R.id.primaryCase4);

        lockedIcon1 = (ImageView) findViewById(R.id.primaryCase_icon1);
        lockedIcon2 = (ImageView) findViewById(R.id.primaryCase_icon2);
        lockedIcon3 = (ImageView) findViewById(R.id.primaryCase_icon3);
        lockedIcon4 = (ImageView) findViewById(R.id.primaryCase_icon4);

        if(StaticLogics.unlocked_case_solved_level>1){
            primaryCS1.setBackgroundResource(R.drawable.primary_completed_btn);
            primaryCS2.setBackgroundResource(R.drawable.primary_unlocked_btn);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                primaryCS2.setForeground(null);
//            }
            lockedIcon2.setVisibility(View.GONE);
        }
        else if(StaticLogics.unlocked_case_solved_level>2){

            primaryCS1.setBackgroundResource(R.drawable.primary_completed_btn);
            primaryCS2.setBackgroundResource(R.drawable.primary_completed_btn);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                primaryCS2.setForeground(null);
//            }
            lockedIcon2.setVisibility(View.GONE);

            primaryCS3.setBackgroundResource(R.drawable.primary_unlocked_btn);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                primaryCS3.setForeground(null);
//            }
            lockedIcon3.setVisibility(View.GONE);
        }

        StaticLogics.PrimaryCaseSolveScore=0;
    }

    //go to pre test
    //button activity
    public void goToPrimaryCase1(View v){

        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryCaseSolveScore=0;
        if(StaticLogics.unlocked_case_solved_level<1)
            StaticLogics.unlocked_case_solved_level = 1;

        StaticLogics.current_PrimaryCaseSolve_LevelRunning = 1;

        Intent intent = new Intent(this, CaseSymptom.class);
        startActivity(intent);
        finish();
    }

    public void goToPrimaryCase2(View v){

        if(StaticLogics.unlocked_case_solved_level>1 ) {
            StaticLogics.PTquestionNum=1;
            StaticLogics.PrimaryCaseSolveScore=0;

            StaticLogics.current_PrimaryCaseSolve_LevelRunning = 2;

            Intent intent = new Intent(this, CaseSymptom.class);
            startActivity(intent);
            finish();
        }
        else Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
    }

    public void locked_PrimaryLearnLevels (View v){

        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

    }


    //making the question count 1
    @Override
    protected void onResume() {
        super.onResume();
        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryCaseSolveScore=0;

        StaticLogics.mul_treatment_Ans_count_1 = false;
        StaticLogics.mul_treatment_Ans_count_2 = false;
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
//
//            //for testing purpose only
//            StaticLogics.current_PrimaryCaseSolve_LevelRunning=1;
//            Intent intent = new Intent(this, SelectDisease.class);
//            startActivity(intent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
