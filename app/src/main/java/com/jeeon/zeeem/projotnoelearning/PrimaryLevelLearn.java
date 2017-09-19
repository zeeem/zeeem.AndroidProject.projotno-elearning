package com.jeeon.zeeem.projotnoelearning;


import android.content.Intent;
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
import android.widget.Toast;

public class PrimaryLevelLearn extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryLearn1_PT_score=0;
    }

    //making the question count 1
    @Override
    protected void onResume() {
        super.onResume();
        StaticLogics.PTquestionNum=1;
        StaticLogics.PrimaryLearn1_PT_score=0;
    }

    //go to pre test
    //button activity
    public void goToPreTest_PrimaryLearn1(View v){
        Intent intent = new Intent(this, Primary1_PreTest.class);
        startActivity(intent);
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

        } else if (id == R.id.nav_primaryCS1) {

            //if unlocked do
            if(StaticLogics.isPrimaryCaseSolve1Unlocked){
                //need to start the main pre-TEST
                //its a dummy for test now
//                Intent intent = new Intent(this, PrimaryLevelSolve1.class);
//                startActivity(intent);
            }

            //if not toast
            else {
                Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();
            }


        } else if (id == R.id.nav_primaryCS2) {

        } else if (id == R.id.nav_primaryCS3) {

        } else if (id == R.id.nav_primaryCS4) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
