package com.example.android.reportcardapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<ReportCard> marks = new ArrayList<ReportCard>();
        marks.add(new ReportCard(85, 75, 15, 58, 68));
        marks.add(new ReportCard(86, 23, 15, 23, 45));
        marks.add(new ReportCard(83, 75, 56, 0,  68));
        marks.add(new ReportCard(80, 75, 34, 58, 78));
        marks.add(new ReportCard(88, 54, 76, 12, 68));
        marks.add(new ReportCard(89, 75, 15, 58, 90));

        ReportCardAdapter adapter = new ReportCardAdapter(this, marks);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
