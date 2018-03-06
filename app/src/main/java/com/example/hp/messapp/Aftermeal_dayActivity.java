package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Aftermeal_dayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aftermeal_day);










    }
    public void breakfast(View view){
        Intent i=new Intent(Aftermeal_dayActivity.this,displaymenuActivity.class);
        startActivity(i);}
    public void lunch(View view){
        Intent i=new Intent(Aftermeal_dayActivity.this,displaymenuActivity.class);
        startActivity(i);}


    public void dinner(View view){
        Intent i=new Intent(Aftermeal_dayActivity.this,displaymenuActivity.class);
        startActivity(i);}


}
