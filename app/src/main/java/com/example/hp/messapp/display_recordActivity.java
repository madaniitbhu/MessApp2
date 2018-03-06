package com.example.hp.messapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class display_recordActivity extends AppCompatActivity {
ArrayList<Record> rec=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_record);

        rec.add(new Record("01/7/2017","YES","YES","YES","15"));
        rec.add(new Record("02/7/2017","YES","YES","YES","15"));
        rec.add(new Record("03/7/2017","YES","YES","YES","15"));
        rec.add(new Record("04/7/2017","YES","YES","YES","15"));
        rec.add(new Record("05/7/2017","YES","YES","YES","15"));
        rec.add(new Record("06/7/2017","YES","YES","YES","15"));
        rec.add(new Record("07/7/2017","YES","YES","YES","15"));
        rec.add(new Record("08/7/2017","YES","YES","YES","15"));
        rec.add(new Record("09/7/2017","YES","YES","YES","15"));
        rec.add(new Record("10/7/2017","YES","YES","YES","15"));
        rec.add(new Record("11/7/2017","YES","YES","YES","15"));
        rec.add(new Record("12/7/2017","YES","YES","YES","15"));
        rec.add(new Record("13/7/2017","YES","YES","YES","15"));
        rec.add(new Record("14/7/2017","YES","YES","YES","15"));
        rec.add(new Record("15/7/2017","YES","YES","YES","15"));
        rec.add(new Record("16/7/2017","YES","YES","YES","15"));
        rec.add(new Record("17/7/2017","YES","YES","YES","15"));
        rec.add(new Record("18/7/2017","YES","YES","YES","15"));
        rec.add(new Record("19/7/2017","YES","YES","YES","15"));
        rec.add(new Record("20/7/2017","YES","YES","YES","15"));
        rec.add(new Record("21/7/2017","YES","YES","YES","15"));
        rec.add(new Record("22/7/2017","YES","YES","YES","15"));
        rec.add(new Record("23/7/2017","YES","YES","YES","15"));
        rec.add(new Record("24/7/2017","YES","YES","YES","15"));

        Record_adapter itemAdapter= new Record_adapter(this,rec);
        final ListView listview =(ListView)findViewById(R.id.list_record);
        listview.setAdapter(itemAdapter);




    }
}
