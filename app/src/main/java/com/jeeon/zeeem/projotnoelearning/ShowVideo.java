package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class ShowVideo extends AppCompatActivity {

    TextView text_showVideo;
    VideoView videoFrame_showVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Watch Video");
        setContentView(R.layout.activity_show_video);
        MediaController mediaController;

        Uri uri=null;
        text_showVideo = (TextView) findViewById(R.id.text_showvideo);
        videoFrame_showVideo = (VideoView) findViewById(R.id.videoFrame_showVideo);

        //check whether the current level is Primary level 1's preTest 1
        if(StaticLogics.current_PrimaryLearning_LevelRunning==1){
            text_showVideo.setText("চোখের প্রাথমিক ধারনা সম্পকিত ভিডিওটি দেখুন");
           // videoFrame_showVideo.setBackgroundResource(R.drawable.pl_pt_video);
            uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_eye_anatomy);
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==2){
            text_showVideo.setText(" কনজান্কটিভাইটিস  সম্পকিত ভিডিওটি দেখুন");
            //videoFrame_showVideo.setBackgroundResource(R.drawable.pl2_pt_video);
            uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_conjunctivitis);
        }
        else if(StaticLogics.current_PrimaryLearning_LevelRunning==3){
             text_showVideo.setText("গ্লোকুমা সম্পকিত ভিডিওটি দেখুন");
            // videoFrame_showVideo.setBackgroundResource(R.drawable.pl3_pt_video);
            uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video_glaucoma);
        }

        if(uri!=null){
            videoFrame_showVideo.setVideoURI(uri);
            videoFrame_showVideo.start();

            mediaController= new MediaController(this);
            mediaController.setAnchorView(videoFrame_showVideo);
            videoFrame_showVideo.setMediaController(mediaController);
        }


    }

    public void playVideoButton(View view){
        videoFrame_showVideo.start();
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