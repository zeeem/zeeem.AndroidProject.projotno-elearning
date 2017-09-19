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
        setContentView(R.layout.activity_primary1__pre_test);

        PT_introText = (TextView) findViewById(R.id.preTest_introText);
        PTquestion = (TextView) findViewById(R.id.questionPT);

        PTquestionImage = (ImageView) findViewById(R.id.imagePT);

        ans1 = (RadioButton) findViewById(R.id.ans1_PT);
        ans2 = (RadioButton) findViewById(R.id.ans2_PT);
        ans3 = (RadioButton) findViewById(R.id.ans3_PT);
        ans4 = (RadioButton) findViewById(R.id.ans4_PT);


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
//            case 3:
//
//
//                break;
//            case 4:
//
//
//                break;
//            case 5:
//
//
//                break;
//            case 6:
//
//
//                break;
//            case 7:
//
//
//                break;
//            case 8:
//
//
//                break;
//            case 9:
//
//
//                break;
//            case 10:
//
//
//                break;
//            case 11:
//
//
//                break;
//            case 12:
//
//
//                break;
            default:

                StaticLogics.PTquestionNum=1;
                Intent intent = new Intent(this, LearningLevels.class);
                startActivity(intent);
                finish();

                break;
        }





    }

    public void goToNextQuestion_PT(View v){
        if(ans1.isChecked()){
            if(StaticLogics.PTquestionNum==2)
                StaticLogics.PrimaryLearn1_PT_score+=5;

        }
        else if(ans2.isChecked()){


        }else if(ans3.isChecked()){


        }else if(ans4.isChecked()){
            if(StaticLogics.PTquestionNum==1)
                StaticLogics.PrimaryLearn1_PT_score+=5;

        }

        if(ans1.isChecked() | ans2.isChecked() | ans3.isChecked() | ans4.isChecked()) {
            StaticLogics.PTquestionNum++;
            Intent intent = new Intent(this, Primary1_PreTest.class);
            startActivity(intent);
            finish();

            Toast.makeText(this, "your score is : " + StaticLogics.PrimaryLearn1_PT_score,
                    Toast.LENGTH_SHORT).show();
        }
        else Toast.makeText(this, "please select an answer",
                Toast.LENGTH_SHORT).show();
    }
}
