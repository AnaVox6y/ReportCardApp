/**
 *  Created by Anastasia Annin on 10/19/2016.
 *  A Udacity Basics Nanodegree Project
 *  Copyright 2020 Anastasia Annin
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 */

package com.example.android.reportcardapp;

public class ReportCard
{
    private static final int MAX_CLASS_SIZE = 30;
    private int mMathMark;
    private int mScienceMark;
    private int mEnglishMark;
    private int mHistoryMark;
    private int mPhysEdMark;

    public ReportCard(int MathMark, int ScienceMark, int EnglishMark,
                      int HistoryMark, int PhysEdMark)
    {
        mMathMark = MathMark;
        mScienceMark = ScienceMark;
        mEnglishMark = EnglishMark;
        mHistoryMark = HistoryMark;
        mPhysEdMark = PhysEdMark;
    }

    public void setMathMark(int MathMark)
    {
        mMathMark = MathMark;
    }

    public int getMathMark()
    {
        return mMathMark;
    }

    public void setScienceMark(int ScienceMark)
    {
        mScienceMark = ScienceMark;
    }

    public int getScienceMark() {
        return mScienceMark;
    }

    public void setEnglishMark(int EnglishMark)
    {
        mEnglishMark = EnglishMark;
    }

    public int getEnglishMark()
    {
        return mEnglishMark;
    }

    public void setHistoryMark(int HistoryMark)
    {
        mHistoryMark = HistoryMark;
    }

    public int getHistoryMark()
    {
        return mHistoryMark;
    }

    public void setPhysEdMark(int PhysEdMark)
    {
        mPhysEdMark = PhysEdMark;
    }

    public int getPhysEdMark()
    {
        return mPhysEdMark;
    }
}
