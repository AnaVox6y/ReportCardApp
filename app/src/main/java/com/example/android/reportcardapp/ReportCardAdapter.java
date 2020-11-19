/**
 *  Created by Anastasia Annin on 10/21/2016.
 *  A Udacity Basics Nanodegree Project
 *   Copyright 2020 Anastasia Annin
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

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportCardAdapter extends ArrayAdapter<ReportCard>
{
    public ReportCardAdapter(Activity context, ArrayList<ReportCard> marks)
    {
        super(context, 0, marks);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //first get the list item view you can use
        View listItemView = convertView;
        if (listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ReportCard reportCard = getItem(position);

        TextView mathTextView = (TextView) listItemView.findViewById(R.id.math_text_view);
        String stringValueMath = String.valueOf(reportCard.getMathMark());
        mathTextView.setText(stringValueMath);

        TextView scienceTextView = (TextView) listItemView.findViewById(R.id.science_text_view);
        String stringValueScience = String.valueOf(reportCard.getScienceMark());
        scienceTextView.setText(stringValueScience);

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        String stringValueEnglish = String.valueOf(reportCard.getEnglishMark());
        englishTextView.setText(stringValueEnglish);

        TextView historyTextView = (TextView) listItemView.findViewById(R.id.history_text_view);
        String stringValueHistory = String.valueOf(reportCard.getHistoryMark());
        historyTextView.setText(stringValueHistory);

        TextView physedTextView = (TextView) listItemView.findViewById(R.id.physed_text_view);
        String stringValuePhysEd = String.valueOf(reportCard.getPhysEdMark());
        physedTextView.setText(stringValuePhysEd);

        return listItemView;
    }
}



