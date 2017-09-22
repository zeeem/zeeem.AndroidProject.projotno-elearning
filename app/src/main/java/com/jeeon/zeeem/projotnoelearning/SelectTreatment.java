package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class SelectTreatment extends AppCompatActivity {

    LinearLayout buttonLayoutToShuffle;
    TextView treatmentText;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_treatment);

        treatmentText = (TextView) findViewById(R.id.treatmentText);

        b1 = (Button) findViewById(R.id.treatmentBtn1);
        b2 = (Button) findViewById(R.id.treatmentBtn2);
        b3 = (Button) findViewById(R.id.treatmentBtn3);
        b4 = (Button) findViewById(R.id.treatmentBtn4);


        buttonLayoutToShuffle = (LinearLayout) findViewById(R.id.buttonLayoutToShuffle);

        //for shuffling answers
        Random random = new Random();
        int numberOfMethods = 4;
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
            case 3:
                shuffle4();
                break;
            default:
                shuffle3();
                break;
        }

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            treatmentText.setText("নিস্নে গ্লোকোমা এর জন্য সম্ভাব্য কয়েকটি চিকিৎসা উল্লেখ করা হয়েছে। আপনি উপযুক্ত চিকিৎসা/গুলো নিবাচন করুন");

            b1.setText("এন্টিব্যায়োটিক আই ড্রপ");
            b2.setText("স্টেরয়েড আই ড্রপ");
            b3.setText("রেফার করে দিন");
            b4.setText("হোম এ্যাডভাইস");

        }
    }

    public void treatmentBtn1_clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b1.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন এ্যাট্রোপিন ১% আই ড্রপ এক্ষেত্রে ব্যবহার করা হয় না।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b1.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন এন্টিব্যায়োটিক আই ড্রপ এক্ষেত্রে ব্যবহার করা হয় না।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });

        }

    }

    public void treatmentBtn2_clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            if(!StaticLogics.mul_treatment_Ans_count_1){

            //change score
            StaticLogics.PrimaryCaseSolveScore += 5;
            StaticLogics.mul_treatment_Ans_count_1=true;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b2.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.GONE);
            correctAns_disease.setVisibility(View.VISIBLE);

            diseaseAnsDetails.setText("কারন ক্লোরামফেনিকল ০.৫% আই ড্রপ এই রোগের জন্য প্রথম চিকিৎসা।");
            nextDiseaseSelectStep.setText("পরবতী ধাপে যান");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(StaticLogics.mul_treatment_Ans_count_1 && StaticLogics.mul_treatment_Ans_count_2){

                        Intent intent = new Intent(SelectTreatment.this, CaseResult.class);
                        startActivity(intent);
                        finish();

                    }
                    else {
                        //start a new dialog
                        subDialog();
                        //finish();
                    }

                }
            });

            }

            else
                Toast.makeText(this, "You have already selected this answer", Toast.LENGTH_SHORT).show();

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b2.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন স্টেরয়েড আই ড্রপ এক্ষেত্রে ব্যবহার করা হয় না।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }

    public void treatmentBtn3_clicked(View view){

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b3.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন এখনই এই রোগীকে রেফার করার প্রয়োজন নাই।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
            //change score
            StaticLogics.PrimaryCaseSolveScore += 5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b3.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.GONE);
            correctAns_disease.setVisibility(View.VISIBLE);

            diseaseAnsDetails.setText("কারন এক্ষেত্রে একজন চক্ষু বিশেষজ্ঞের সরনাপন্ন হওয়া অতীব জরুরী।");
            nextDiseaseSelectStep.setText("পরবতী ধাপে যান");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, CaseResult.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }


    public void treatmentBtn4_clicked(View view){


        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){

            if(!StaticLogics.mul_treatment_Ans_count_2){

                //change score
                StaticLogics.PrimaryCaseSolveScore += 5;
                StaticLogics.mul_treatment_Ans_count_2=true;


                AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
                View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
                final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
                final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
                final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
                final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
                Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

                selectedDiseaseName.setText(b4.getText());
                //for wrong ans
                wrongAns_disease.setVisibility(View.GONE);
                correctAns_disease.setVisibility(View.VISIBLE);

                diseaseAnsDetails.setText("কারন এক্ষেত্রে চোখে নরম কাপড় দিয়ে মৃদু গরম সেক দিলে আরাম পাওয়া যায়। ");
                nextDiseaseSelectStep.setText("পরবতী ধাপে যান");

                mBuilder.setView(mView);
                AlertDialog dialog = mBuilder.create();
                dialog.show();

                nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(StaticLogics.mul_treatment_Ans_count_1 && StaticLogics.mul_treatment_Ans_count_2){

                            Intent intent = new Intent(SelectTreatment.this, CaseResult.class);
                            startActivity(intent);
                            finish();

                        }
                        else {
                            //start a new dialog
                            subDialog();
                            //finish();
                        }
                    }
                });

            }

            else
                Toast.makeText(this, "You have already selected this answer", Toast.LENGTH_SHORT).show();

    }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
            //change score
            StaticLogics.PrimaryCaseSolveScore -= 2.5;


            AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
            View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
            final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
            final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
            final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
            final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
            Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

            selectedDiseaseName.setText(b4.getText());
            //for wrong ans
            wrongAns_disease.setVisibility(View.VISIBLE);
            correctAns_disease.setVisibility(View.GONE);

            diseaseAnsDetails.setText("কারন এক্ষেত্রে একজন চক্ষু বিশেষজ্ঞের সরনাপন্ন হওয়া অতীব জরুরী।");
            nextDiseaseSelectStep.setText("দয়া করে আবার চেষ্টা করুন");

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();

            nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                    startActivity(intent);
                    finish();

                }
            });


        }

    }


    public void subDialog(){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(SelectTreatment.this);
        View mView = getLayoutInflater().inflate(R.layout.select_disease_dialog_window, null);
        final TextView selectedDiseaseName = (TextView) mView.findViewById(R.id.selectedDiseaseName);
        final TextView wrongAns_disease = (TextView) mView.findViewById(R.id.wrongAns_disease);
        final TextView correctAns_disease = (TextView) mView.findViewById(R.id.correctAns_disease);
        final TextView diseaseAnsDetails = (TextView) mView.findViewById(R.id.diseaseAnsDetails);
        Button nextDiseaseSelectStep = (Button) mView.findViewById(R.id.nextDiseaseSelectStep);

        selectedDiseaseName.setVisibility(View.GONE);
        //for wrong ans
        wrongAns_disease.setVisibility(View.GONE);
        correctAns_disease.setVisibility(View.VISIBLE);
        correctAns_disease.setText("আপনার আরও সঠিক উত্তর রয়েছে। চুড়ান্ত ফলাফলের জন্য সঠিক উত্তর/গুলো নিবাচন করুন।");

        diseaseAnsDetails.setVisibility(View.GONE);
        nextDiseaseSelectStep.setText(" পরবতী ধাপে যান");

        mBuilder.setView(mView);
        AlertDialog dialog = mBuilder.create();
        dialog.show();

        nextDiseaseSelectStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SelectTreatment.this, SelectTreatment.class);
                startActivity(intent);
                finish();

            }
        });


    }


    //shuffle methods
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
        buttonLayoutToShuffle.addView(children[3]);
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
        buttonLayoutToShuffle.addView(children[3]);
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
        buttonLayoutToShuffle.addView(children[3]);


    }

    public void shuffle4(){

        int childcount = buttonLayoutToShuffle.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = buttonLayoutToShuffle.getChildAt(i);
        }

        //now remove all children
        buttonLayoutToShuffle.removeAllViews();

        buttonLayoutToShuffle.addView(children[3]);

        buttonLayoutToShuffle.addView(children[1]);
        //first position
        buttonLayoutToShuffle.addView(children[0]);
        //second position
        buttonLayoutToShuffle.addView(children[2]);
        //third position


    }
}
