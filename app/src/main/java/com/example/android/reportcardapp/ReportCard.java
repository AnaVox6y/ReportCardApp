package com.example.android.reportcardapp;

/**
 * Created by Maino96-10022 on 10/19/2016.
 */

public class ReportCard {

    private static final int MAX_CLASS_SIZE = 30;
    private int mMathMark;
    private int mScienceMark;
    private int mEnglishMark;
    private int mHistoryMark;
    private int mPhysEdMark;


    public ReportCard(int MathMark, int ScienceMark, int EnglishMark,
                      int HistoryMark, int PhysEdMark) {

        mMathMark = MathMark;
        mScienceMark = ScienceMark;
        mEnglishMark = EnglishMark;
        mHistoryMark = HistoryMark;
        mPhysEdMark = PhysEdMark;


    }


    public void setMathMark(int MathMark) {
        mMathMark = MathMark;
    }

    public int getMathMark() {
        return mMathMark;
    }

    public void setScienceMark(int ScienceMark) {
        mScienceMark = ScienceMark;
    }

    public int getScienceMark() {
        return mScienceMark;

    }

    public void setEnglishMark(int EnglishMark) {
        mEnglishMark = EnglishMark;
    }

    public int getEnglishMark() {
        return mEnglishMark;

    }

    public void setHistoryMark(int HistoryMark) {
        mHistoryMark = HistoryMark;
    }

    public int getHistoryMark() {
        return mHistoryMark;

    }

    public void setPhysEdMark(int PhysEdMark) {
        mPhysEdMark = PhysEdMark;
    }

    public int getPhysEdMark() {
        return mPhysEdMark;

    }


}
