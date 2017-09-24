package com.jeeon.zeeem.projotnoelearning;

import android.content.Context;

/**
 * Created by zeeem on 9/20/2017.
 */

public class StaticLogics {

    public static boolean isCaseSolvingUnlocked = false;
    //this should be false as defauult

    public static boolean isPrimaryLearn2Unlocked = false;
    public static boolean isPrimaryLearn3Unlocked = false;

    public static boolean isPrimaryCaseSolve1Unlocked = false; //no need
    public static int current_PrimaryCaseSolve_LevelRunning = 0;

    public static int unlocked_case_solved_level = 0;
    public static int unlocked_primary_Learn_level = 0;



    //to count question number of primary learn 1 - PRE TEST
    public static int PTquestionNum = 1;
    public static boolean isPreTestCompleted = false; //to determine the test title (pre-test or post-test)
    public static int PrimaryLearn1_PT_score = 0;

    public static int current_PrimaryLearning_LevelRunning = 0;
    //to count question number of primary learn 1 - POST TEST
    //public static int PostTquestionNum = 1; //its the same as the pretest numbers
    public static boolean isPostTestCompleted = false;
    public static int PrimaryLearn1_PostT_score = 0;

    public static double PrimaryCaseSolveScore = 0;

    //checking multiple ans in treatment selection
    public static boolean mul_treatment_Ans_count_1 = false;
    public static boolean mul_treatment_Ans_count_2 = false;


    //for case inquery quesiton selection (random) by user
    public static int tempQues_1=0;
    public static int tempQues_2=0;
}
