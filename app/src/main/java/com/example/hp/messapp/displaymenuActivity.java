package com.example.hp.messapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class displaymenuActivity extends AppCompatActivity {
ArrayList<Meal> meal=new ArrayList<>();
    RecyclerView mRecyclerView;
    RecyclerView mRecyclerView2;
    RecyclerView mRecyclerView3;

    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.LayoutManager mLayoutManager2;
    RecyclerView.LayoutManager mLayoutManager3;


    RecyclerView.Adapter mAdapter;
    RecyclerView.Adapter mAdapter2;
    RecyclerView.Adapter mAdapter3;
    ArrayList<Integer> alImage1;
    ArrayList<Integer> alImage2;
    ArrayList<Integer> alImage3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymenu);
        alImage1 = new ArrayList<>(Arrays.asList(R.drawable.aloparatha,R.drawable.poha, R.drawable.puri,R.drawable.pic2));
        alImage2 = new ArrayList<>(Arrays.asList(R.drawable.lunch1,R.drawable.lunch2, R.drawable.lunch3,R.drawable.lunch4));
        alImage3 = new ArrayList<>(Arrays.asList(R.drawable.dinner1,R.drawable.dinner2, R.drawable.dinner3,R.drawable.dinner4,R.drawable.dinner5));


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView2 = (RecyclerView) findViewById(R.id.recycler_view2);
        mRecyclerView3 = (RecyclerView) findViewById(R.id.recycler_view3);


        mRecyclerView.setHasFixedSize(true);
        mRecyclerView2.setHasFixedSize(true);
        mRecyclerView3.setHasFixedSize(true);


        // The number of Columns
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new Show_adapter(displaymenuActivity.this ,alImage1);
        mRecyclerView.setAdapter(mAdapter);

      mLayoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView2.setLayoutManager(mLayoutManager2);
        mAdapter2 = new Show_adapter(displaymenuActivity.this ,alImage2);
        mRecyclerView2.setAdapter(mAdapter2);

        mLayoutManager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView3.setLayoutManager(mLayoutManager3);
        mAdapter3 = new Show_adapter(displaymenuActivity.this ,alImage3);
        mRecyclerView3.setAdapter(mAdapter3);









    }



}
