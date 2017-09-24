package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Primary1_PreTest extends AppCompatActivity {

    TextView PT_introText, PTquestion;
    ImageView PTquestionImage;
    RadioButton ans1, ans2, ans3, ans4;
    RadioGroup ans_RadioGroup;
    Button nextQuesButton_PT;

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
        ans_RadioGroup = (RadioGroup) findViewById(R.id.ans_RadioGroup);
        nextQuesButton_PT = (Button) findViewById(R.id.nextQuesButton_PT);

        ans1 = (RadioButton) findViewById(R.id.ans1_PT);
        ans2 = (RadioButton) findViewById(R.id.ans2_PT);
        ans3 = (RadioButton) findViewById(R.id.ans3_PT);
        ans4 = (RadioButton) findViewById(R.id.ans4_PT);

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
        //shuffling done

        if(StaticLogics.current_PrimaryLearning_LevelRunning==1){

            if(!StaticLogics.isPreTestCompleted) {
                //setting PT quesitons (primary learn 1)
                switch (StaticLogics.PTquestionNum) {
                    case 1:
                        PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt1);

                        ans1.setText("আইরিশ");
                        ans2.setText("কর্ণিয়া");
                        ans3.setText("কনজাঙ্কটিভাইটিস");
                        ans4.setText("পিউপিল");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt2);

                        ans1.setText("আইরিস");
                        ans2.setText("রেটিনা");
                        ans3.setText("কর্ণিয়া");
                        ans4.setText("করোয়েড");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt3);

                        ans1.setText("কনজাঙ্কটিভাইটিস");
                        ans2.setText("ভিট্রাস বডি");
                        ans3.setText("স্কেলেরা");
                        ans4.setText("অপটিক নার্ভ");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt4);

                        ans1.setText("আইরিস");
                        ans2.setText("সিলিয়ারী বডি");
                        ans3.setText("কর্ণিয়া");
                        ans4.setText("রেটিনা");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt5);

                        ans1.setText("পিউপিল");
                        ans2.setText("লেন্স");
                        ans3.setText("করোয়েড");
                        ans4.setText("কনজাঙ্কটিভাইটিস");

                        nextQuesButton_PT.setText("পরবর্তী ধাপে যান");


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
                        PTquestion.setText("প্র-১: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt1);

                        ans1.setText("আইরিশ");
                        ans2.setText("কর্ণিয়া");
                        ans3.setText("কনজাঙ্কটিভাইটিস");
                        ans4.setText("পিউপিল");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt2);

                        ans1.setText("আইরিস");
                        ans2.setText("রেটিনা");
                        ans3.setText("কর্ণিয়া");
                        ans4.setText("করোয়েড");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt3);

                        ans1.setText("কনজাঙ্কটিভাইটিস");
                        ans2.setText("ভিট্রাস বডি");
                        ans3.setText("স্কেলেরা");
                        ans4.setText("অপটিক নার্ভ");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt4);

                        ans1.setText("আইরিস");
                        ans2.setText("সিলিয়ারী বডি");
                        ans3.setText("কর্ণিয়া");
                        ans4.setText("রেটিনা");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: নিচের তীর চিহ্নিত অংশটির নাম কি?");

                        PTquestionImage.setImageResource(R.drawable.pl_pt5);

                        ans1.setText("পিউপিল");
                        ans2.setText("লেন্স");
                        ans3.setText("করোয়েড");
                        ans4.setText("কনজাঙ্কটিভাইটিস");
                        nextQuesButton_PT.setText("ফলাফল দেখুন");

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
                        PT_introText.setText("কনজাঙ্কটিভাইটিস সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
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

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস হয় না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ব্যাক্টেরিয়াল ইনফেকশন");
                        ans2.setText("চোখ উঠা রোগীর চোখর দিকে অনেকক্ষণ তাকিয়ে থাকলে");
                        ans3.setText("ভাইরাল ইনফেকশন");
                        ans4.setText("অ্যালার্জি জনিত কারণে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস ছড়াতে পারে?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("চোখে ঠান্ডা  বাতাস লাগলে");
                        ans2.setText("আক্রান্ত রোগীর চোখের দিকে তাকালে");
                        ans3.setText("আক্রান্ত রোগীর চোখ পরীক্ষা করার পর হাত সঠিকভাবে পরিস্কার না করে অন্য রোগী দেখলে");
                        ans4.setText("দুষিত পানি পান করলে");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিম্নলিখিত কোন উপায়ে কনজাঙ্কটিভাইটিস রোগের চিকিৎসা করা হয়?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("সব ধরনের কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans2.setText("কোন চিকিৎসার প্রয়োজন নাই,  ৭-১৫ দিনের মধ্যে আপনা আপনি ভালো হয়ে যাবে");
                        ans3.setText("কেবলমাত্র ব্যাকটেরিয়া জনিত কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans4.setText("সব ধরনের কনজাঙ্কটিভাইটিস-এ  ষ্টেরয়েড ড্রপ / মলম দিতে হবে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন -");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("এটি কোন ছোঁয়াচে রোগ নয়");
                        ans2.setText("মায়ের গনোরিয়া থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans3.setText("মায়ের হেপাটাইটিস বি  থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans4.setText("কনজাঙ্কটিভাইটিস-এর প্রতিশোধক হিসাবে টিকা দেয় যেতে পারে");

                        nextQuesButton_PT.setText("পরবর্তী ধাপে যান");

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

                        ans1.setText("চোখ লাল হয়ে যাওয়া");
                        ans2.setText("হঠাৎ করে চোখের দৃষ্টিশক্তি কমে আসা");
                        ans3.setText("চোখে হলুদ রংএর পিঁচুটি জমে থাকা ");
                        ans4.setText("চোখের ভেতরে খচখচ করা");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস হয় না?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ব্যাক্টেরিয়াল ইনফেকশন");
                        ans2.setText("চোখ উঠা রোগীর চোখর দিকে অনেকক্ষণ তাকিয়ে থাকলে");
                        ans3.setText("ভাইরাল ইনফেকশন");
                        ans4.setText("অ্যালার্জি জনিত কারণে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: নিম্নলিখিত কোন কারনে কনজাঙ্কটিভাইটিস ছড়াতে পারে?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("চোখে ঠান্ডা  বাতাস লাগলে");
                        ans2.setText("আক্রান্ত রোগীর চোখের দিকে তাকালে");
                        ans3.setText("আক্রান্ত রোগীর চোখ পরীক্ষা করার পর হাত সঠিকভাবে পরিস্কার না করে অন্য রোগী দেখলে");
                        ans4.setText("দুষিত পানি পান করলে");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: নিম্নলিখিত কোন উপায়ে কনজাঙ্কটিভাইটিস রোগের চিকিৎসা করা হয়?");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("সব ধরনের কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans2.setText("কোন চিকিৎসার প্রয়োজন নাই,  ৭-১৫ দিনের মধ্যে আপনা আপনি ভালো হয়ে যাবে");
                        ans3.setText("কেবলমাত্র ব্যাকটেরিয়া জনিত কনজাঙ্কটিভাইটিস-এ অ্যান্টিবাইওটিক ড্রপ / মলম দিতে হবে");
                        ans4.setText("সব ধরনের কনজাঙ্কটিভাইটিস-এ  ষ্টেরয়েড ড্রপ / মলম দিতে হবে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন -");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("এটি কোন ছোঁয়াচে রোগ নয়");
                        ans2.setText("মায়ের গনোরিয়া থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans3.setText("মায়ের হেপাটাইটিস বি  থাকলে শিশু জন্মের সময় কনজাঙ্কটিভাইটিস-এ আক্রান্ত হতে পারে");
                        ans4.setText("কনজাঙ্কটিভাইটিস-এর প্রতিশোধক হিসাবে টিকা দেয় যেতে পারে");

                        nextQuesButton_PT.setText("ফলাফল দেখুন");
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
                        PT_introText.setText("গ্লোকুমা সম্পর্কিত নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিম্নলিখিত কারণে গ্লোকুমা রোগ সৃষ্টি হয় ?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ব্যাক্টেরিয়া জনিত কারণে");
                        ans2.setText("ভাইরাস জনিত কারণে");
                        ans3.setText("অ্যাকুয়াস হিউমার চলাচলে বাধার সৃষ্টি হয়ে চোখের ভেতরের চাপ বেড়ে গেলে");
                        ans4.setText("চোখের পাওয়ারের পরিবর্তন হলে");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমা হলে …..?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("চোখে প্রচন্ড ব্যথা থাকবে");
                        ans2.setText("চোখে ঝাপসা দেখবে");
                        ans3.setText("চোখ খচখচ করবে");
                        ans4.setText("ঘন ঘন চোখের পাওয়ার পরিবর্তন হবে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: সঠিক উত্তরটি চিহ্নিত করুন");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("গ্লোকুমা একটি ছোঁয়াচে রোগ");
                        ans2.setText("গ্লোকুমা হলে চোখের লেন্স ঘোলাটে হয়ে যায়");
                        ans3.setText("গ্লোকুমা একটি মেডিকেল ইমার্জেন্সী- জরুরী ভিত্তিতে এর চিকিৎসা হওয়া প্রয়োজন");
                        ans4.setText("বিনা অপারেশনেই এই রোগটির চিকিৎসা করা হয়");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমার ঝুঁকি যুক্ত কারণ");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("নিজ আত্মীয়ের সংগে বিয়ে হলে");
                        ans2.setText("গ্লোকুমার পারিবারিক ইতিহাস থাকলে");
                        ans3.setText("ডায়াবেটিস আক্রান্ত হলে");
                        ans4.setText("দীর্ঘদিন যাবত ষ্টেরয়েড জাতীয় ওষুধ গ্রহন করলে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন: গ্লোকুমা রোগ যে ভাবে ছড়ায়:");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("আক্রান্ত রোগীর ব্যবহৃত তোয়ালে বা রুমাল ব্যবহার করলে");
                        ans2.setText("আক্রান্ত রোগীর সংগে মেলামিশা করলে");
                        ans3.setText("সময় মত চিকিৎসা না করলে");
                        ans4.setText("উপরের কোনটাই ঠিক নয়");

                        nextQuesButton_PT.setText("পরবর্তী ধাপে যান");

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
                        PT_introText.setText("গ্লোকুমা সম্পর্কিত নিম্নের প্রশ্নগুলোর উত্তর দিন");
//                PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-১: নিম্নলিখিত কারণে গ্লোকুমা রোগ সৃষ্টি হয় ?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt1);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("ব্যাক্টেরিয়া জনিত কারণে");
                        ans2.setText("ভাইরাস জনিত কারণে");
                        ans3.setText("অ্যাকুয়াস হিউমার চলাচলে বাধার সৃষ্টি হয়ে চোখের ভেতরের চাপ বেড়ে গেলে");
                        ans4.setText("চোখের পাওয়ারের পরিবর্তন হলে");

                        break;

                    case 2:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-২: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমা হলে …..?");

                        //PTquestionImage.setImageResource(R.drawable.pl_pt2);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("চোখে প্রচন্ড ব্যথা থাকবে");
                        ans2.setText("চোখে ঝাপসা দেখবে");
                        ans3.setText("চোখ খচখচ করবে");
                        ans4.setText("ঘন ঘন চোখের পাওয়ার পরিবর্তন হবে");

                        break;

                    case 3:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৩: সঠিক উত্তরটি চিহ্নিত করুন");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt3);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("গ্লোকুমা একটি ছোঁয়াচে রোগ");
                        ans2.setText("গ্লোকুমা হলে চোখের লেন্স ঘোলাটে হয়ে যায়");
                        ans3.setText("গ্লোকুমা একটি মেডিকেল ইমার্জেন্সী- জরুরী ভিত্তিতে এর চিকিৎসা হওয়া প্রয়োজন");
                        ans4.setText("বিনা অপারেশনেই এই রোগটির চিকিৎসা করা হয়");

                        break;

                    case 4:

//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৪: ভুল উত্তরটি চিহ্নিত করুন: গ্লোকুমার ঝুঁকি যুক্ত কারণ");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt4);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("নিজ আত্মীয়ের সংগে বিয়ে হলে");
                        ans2.setText("গ্লোকুমার পারিবারিক ইতিহাস থাকলে");
                        ans3.setText("ডায়াবেটিস আক্রান্ত হলে");
                        ans4.setText("দীর্ঘদিন যাবত ষ্টেরয়েড জাতীয় ওষুধ গ্রহন করলে");

                        break;

                    case 5:
//                PT_introText.setText("চোখের প্রাথমিক ধারণা সম্পর্কিত বিষয়বস্তু জানার আগে নিম্নের প্রশ্নগুলোর উত্তর দিন");
                        PT_introText.setVisibility(View.GONE);
                        PTquestion.setText("প্র-৫: সঠিক উত্তরটি চিহ্নিত করুন: গ্লোকুমা রোগ যে ভাবে ছড়ায়:");

//                        PTquestionImage.setImageResource(R.drawable.pl_pt5);
                        PTquestionImage.setVisibility(View.GONE);

                        ans1.setText("আক্রান্ত রোগীর ব্যবহৃত তোয়ালে বা রুমাল ব্যবহার করলে");
                        ans2.setText("আক্রান্ত রোগীর সংগে মেলামিশা করলে");
                        ans3.setText("সময় মত চিকিৎসা না করলে");
                        ans4.setText("উপরের কোনটাই ঠিক নয়");

                        nextQuesButton_PT.setText("ফলাফল দেখুন");
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

    //shuffling function

    //shuffle methods
    public void shuffle1(){

        int childcount = ans_RadioGroup.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = ans_RadioGroup.getChildAt(i);
        }

        //now remove all children
        ans_RadioGroup.removeAllViews();

        //first position
        ans_RadioGroup.addView(children[2]);
        //second position
        ans_RadioGroup.addView(children[0]);
        //third position
        ans_RadioGroup.addView(children[1]);
        ans_RadioGroup.addView(children[3]);
    }

    public void shuffle2(){

        int childcount = ans_RadioGroup.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = ans_RadioGroup.getChildAt(i);
        }

        //now remove all children
        ans_RadioGroup.removeAllViews();

        //first position
        ans_RadioGroup.addView(children[1]);
        //second position
        ans_RadioGroup.addView(children[2]);
        //third position
        ans_RadioGroup.addView(children[3]);
        ans_RadioGroup.addView(children[0]);

    }
    public void shuffle3(){

        int childcount = ans_RadioGroup.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = ans_RadioGroup.getChildAt(i);
        }

        //now remove all children
        ans_RadioGroup.removeAllViews();


        ans_RadioGroup.addView(children[0]);
        //first position
        ans_RadioGroup.addView(children[1]);
        //second position
        ans_RadioGroup.addView(children[2]);
        //third position
        ans_RadioGroup.addView(children[3]);


    }

    public void shuffle4(){

        int childcount = ans_RadioGroup.getChildCount();

        // create array
        View[] children = new View[childcount];

        // get children of linearlayout
        for (int i=0; i < childcount; i++){
            children[i] = ans_RadioGroup.getChildAt(i);
        }

        //now remove all children
        ans_RadioGroup.removeAllViews();


        ans_RadioGroup.addView(children[3]);

        ans_RadioGroup.addView(children[1]);
        //first position
        ans_RadioGroup.addView(children[0]);
        //second position
        ans_RadioGroup.addView(children[2]);
        //third position


    }

    //shuffling function



    //button activities
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

//            if(!StaticLogics.isPreTestCompleted)
//                Toast.makeText(this, "your PreTest score is : " + StaticLogics.PrimaryLearn1_PT_score + " & " + StaticLogics.PrimaryLearn1_PostT_score,
//                        Toast.LENGTH_SHORT).show();
//            else
//                Toast.makeText(this, "your PostTest score is : " + StaticLogics.PrimaryLearn1_PostT_score + " & " + StaticLogics.PrimaryLearn1_PT_score  ,
//                        Toast.LENGTH_SHORT).show();

        }
        else Toast.makeText(this, "please select an answer",
                Toast.LENGTH_SHORT).show();
    }
}
