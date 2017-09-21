package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Primary1_PreTest extends AppCompatActivity {

    TextView PT_introText, PTquestion;
    ImageView PTquestionImage;
    RadioButton ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //StaticLogics.current_PrimaryLearning_LevelRunning = 1;
        //should be set before comming to this event

        if(StaticLogics.isPreTestCompleted){
            setTitle("পোস্ট-টেস্ট");
        }
        else
            setTitle("প্রি-টেস্ট");

        setContentView(R.layout.activity_primary1__pre_test);

        PT_introText = (TextView) findViewById(R.id.preTest_introText);
        PTquestion = (TextView) findViewById(R.id.questionPT);

        PTquestionImage = (ImageView) findViewById(R.id.imagePT);

        ans1 = (RadioButton) findViewById(R.id.ans1_PT);
        ans2 = (RadioButton) findViewById(R.id.ans2_PT);
        ans3 = (RadioButton) findViewById(R.id.ans3_PT);
        ans4 = (RadioButton) findViewById(R.id.ans4_PT);

        if(StaticLogics.current_PrimaryLearning_LevelRunning==1){

            if(!StaticLogics.isPreTestCompleted) {
                //setting PT quesitons (primary learn 1)
                switch (StaticLogics.PTquestionNum) {
                    case 1:
                        PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt1);

                        ans1.setText("ক. আইরিশ");
                        ans2.setText("খ. কনিয়া");
                        ans3.setText("গ. কনজাঙ্কটিভাইটিস");
                        ans4.setText("ঘ. পিউপিল");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt2);

                        ans1.setText("ক. আইরিস");
                        ans2.setText("খ. রেটিনা");
                        ans3.setText("গ. কর্ণিয়া");
                        ans4.setText("ঘ. করোয়েড");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt3);

                        ans1.setText("ক. কনজাঙ্কটিভাইটিস");
                        ans2.setText("খ. ভিট্রাস বডি");
                        ans3.setText("গ. স্কেলেরা");
                        ans4.setText("ঘ. অপটিক নার্ভ");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt4);

                        ans1.setText("ক. আইরিস");
                        ans2.setText("খ. সিলিয়ারী বডি");
                        ans3.setText("গ. স্কর্ণিয়া");
                        ans4.setText("ঘ. রেটিনা");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt5);

                        ans1.setText("ক. পিউপিল");
                        ans2.setText("খ. লেন্স");
                        ans3.setText("গ. করোয়েড");
                        ans4.setText("ঘ. কনজাঙ্কটিভাইটিস");


                        break;

                    case 6:

                        StaticLogics.PTquestionNum = 1;
                        StaticLogics.isPreTestCompleted = true;
                        Intent i = new Intent(this, ShowVideo.class);
                        startActivity(i);
                        finish();


                        break;

                    default:

                        StaticLogics.PTquestionNum = 1;
                        Intent intent = new Intent(this, LearningLevels.class);
                        startActivity(intent);
                        finish();

                        break;
                }

            } else { //its is POST TEST

                switch (StaticLogics.PTquestionNum) {
                    case 1:
                        PT_introText.setText("নিম্নের প্রশ্নগুলোর উত্তর দিয়ে নিজেকে যাচাই করুন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt1);

                        ans1.setText("ক. আইরিশ");
                        ans2.setText("খ. কনিয়া");
                        ans3.setText("গ. কনজাঙ্কটিভাইটিস");
                        ans4.setText("ঘ. পিউপিল");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt2);

                        ans1.setText("ক. আইরিস");
                        ans2.setText("খ. রেটিনা");
                        ans3.setText("গ. কর্ণিয়া");
                        ans4.setText("ঘ. করোয়েড");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt3);

                        ans1.setText("ক. কনজাঙ্কটিভাইটিস");
                        ans2.setText("খ. ভিট্রাস বডি");
                        ans3.setText("গ. স্কেলেরা");
                        ans4.setText("ঘ. অপটিক নার্ভ");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt4);

                        ans1.setText("ক. আইরিস");
                        ans2.setText("খ. সিলিয়ারী বডি");
                        ans3.setText("গ. স্কর্ণিয়া");
                        ans4.setText("ঘ. রেটিনা");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: নিচের তির চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt5);

                        ans1.setText("ক. পিউপিল");
                        ans2.setText("খ. লেন্স");
                        ans3.setText("গ. করোয়েড");
                        ans4.setText("ঘ. কনজাঙ্কটিভাইটিস");


                        break;

                    case 6:

                        StaticLogics.PTquestionNum = 1;
                        StaticLogics.isPostTestCompleted = true;
                        Intent i = new Intent(this, TestResult.class); //goto RESULT PAGE
                        startActivity(i);
                        finish();


                        break;

                    default:

                        StaticLogics.PTquestionNum = 1;
                        Intent intent = new Intent(this, LearningLevels.class);
                        startActivity(intent);
                        finish();

                        break;
                }


            }


        }

        else if(StaticLogics.current_PrimaryLearning_LevelRunning==2){



        }

        else if(StaticLogics.current_PrimaryLearning_LevelRunning==3){



        }





    }


    //checking answers depending on the level is going on
    public void goToNextQuestion_PT(View v){

        if(ans1.isChecked()){
            switch (StaticLogics.current_PrimaryLearning_LevelRunning){
                case 1:

                    if(StaticLogics.PTquestionNum==2  ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }

                    break;
                case 2:


                    break;
                case 3:


                    break;
            }


        }
        else if(ans2.isChecked()){

            switch (StaticLogics.current_PrimaryLearning_LevelRunning){
                case 1:

                    if(StaticLogics.PTquestionNum==5 ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }

                    break;
                case 2:


                    break;
                case 3:

                    break;
            }

        }
        else if(ans3.isChecked()){
            switch (StaticLogics.current_PrimaryLearning_LevelRunning){
                case 1:

                    if(StaticLogics.PTquestionNum==3 || StaticLogics.PTquestionNum==4  ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }

                    break;
                case 2:


                    break;
                case 3:

                    break;
            }

        }
        else if(ans4.isChecked()){
            switch (StaticLogics.current_PrimaryLearning_LevelRunning){
                case 1:

                    if(StaticLogics.PTquestionNum==1){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }
                    break;
                case 2:


                    break;
                case 3:

                    break;
            }

        }


        if(ans1.isChecked() | ans2.isChecked() | ans3.isChecked() | ans4.isChecked()) {
            StaticLogics.PTquestionNum++;
            Intent intent2 = new Intent(this, Primary1_PreTest.class);
            startActivity(intent2);
            finish();

            if(!StaticLogics.isPreTestCompleted)
                Toast.makeText(this, "your PreTest score is : " + StaticLogics.PrimaryLearn1_PT_score + " & " + StaticLogics.PrimaryLearn1_PostT_score,
                        Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "your PostTest score is : " + StaticLogics.PrimaryLearn1_PostT_score + " & " + StaticLogics.PrimaryLearn1_PT_score  ,
                        Toast.LENGTH_SHORT).show();

        }
        else Toast.makeText(this, "please select an answer",
                Toast.LENGTH_SHORT).show();
    }
}
