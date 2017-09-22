package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class SelectDisease extends AppCompatActivity {

    LinearLayout buttonLayoutToShuffle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_disease);

        buttonLayoutToShuffle = (LinearLayout) findViewById(R.id.buttonLayoutToShuffle);

        //for shuffling answers
        Random random = new Random();
        int numberOfMethods = 3;
        switch(random.nextInt(numberOfMethods)) {
            case 0:
                shuffle3();
                break;
            case 1:
                shuffle2();
                break;
            case 2:
                shuffle1();
                break;
            default:
                shuffle3();
                break;
        }

    }


    public void ans1Clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("ক্যাটারাক্ট");
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারণ এক্ষেত্রে যে লক্ষণগুলো ছিল তা ক্যাটারাক্ট এর সাথে সম্পকিত নয়।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectDisease.class);
                    startActivity(intent);
                    finish();

                }
            });

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
//change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("ক্যাটারাক্ট");
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারণ এক্ষেত্রে যে লক্ষণগুলো ছিল তা ক্যাটারাক্ট এর সাথে সম্পকিত নয়।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectDisease.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }

    public void ans2Clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("গ্লুকোমা");
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারণ এক্ষেত্রে যে লক্ষণগুলো ছিল তা গ্লুকোমার সাথে সম্পকিত নয়।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectDisease.class);
                    startActivity(intent);
                    finish();

                }
            });

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            //change score
            StaticLogics.PrimaryCaseSolveScore += 5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("গ্লুকোমা");
            //for wrong ans
            wrongAns_disease.setVisibility(View.GONE);
            correctAns_disease.setVisibility(View.VISIBLE);

            diseaseAnsDetails.setText("কারন আপনি যে লক্ষনগুলো নিবাচন করেছেন তা গ্লুকোমা এর সাথে সম্পকিত।");
            nextDiseaseSelectStep.setText("চিকিৎসা দেয়ার জন্য পরবতী ধাপে যান");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }

    public void ans3Clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            //change score
            StaticLogics.PrimaryCaseSolveScore += 5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("কনজাঙ্কটিভাইটিস");
            //for wrong ans
            wrongAns_disease.setVisibility(View.GONE);
            correctAns_disease.setVisibility(View.VISIBLE);

            diseaseAnsDetails.setText("কারণ এক্ষেত্রে যে লক্ষণগুলো ছিল তা কনজাঙ্কটিভাইটিস এর সাথে পুরোপুরি সম্পকিত।");
            nextDiseaseSelectStep.setText("চিকিৎসা দেয়ার জন্য পরবতী ধাপে যান");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectDisease.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText("কনজাঙ্কটিভাইটিস");
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন এক্ষেত্রে যে লক্ষনগুলো ছিল তা কনজাঙ্কটিভাইটিস এর সাথে সম্পকিত নয়।");
            nextDiseaseSelectStep.setText("দয়াকরে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectDisease.this, SelectDisease.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }


    public void shuffle1(){

        int childcount = buttonLayoutToShuffle.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = buttonLayoutToShuffle.getChildAt(i);
        }

        //now remove all children
        buttonLayoutToShuffle.removeAllViews();

        //first position
        buttonLayoutToShuffle.addView(children[2]);
        //second position
        buttonLayoutToShuffle.addView(children[0]);
        //third position
        buttonLayoutToShuffle.addView(children[1]);
    }

    public void shuffle2(){

        int childcount = buttonLayoutToShuffle.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = buttonLayoutToShuffle.getChildAt(i);
        }

        //now remove all children
        buttonLayoutToShuffle.removeAllViews();

        //first position
        buttonLayoutToShuffle.addView(children[1]);
        //second position
        buttonLayoutToShuffle.addView(children[2]);
        //third position
        buttonLayoutToShuffle.addView(children[0]);

    }
    public void shuffle3(){

        int childcount = buttonLayoutToShuffle.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = buttonLayoutToShuffle.getChildAt(i);
        }

        //now remove all children
        buttonLayoutToShuffle.removeAllViews();

        buttonLayoutToShuffle.addView(children[0]);
        //first position
        buttonLayoutToShuffle.addView(children[1]);
        //second position
        buttonLayoutToShuffle.addView(children[2]);
        //third position


    }



}

