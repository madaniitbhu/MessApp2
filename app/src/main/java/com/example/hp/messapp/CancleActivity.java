package com.example.hp.messapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CancleActivity extends AppCompatActivity {
TextView tv;
    private int mYear;
    private int mMonth;
    private int mDay;

    private TextView mDateDisplay;
    private Button mPickDate;
Calendar mcurrent;
    static final int DATE_DIALOG_ID = 0;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancle);


    }}