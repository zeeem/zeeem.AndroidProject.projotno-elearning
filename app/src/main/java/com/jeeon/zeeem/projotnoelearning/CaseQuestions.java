package com.jeeon.zeeem.projotnoelearning;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CaseQuestions extends AppCompatActivity {

    ImageView imageCaseQuestion;
    TextView textCaseQuestion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case_questions);

        imageCaseQuestion = (ImageView) findViewById(R.id.imageCaseQuestion);
        textCaseQuestion = (TextView) findViewById(R.id.textCaseQuestion);




        //populating questions
        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1) {
            switch (StaticLogics.PTquestionNum) {
                case 1:
                    textCaseQuestion.setText("চোখ দিয়ে পানি ঝরছে কিনা এটি জিজ্ঞেস করবেন  কি  ? ");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q1);

                    break;

                case 2:
                    textCaseQuestion.setText("চোখের দৃষ্টি শক্তি হঠাৎ করে কমে গেছে এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q2);

                    break;

                case 3:
                    textCaseQuestion.setText("চোখের ভেতরে কি খচ খচ করছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q3);

                    break;

                case 4:
                    textCaseQuestion.setText("সকালে পিচুটি জমে চোখের পাতা আটকে থাকে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q4);

                    break;

                case 5:
                    textCaseQuestion.setText("চোখে হঠাৎ করে প্রচন্ড ব্যথা শুরু হয়েছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q5);

                    break;

                case 6:

                    textCaseQuestion.setText("সম্প্রতি চোখ উঠেছে এ রকম কারো সংগে ছেলেটি মেলামেশা করেছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case1_q6);


                    break;

                case 7:
                    StaticLogics.PTquestionNum = 1;
                    //StaticLogics.isPreTestCompleted = true;
                    Intent i = new Intent(this, SelectDisease.class);
                    startActivity(i);
                    finish();

                    break;

                default:

                    StaticLogics.PTquestionNum = 1;
                    Intent intent = new Intent(this, PrimaryLevelCsaeSolve.class);
                    startActivity(intent);
                    finish();

                    break;
            }


        }
        else if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            switch (StaticLogics.PTquestionNum) {
                case 1:
                    textCaseQuestion.setText("১। চোখ দিয়ে পূঁজের মত পিচুটি বের হচ্ছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q1);

                    break;

                case 2:
                    textCaseQuestion.setText("২। দৃষ্টি শক্তি দ্রত কমে আসছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q2);

                    break;

                case 3:
                    textCaseQuestion.setText("৩। চোখে এবং মাথায় প্রচন্ড ব্যাথা আছে কিনা এটি জিজ্ঞেস করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q3);

                    break;

                case 4:
                    textCaseQuestion.setText("৪। চোখের ভেতরে খচ খচ করে কিনা এটি জিজ্ঞে করবেন কি?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q4);

                    break;

                case 5:
                    textCaseQuestion.setText("৫। চোখে ঝাপসা দেখে কিনা এটি জিজ্ঞেস করবেন কি ?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q5);

                    break;

                case 6:

                    textCaseQuestion.setText("৬। বমি বমি ভাব হয় কিনা ?");
                    imageCaseQuestion.setImageResource(R.drawable.p_case2_q6);


                    break;

                case 7:
                    StaticLogics.PTquestionNum = 1;
                    //StaticLogics.isPreTestCompleted = true;
                    Intent i = new Intent(this, SelectDisease.class);
                    startActivity(i);
                    finish();

                    break;

                default:

                    StaticLogics.PTquestionNum = 1;
                    Intent intent = new Intent(this, PrimaryLevelCsaeSolve.class);
                    startActivity(intent);
                    finish();

                    break;
            }



        }
    }


    //Button activities
    public void ansYes(View view){

        AlertDialog.Builder mBuilder = new AlertDialog.Builder(CaseQuestions.this);
        View mView = getLayoutInflater().inflate(R.layout.case_question_dialog, null);
        final TextView case_dialog_test = (TextView) mView.findViewById(R.id.case_dialog_test);
        Button nextCaseQuestion = (Button) mView.findViewById(R.id.nextCaseQuestion);

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1 ){
            switch (StaticLogics.PTquestionNum) {
                case 1:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর চোখ দিয়ে পানি ঝরতে পারে এবং আসলেই রোগীর চোখ দিয়ে পানি ঝরছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 2:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত হয় নি। কারন এ ধরনের রোগীর ক্ষেত্রে চোখের দৃষ্টি শক্তি হঠাৎ কমে যায় না।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;

                    break;
                case 3:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর চোখের ভেতরে খচ খচ করে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 4:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর সকালে পিচুটি জমে চোখের পাতা আটকে থাকতে পারে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 5:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত হয় নি। কারন এ ধরনের রোগীর ক্ষেত্রে চোখে হঠাৎ করে প্রচন্ড ব্যথা শুরু হয় না।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 6:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে সম্প্রতি চোখ উঠেছে এ রকম কারো সংগে মেলামেশা করলে এ রোগটি হতে পারে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
            }

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();



          //  Toast.makeText(this, "Case Solve score of level-" + StaticLogics.current_PrimaryCaseSolve_LevelRunning + " is : " + StaticLogics.PrimaryCaseSolveScore, Toast.LENGTH_SHORT).show();

            nextCaseQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StaticLogics.PTquestionNum++;
                    Intent intent = new Intent(CaseQuestions.this, CaseQuestions.class);
                    startActivity(intent);
                    finish();

                }
            });

        }

        else if (StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            switch (StaticLogics.PTquestionNum) {
                case 1:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত হয় নি। কারন এ ধরনের রোগীর ক্ষেত্রে চোখ দিয়ে পূঁজের মত পিচুটি বের হয় না।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 2:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে দৃষ্টি শক্তি দ্রত কমে আসতে পারে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;

                    break;
                case 3:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে চোখে এবং মাথায় প্রচন্ড ব্যাথা থাকে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 4:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত হয় নি। কারন এ ধরনের রোগীর ক্ষেত্রে চোখের ভেতরে খচ খচ করে না।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 5:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে চোখে ঝাপসা দেখে এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 6:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে বমি বমি ভাব হয় এবং আসলেই রোগীর এ সমস্যাটি আছে।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
            }

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();



          //  Toast.makeText(this, "Case Solve score of level-" + StaticLogics.current_PrimaryCaseSolve_LevelRunning + " is : " + StaticLogics.PrimaryCaseSolveScore, Toast.LENGTH_SHORT).show();

            nextCaseQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StaticLogics.PTquestionNum++;
                    Intent intent = new Intent(CaseQuestions.this, CaseQuestions.class);
                    startActivity(intent);
                    finish();

                }
            });



        }

    }

    public void ansNo(View view){
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(CaseQuestions.this);
        View mView = getLayoutInflater().inflate(R.layout.case_question_dialog, null);
        final TextView case_dialog_test = (TextView) mView.findViewById(R.id.case_dialog_test);
        Button nextCaseQuestion = (Button) mView.findViewById(R.id.nextCaseQuestion);

        if(StaticLogics.current_PrimaryCaseSolve_LevelRunning==1 ) {

            switch (StaticLogics.PTquestionNum) {
                case 1:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর চোখ দিয়ে পানি ঝরতে পারে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 2:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি না করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে চোখের দৃষ্টি শক্তি হঠাৎ কমে যায় না।");
                    StaticLogics.PrimaryCaseSolveScore += 5;

                    break;
                case 3:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর চোখের ভেতরে খচ খচ করতে পারে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 4:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর সকালে পিচুটি জমে চোখের পাতা আটকে থাকতে পারে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 5:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি না করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে চোখে হঠাৎ করে প্রচন্ড ব্যথা শুরু হয় না।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 6:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর ক্ষেত্রে সম্প্রতি চোখ উঠেছে এ রকম কারো সংগে মেলামেশা করলে এ রোগটি হতে পারে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
            }

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();


          //  Toast.makeText(this, "Case Solve score of level-" + StaticLogics.current_PrimaryCaseSolve_LevelRunning + " is : " + StaticLogics.PrimaryCaseSolveScore, Toast.LENGTH_SHORT).show();

            nextCaseQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StaticLogics.PTquestionNum++;
                    Intent intent = new Intent(CaseQuestions.this, CaseQuestions.class);
                    startActivity(intent);
                    finish();

                }
            });
        }

        else if (StaticLogics.current_PrimaryCaseSolve_LevelRunning==2){

            switch (StaticLogics.PTquestionNum) {
                case 1:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি না করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে চোখ দিয়ে পূঁজের মত পিচুটি বের হয় না।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 2:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর ক্ষেত্রে দৃষ্টি শক্তি দ্রত কমে আসতে পারে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;

                    break;
                case 3:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন রোগীর ক্ষেত্রে চোখে এবং মাথায় প্রচন্ড ব্যাথা থাকে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 4:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি না করা ঠিক হয়েছে। কারন এ ধরনের রোগীর ক্ষেত্রে  চোখের ভেতরে খচ খচ করে না।");
                    StaticLogics.PrimaryCaseSolveScore += 5;
                    break;
                case 5:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর ক্ষেত্রে চোখে ঝাপসা দেখে।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
                case 6:
                    case_dialog_test.setText("এই ক্ষেত্রে এই প্রশ্নটি করা উচিত ছিল। কারন এ ধরনের রোগীর ক্ষেত্রে বমি বমি ভাব হয়।");
                    StaticLogics.PrimaryCaseSolveScore -= 2.5;
                    break;
            }

            mBuilder.setView(mView);
            AlertDialog dialog = mBuilder.create();
            dialog.show();


            //Toast.makeText(this, "Case Solve score of level-" + StaticLogics.current_PrimaryCaseSolve_LevelRunning + " is : " + StaticLogics.PrimaryCaseSolveScore, Toast.LENGTH_SHORT).show();

            nextCaseQuestion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StaticLogics.PTquestionNum++;
                    Intent intent = new Intent(CaseQuestions.this, CaseQuestions.class);
                    startActivity(intent);
                    finish();

                }
            });



        }

    }


}
