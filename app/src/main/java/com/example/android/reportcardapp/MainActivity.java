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

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
