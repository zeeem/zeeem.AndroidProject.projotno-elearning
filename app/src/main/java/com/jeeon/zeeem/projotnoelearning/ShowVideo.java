package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowVideo extends AppCompatActivity {

    TextView text_showVideo;
    ImageView videoFrame_showVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Watch Video");
        setContentView(R.layout.activity_show_video);

        text_showVideo = (TextView) findViewById(R.id.text_showvideo);
        videoFrame_showVideo = (ImageView) findViewById(R.id.videoFrame_showVideo);

        //check whether the current level is Primary level 1's preTest 1
        if(StaticLogics.current_PrimaryLearning_LevelRunning==1){
            text_showVideo.setText("চোখের প্রাথমিক ধারনা সম্পকিত ভিডিওটি দেখুন");
            videoFrame_showVideo.setBackgroundResource(R.drawable.pl_pt_video);
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==2){
            text_showVideo.setText(" কনজান্কটিভাইটিস  সম্পকিত ভিডিওটি দেখুন");
            videoFrame_showVideo.setBackgroundResource(R.drawable.pl2_pt_video);
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==3){
             text_showVideo.setText("গ্লোকুমা সম্পকিত ভিডিওটি দেখুন");
             videoFrame_showVideo.setBackgroundResource(R.drawable.pl3_pt_video);
        }


    }

    //goto POST TEST
    public void goToPostTest(View view){

        StaticLogics.PTquestionNum =1;
        StaticLogics.isPostTestCompleted=false;
        StaticLogics.isPreTestCompleted = true;

        Intent intent = new Intent(this, Primary1_PreTest.class);
        startActivity(intent);
        finish();


    }
}