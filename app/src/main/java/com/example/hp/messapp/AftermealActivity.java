package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AftermealActivity extends AppCompatActivity {
    ArrayList<String> meal = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftermeal);
      meal.add("21/7/2017");
        meal.add("22/7/2017");
        meal.add("23/7/2017");
        meal.add("24/7/2017");
        meal.add("25/7/2017");
        meal.add("26/7/2017");
        meal.add("27/7/2017");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, meal);
        ListView listView = (ListView) findViewById(R.id.listday_meal);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(AftermealActivity.this, Aftermeal_dayActivity.class);
                startActivity(i);
            } });




    }}






