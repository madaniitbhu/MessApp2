package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfterrecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterrecord);









    }

    public void show_record(View view){
        Intent i=new Intent(AfterrecordActivity.this,display_recordActivity.class);
        startActivity(i);
    }

}
