package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CaseInquiryQuestion extends AppCompatActivity {

    Button case_q1, case_q2, case_q3, case_q4, case_q5, case_q6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_inquiry_question);

        setTitle("কেস সমাধান");

        case_q1 = (Button) findViewById(R.id.case_q1);
        case_q2 = (Button) findViewById(R.id.case_q2);
        case_q3 = (Button) findViewById(R.id.case_q3);
        case_q4 = (Button) findViewById(R.id.case_q4);
        case_q5 = (Button) findViewById(R.id.case_q5);
        case_q6 = (Button) findViewById(R.id.case_q6);

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            case_q1.setText("১। চোখ দিয়ে কি পূঁজের মত পিচুটি বের হচ্ছে কিনা এটি জিজ্ঞেস করবেন কি?");
            case_q2.setText("২। দৃষ্টি শক্তি দ্রুত কমে আসছে কিনা এটি জিজ্ঞেস করবেন কি?");
            case_q3.setText("৩। চোখে এবং মাথায় প্রচন্ড ব্যাথা আছে কিনা এটি জিজ্ঞেস করবেন কি?");
            case_q4.setText("৪। চোখের ভেতরে খচ খচ করে কিনা এটি জিজ্ঞেস করবেন কি?");
            case_q5.setText("৫। চোখে ঝাপসা দেখে কিনা এটি জিজ্ঞেস করবেন কিনা?");
            case_q6.setText("৬। বমি বমি ভাব হয় কিনা এটি জিজ্ঞেস করবেন কি?");

        }

    }

    public void goToNextCaseStep(View view){

        StaticLogics.PTquestionNum=1;
        Intent intent = new Intent(this, CaseQuestions.class);
        startActivity(intent);
        finish();

    }

    public void lockedCaseLevels (View v){

        Toast.makeText(this, "Activity locked", Toast.LENGTH_SHORT).show();

    }


}
