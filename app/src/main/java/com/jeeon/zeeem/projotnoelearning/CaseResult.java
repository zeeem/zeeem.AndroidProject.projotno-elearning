package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CaseResult extends AppCompatActivity {

    TextView result_caseSolving, scoreComment, caseCommentText, caseTotalNumberText;
    Button goToNext_FromCaseSolveResult;
    double FinalCaseResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_result);

        setTitle("কেস সমাধান");

        result_caseSolving = (TextView) findViewById(R.id.result_caseSolving);
        scoreComment = (TextView) findViewById(R.id.scoreComment);
        goToNext_FromCaseSolveResult = (Button) findViewById(R.id.goToNext_FromCaseSolveResult);
        caseCommentText = (TextView) findViewById(R.id.caseCommentText);
        caseTotalNumberText = (TextView) findViewById(R.id.caseTotalNumberText);

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1){
            FinalCaseResult = StaticLogics.PrimaryCaseSolveScore/45*100;
            caseTotalNumberText.setText("এই কেস-এ মোট নম্বর ৪৫");
        }
        else {
            FinalCaseResult = StaticLogics.PrimaryCaseSolveScore/40*100;
            caseTotalNumberText.setText("এই কেস-এ মোট নম্বর ৪০");
        }

        if(FinalCaseResult>100){
            FinalCaseResult=100;
        }

        Typeface tf = Typeface.createFromAsset(getAssets(),
                "fonts/kalpurush.ttf");

        //String temp_score = Double.toString(FinalCaseResult);
        result_caseSolving.setText(String.format( "%.1f", FinalCaseResult ));
//        result_caseSolving.setText(Double.toString(FinalCaseResult));
        result_caseSolving.setTypeface(tf);


        if(FinalCaseResult<80){

            scoreComment.setVisibility(View.VISIBLE);
            goToNext_FromCaseSolveResult.setText("আবার চেষ্টা করুন!");
            caseCommentText.setText("কেসটি সম্পন্ন করার জন্য আপনাকে ধন্যবাদ!");


        }
        else {
            scoreComment.setVisibility(View.GONE);
            goToNext_FromCaseSolveResult.setText("পরবর্তী কেস-এ যান");

            if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==StaticLogics.unlocked_case_solved_level){
                //new level unlocked
                StaticLogics.unlocked_case_solved_level++;

                //save the data in database
                MainActivity mainActivity = new MainActivity();
                mainActivity.saveData(getApplicationContext());

                Toast.makeText(this, "New case unlocked :" + StaticLogics.unlocked_case_solved_level , Toast.LENGTH_SHORT).show();
            }

        }

    }

    public void goToNext_CaseSolve(View view){

        if(FinalCaseResult<80){
            Intent intent = new Intent(this, PrimaryLevelCsaeSolve.class);
            startActivity(intent);
            finish();

        }
        else {

            if(StaticLogics.unlocked_case_solved_level>2){

                Intent intent = new Intent(this, LastScreen.class);
                startActivity(intent);
                finish();

            }
            else {

                Intent intent = new Intent(this, PrimaryLevelCsaeSolve.class);
                startActivity(intent);
                finish();
            }
        }


    }
}
