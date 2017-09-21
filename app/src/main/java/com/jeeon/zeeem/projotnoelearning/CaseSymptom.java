package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CaseSymptom extends AppCompatActivity {

    TextView textCaseSymptom;
    ImageView imageCaseSymptom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_symptom);

        textCaseSymptom = (TextView) findViewById(R.id.textCaseSynptom);
        imageCaseSymptom = (ImageView) findViewById(R.id.imageCaseSymptom);

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){
            textCaseSymptom.setText("১০ বছরের একটি ছেলে তার মায়ের সাথে আপনার চেম্বারে এলো। মায়ের কথা মোতাবেক গত ২ দিন হলো ছেলেটির চোখ লাল হয়েছে ও পিচুটি ঝরছে।");
            imageCaseSymptom.setImageResource(R.drawable.case_symptom_1);

        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){
            textCaseSymptom.setText("৩০ বছরের এক যুবক আপনার কাছে এসে বললো বেশ কিছুদিন হলো তার চোখ দুটোতে প্রচন্ড ব্যথা হচ্ছে ও  লাল হয়ে আছে।");
            imageCaseSymptom.setImageResource(R.drawable.case_symptom_2);
        }

    }

    //button activity
    public void gotoNextCaseStep(View view){
        Intent intent = new Intent(this, CaseInquiryQuestion.class);
        startActivity(intent);
        finish();
    }
}
