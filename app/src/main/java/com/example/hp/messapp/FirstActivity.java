package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }  public void login(View view){
        Intent i=new Intent(FirstActivity.this,DrawerActivity.class);
        startActivity(i);
    }
}
