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

            if(!StaticLogics.isPreTestCompleted) {
                //setting PT quesitons (primary learn 2)
                switch (StaticLogics.PTquestionNum) {
                    case 1:
                        PT_introText.setText("কনজাঙ্কটিভাইটিস সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিচের কোনটি চোখ উঠার লক্ষণ না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখ লাল হয়ে যাওয়া");
                        ans2.setText("খ. হঠাৎ করে চোখের দৃষ্টিশক্তি কমে আসা");
                        ans3.setText("গ. চোখে হলুদ রংএর পিঁচুটি জমে থাকা ");
                        ans4.setText("ঘ. চোখের ভেতরে খচখচ করা");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস হয় না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. ব্যাক্টেরিয়াল ইনফেকশন");
                        ans2.setText("খ. চোখ উঠা রোগীর চোখর দিকে অনেকক্ষণ তাকিয়ে থাকলে");
                        ans3.setText("গ. ভাইরাল ইনফেকশন");
                        ans4.setText("ঘ. অ্যালার্জি জনিত কারণে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস ছড়াতে পারে?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখে ঠান্ডা  বাতাস লাগলে");
                        ans2.setText("খ. আক্রান্ত রোগীর চোখের দিকে তাকালে");
                        ans3.setText("গ. আক্রান্ত রোগীর চোখ পরীক্ষা করার পর হাত সঠিকভাবে পরিস্কার না করে অন্য রোগী দেখলে");
                        ans4.setText("ঘ. দুষিত পানি পান করলে");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিম্নলিখিত কোন উপায়ে কনজাঙ্কটিভাইটিস রোগের চিকিৎসা করা হয়?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. সব ধরনের কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans2.setText("খ. কোন চিকিৎসার প্রয়োজন নাই,  ৭-১৫ দিনের মধ্যে আপনা আপনি ভালো হয়ে যাবে");
                        ans3.setText("গ. কেবলমাত্র ব্যাকটেরিয়া জনিত কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans4.setText("ঘ. সব ধরনের কনজাঙ্কটিভাইটিস-এ  ষ্টেরয়েড ড্রপ / মলম দিতে হবে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন -");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. এটি কোন ছোঁয়াচে রোগ নয়");
                        ans2.setText("খ. মায়ের গনোরিয়া থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans3.setText("গ. মায়ের হেপাটাইটিস বি  থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans4.setText("ঘ. কনজাঙ্কটিভাইটিস-এর প্রতিশোধক হিসাবে টিকা দেয় যেতে পারে");


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
                        PTquestion.setText("প্র-১: নিচের কোনটি চোখ উঠার লক্ষণ না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখ লাল হয়ে যাওয়া");
                        ans2.setText("খ. হঠাৎ করে চোখের দৃষ্টিশক্তি কমে আসা");
                        ans3.setText("গ. চোখে হলুদ রংএর পিঁচুটি জমে থাকা ");
                        ans4.setText("ঘ. চোখের ভেতরে খচখচ করা");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস হয় না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. ব্যাক্টেরিয়াল ইনফেকশন");
                        ans2.setText("খ. চোখ উঠা রোগীর চোখর দিকে অনেকক্ষণ তাকিয়ে থাকলে");
                        ans3.setText("গ. ভাইরাল ইনফেকশন");
                        ans4.setText("ঘ. অ্যালার্জি জনিত কারণে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস ছড়াতে পারে?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখে ঠান্ডা  বাতাস লাগলে");
                        ans2.setText("খ. আক্রান্ত রোগীর চোখের দিকে তাকালে");
                        ans3.setText("গ. আক্রান্ত রোগীর চোখ পরীক্ষা করার পর হাত সঠিকভাবে পরিস্কার না করে অন্য রোগী দেখলে");
                        ans4.setText("ঘ. দুষিত পানি পান করলে");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিম্নলিখিত কোন উপায়ে কনজাঙ্কটিভাইটিস রোগের চিকিৎসা করা হয়?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. সব ধরনের কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans2.setText("খ. কোন চিকিৎসার প্রয়োজন নাই,  ৭-১৫ দিনের মধ্যে আপনা আপনি ভালো হয়ে যাবে");
                        ans3.setText("গ. কেবলমাত্র ব্যাকটেরিয়া জনিত কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans4.setText("ঘ. সব ধরনের কনজাঙ্কটিভাইটিস-এ  ষ্টেরয়েড ড্রপ / মলম দিতে হবে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন -");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. এটি কোন ছোঁয়াচে রোগ নয়");
                        ans2.setText("খ. মায়ের গনোরিয়া থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans3.setText("গ. মায়ের হেপাটাইটিস বি  থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans4.setText("ঘ. কনজাঙ্কটিভাইটিস-এর প্রতিশোধক হিসাবে টিকা দেয় যেতে পারে");


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

        else if(StaticLogics.current_PrimaryLearning_LevelRunning==3){


            if(!StaticLogics.isPreTestCompleted) {
                //setting PT quesitons (primary learn 3)
                switch (StaticLogics.PTquestionNum) {
                    case 1:
                        PT_introText.setText("গ্লোকুমা সম্পকিত নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিম্নলিখিত কারণে গ্লোকুমা রোগ সৃষ্টি হয় ?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. ব্যাক্টেরিয়া জনিত কারণে");
                        ans2.setText("খ. ভাইরাস জনিত কারণে");
                        ans3.setText("গ. অ্যাকুয়াস হিউমার চলাচলে বাধার সৃষ্টি হয়ে চোখের ভেতরের চাপ বেড়ে গেলে");
                        ans4.setText("ঘ. চোখের পাওয়ারের পরিবর্ত হলে");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমা হলে …..?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখে প্রচন্ড ব্যথা থাকবে");
                        ans2.setText("খ. চোখে ঝাপসা দেখবে");
                        ans3.setText("গ. চোখ খচখচ করবে");
                        ans4.setText("ঘ. ঘন ঘন চোখের পাওয়ার পরিবর্তন হবে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: সঠিক উত্তরটি চিহ্নিত করুন");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. গ্লোকুমা একটি ছোঁয়াচে রোগ");
                        ans2.setText("খ. গ্লোকুমা হলে চোখের লেন্স ঘোলাটে হয়ে যায়");
                        ans3.setText("গ. গ্লোকুমা একটি মেডিকেল ইমার্জেন্সী- জরুরী ভিত্তিতে এর চিকিৎসা হওয়া প্রয়োজন");
                        ans4.setText("ঘ. বিনা অপারেশনেই এই রোগটির চিকিৎসা করা হয়");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমার ঝুঁকি যুক্ত কারণ");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. নিজ আত্মীয়ের সংগে বিয়ে হলে");
                        ans2.setText("খ. গ্লোকুমার পারিবারিক ইতিহাস থাকলে");
                        ans3.setText("গ. ডায়াবেটিস আক্রান্ত হলে");
                        ans4.setText("ঘ. দীর্ঘদিন যাবত ষ্টেরয়েড জাতীয় ওষুধ গ্রহন করলে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন: গ্লোকুমা রোগ যে ভাবে ছড়ায়:");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. আক্রান্ত রোগীর ব্যবহৃত তোয়ালে বা রুমাল ব্যবহার করলে");
                        ans2.setText("খ. আক্রান্ত রোগীর সংগে মেলামিশা করলে");
                        ans3.setText("গ. গময় মত চিকিৎসা না করলে");
                        ans4.setText("ঘ. উপরের কোনটাই ঠিক নয়");


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
                        PT_introText.setText("গ্লোকুমা সম্পকিত নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিম্নলিখিত কারণে গ্লোকুমা রোগ সৃষ্টি হয় ?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. ব্যাক্টেরিয়া জনিত কারণে");
                        ans2.setText("খ. ভাইরাস জনিত কারণে");
                        ans3.setText("গ. অ্যাকুয়াস হিউমার চলাচলে বাধার সৃষ্টি হয়ে চোখের ভেতরের চাপ বেড়ে গেলে");
                        ans4.setText("ঘ. চোখের পাওয়ারের পরিবর্ত হলে");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমা হলে …..?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. চোখে প্রচন্ড ব্যথা থাকবে");
                        ans2.setText("খ. চোখে ঝাপসা দেখবে");
                        ans3.setText("গ. চোখ খচখচ করবে");
                        ans4.setText("ঘ. ঘন ঘন চোখের পাওয়ার পরিবর্তন হবে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: সঠিক উত্তরটি চিহ্নিত করুন");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. গ্লোকুমা একটি ছোঁয়াচে রোগ");
                        ans2.setText("খ. গ্লোকুমা হলে চোখের লেন্স ঘোলাটে হয়ে যায়");
                        ans3.setText("গ. গ্লোকুমা একটি মেডিকেল ইমার্জেন্সী- জরুরী ভিত্তিতে এর চিকিৎসা হওয়া প্রয়োজন");
                        ans4.setText("ঘ. বিনা অপারেশনেই এই রোগটির চিকিৎসা করা হয়");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমার ঝুঁকি যুক্ত কারণ");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. নিজ আত্মীয়ের সংগে বিয়ে হলে");
                        ans2.setText("খ. গ্লোকুমার পারিবারিক ইতিহাস থাকলে");
                        ans3.setText("গ. ডায়াবেটিস আক্রান্ত হলে");
                        ans4.setText("ঘ. দীর্ঘদিন যাবত ষ্টেরয়েড জাতীয় ওষুধ গ্রহন করলে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পকিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন: গ্লোকুমা রোগ যে ভাবে ছড়ায়:");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ক. আক্রান্ত রোগীর ব্যবহৃত তোয়ালে বা রুমাল ব্যবহার করলে");
                        ans2.setText("খ. আক্রান্ত রোগীর সংগে মেলামিশা করলে");
                        ans3.setText("গ. গময় মত চিকিৎসা না করলে");
                        ans4.setText("ঘ. উপরের কোনটাই ঠিক নয়");


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

                    if(StaticLogics.PTquestionNum== 4 ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }

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

                    if(StaticLogics.PTquestionNum==1 || StaticLogics.PTquestionNum==2 || StaticLogics.PTquestionNum==5){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }


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

                    if(StaticLogics.PTquestionNum==3 || StaticLogics.PTquestionNum==4 ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }


                    break;
                case 3:

                    if(StaticLogics.PTquestionNum==1 || StaticLogics.PTquestionNum==2 || StaticLogics.PTquestionNum==3 ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }


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

                    if(StaticLogics.PTquestionNum==5 ){
                        if(!StaticLogics.isPreTestCompleted)
                            StaticLogics.PrimaryLearn1_PT_score+=5;
                        else
                            StaticLogics.PrimaryLearn1_PostT_score+=5;
                    }

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
