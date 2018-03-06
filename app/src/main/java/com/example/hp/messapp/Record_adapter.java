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
 * Created by hp on 1/5/2018.
 */

public class Record_adapter extends ArrayAdapter<Record> {



    public Record_adapter(Context context, ArrayList<Record> record) {
        super(context,0,record);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listitemView=convertView;
        if(listitemView==null){
            listitemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.record,parent,false) ;
        }

        Record currentWord=getItem(position);

        TextView serial=(TextView )listitemView.findViewById(R.id. textView1);
        serial.setText(currentWord.getMserial());

        TextView breakfast=(TextView )listitemView.findViewById(R.id.textView2);
        breakfast.setText(currentWord.getMbreakfast());

        TextView lunch=(TextView ) listitemView.findViewById(R.id.textView3);
        lunch.setText(currentWord.getMlunch());

        TextView dinner=(TextView )listitemView.findViewById(R.id.textView4);
        dinner.setText(currentWord.getMdinner());

        TextView extra=(TextView )listitemView.findViewById(R.id.textView5);
        extra.setText(currentWord.getmExtra());
         return listitemView;

    }






}
