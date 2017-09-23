package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TestResult extends AppCompatActivity {

    TextView ResultTitle, PreTestScore, PostTestScore, CommentForResult;
    Button goToNextButton;

    double Final_PretestResult;
    Double Final_PostTestResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);

        // Toast.makeText(this, "POST state=" + StaticLogics.isPostTestCompleted, Toast.LENGTH_SHORT).show();
        StaticLogics.isPostTestCompleted=false;

        ResultTitle = (TextView) findViewById(R.id.resultTitle);
        PreTestScore = (TextView) findViewById(R.id.result_preTest);
        PostTestScore = (TextView) findViewById(R.id.result_PostTest);
        CommentForResult = (TextView) findViewById(R.id.scoreComment);
        goToNextButton = (Button) findViewById(R.id.goToNextStepBtn);

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/kalpurush.ttf");

        //calculating result
        double score_pretest = (double) StaticLogics.PrimaryLearn1_PT_score;
        Final_PretestResult = score_pretest/25*100;

        double score_posttest = (double) StaticLogics.PrimaryLearn1_PostT_score;
        Final_PostTestResult = score_posttest/25*100;

        int finalPostResultForChecking = Integer.valueOf(Final_PostTestResult.intValue());

        if(finalPostResultForChecking>=80){
            StaticLogics.isPostTestCompleted=true;
            // Toast.makeText(this, "POST true - done", Toast.LENGTH_SHORT).show();
        }

        if(StaticLogics.current_PrimaryLearning_LevelRunning==1){
            ResultTitle.setText("চোখের প্রাথমিক ধারনা ফলাফল");
            PreTestScore.setText(Double.toString(Final_PretestResult));
            PostTestScore.setText(Double.toString(Final_PostTestResult));

            //change font to bangla
            PreTestScore.setTypeface(tf);
            PostTestScore.setTypeface(tf);

            if(StaticLogics.isPostTestCompleted){
                //Toast.makeText(this, "POST true - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setVisibility(View.GONE);
                goToNextButton.setText("পরবতী ধাপে যান");
            }
            else {
                // Toast.makeText(this, "POST false - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setText("আপনার পোস্ট-টেস্ট স্কোর ৮০% এর কম হয়েছে");
                goToNextButton.setText("আবার চেষ্টা করুন!");
            }
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==2) {
            ResultTitle.setText("কনজাঙ্কটিভাইটিস টেস্টের ফলাফল");
            PreTestScore.setText(Double.toString(Final_PretestResult));
            PostTestScore.setText(Double.toString(Final_PostTestResult));

            //change font to bangla
            PreTestScore.setTypeface(tf);
            PostTestScore.setTypeface(tf);

            if (StaticLogics.isPostTestCompleted) {
                //Toast.makeText(this, "POST true - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setVisibility(View.GONE);
                goToNextButton.setText("পরবতী ধাপে যান");
            } else {
                // Toast.makeText(this, "POST false - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setText("আপনার পোস্ট-টেস্ট স্কোর ৮০% এর কম হয়েছে");
                goToNextButton.setText("আবার চেষ্টা করুন!");
            }
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==3) {
            ResultTitle.setText("গ্লোকুমা টেস্টের ফলাফল");
            PreTestScore.setText(Double.toString(Final_PretestResult));
            PostTestScore.setText(Double.toString(Final_PostTestResult));
            //change font to bangla
            PreTestScore.setTypeface(tf);
            PostTestScore.setTypeface(tf);

            if (StaticLogics.isPostTestCompleted) {
                //Toast.makeText(this, "POST true - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setVisibility(View.GONE);
                goToNextButton.setText("পরবতী ধাপে যান");
            } else {
                // Toast.makeText(this, "POST false - found", Toast.LENGTH_SHORT).show();
                CommentForResult.setText("আপনার পোস্ট-টেস্ট স্কোর ৮০% এর কম হয়েছে");
                goToNextButton.setText("আবার চেষ্টা করুন!");
            }
        }

    }

    //resultPage's GOTO Button Activity
    public void goToNextStep_result(View view){

        //making all values default to run run the 2nd level
        if(StaticLogics.isPostTestCompleted) {
            if (StaticLogics.unlocked_primary_Learn_level==StaticLogics.current_PrimaryLearning_LevelRunning){
                //new level unlocked
                StaticLogics.unlocked_primary_Learn_level++; //next level unlocked
                //Toast.makeText(this, "unlocked: "+StaticLogics.unlocked_primary_Learn_level + "...now running" + StaticLogics.current_PrimaryLearning_LevelRunning, Toast.LENGTH_SHORT).show();
            }
        }

        StaticLogics.isPostTestCompleted = false;
        StaticLogics.isPreTestCompleted = false;
        StaticLogics.PrimaryLearn1_PT_score = 0;
        StaticLogics.PrimaryLearn1_PostT_score =0;
        StaticLogics.PTquestionNum =1;
        Toast.makeText(this, "new level unlocked", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, PrimaryLevelLearn.class);
        startActivity(intent);
        finish();

    }
}
