package com.example.hp.messapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class DrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.profile_id) {
            Intent i=new Intent(DrawerActivity.this,ProfileActivity.class);
            startActivity(i);
        } else if (id == R.id.menu_id) {
            Intent i=new Intent(DrawerActivity.this,displaymenuActivity.class);
            startActivity(i);
        } else if (id == R.id.record_id) {
            Intent i=new Intent(DrawerActivity.this,Aftertotal_moneyActivity.class);
            startActivity(i);
        } else if (id == R.id.payment_id) {
            Intent i=new Intent(DrawerActivity.this,ProfileActivity.class);
            startActivity(i);
        } else if (id == R.id.log_id) {
            Intent i=new Intent(DrawerActivity.this,FirstActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_share) {
            Intent i=new Intent(DrawerActivity.this,FirstActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_share){
            Intent i=new Intent(DrawerActivity.this,FirstActivity.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    public void today_meal(View view){
        Intent i=new Intent(DrawerActivity.this,displaymenuActivity.class);
        startActivity(i);
    }

    public void my_record(View view){
        Intent i=new Intent(DrawerActivity.this,AfterrecordActivity.class);
        startActivity(i);
    }
    public void total_money(View view){
        Intent i=new Intent(DrawerActivity.this,Aftertotal_moneyActivity.class);
        startActivity(i);
    }
    public void cancle(View view){
        Intent i=new Intent(DrawerActivity.this,CancleActivity.class);
        startActivity(i);
    }
    public void feedback(View view){
        Intent i=new Intent(DrawerActivity.this,After_suggActivity.class);
        startActivity(i);
    }
    public void profile(View view){
        Intent i=new Intent(DrawerActivity.this,ProfileActivity.class);
        startActivity(i);
    }


}
