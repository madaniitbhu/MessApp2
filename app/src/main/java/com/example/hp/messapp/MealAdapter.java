package com.example.hp.messapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hp on 1/6/2018.
 */

public class MealAdapter extends ArrayAdapter<Meal>{

    public MealAdapter(Context context, ArrayList<Meal> meal_1) {
        super(context,0,meal_1);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listitemView=convertView;
        if(listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.meal,parent,false) ;
        }

        Meal currentWord=getItem(position);

        TextView name=(TextView )listitemView.findViewById(R.id. textView6);
        name.setText(currentWord.getmName());

        ImageView iconView = (ImageView) listitemView.findViewById(R.id.imageView2);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentWord.getmImage());
        return listitemView;

    }














}
