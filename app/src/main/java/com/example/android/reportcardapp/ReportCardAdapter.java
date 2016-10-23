package com.example.android.reportcardapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Maino96-10022 on 10/21/2016.
 */

public class ReportCardAdapter extends ArrayAdapter<ReportCard> {


    public ReportCardAdapter(Activity context, ArrayList<ReportCard> marks) {
        super(context, 0, marks);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //first get the list item view you can use
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ReportCard currentWord = getItem(position);

        TextView mathTextView = (TextView) listItemView.findViewById(R.id.math_text_view);
        mathTextView.setText(currentWord.getMathMark());

        TextView scienceTextView = (TextView) listItemView.findViewById(R.id.science_text_view);
        scienceTextView.setText(currentWord.getScienceMark());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getEnglishMark());

        TextView historyTextView = (TextView) listItemView.findViewById(R.id.history_text_view);
        historyTextView.setText(currentWord.getHistoryMark());

        TextView physedTextView = (TextView) listItemView.findViewById(R.id.physed_text_view);
        physedTextView.setText(currentWord.getPhysEdMark());


        return listItemView;
    }
}



