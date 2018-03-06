package com.example.hp.messapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Show_adapter extends RecyclerView.Adapter<Show_adapter.ViewHolder> {

    ArrayList<String> alName;
    ArrayList<Integer> alImage;
    Context context;

    public Show_adapter(Context context,ArrayList<Integer> alImage) {
        super();
        this.context = context;

        this.alImage = alImage;
    }

    @Override

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {View v = LayoutInflater.from(viewGroup.getContext())
            .inflate(R.layout.horizontal, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;}




    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        viewHolder.imgThumbnail.setImageResource(alImage.get(i));

        viewHolder.setClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                if (isLongClick) {
                    Toast.makeText(context, "#" + position + " - " + alImage.get(position) + " (Long click)", Toast.LENGTH_SHORT).show();
                    context.startActivity(new Intent(context, MainActivity.class));
                } else {
                    Toast.makeText(context, "#" + position + " - " + alImage.get(position), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return alImage.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

        public ImageView imgThumbnail;

        private ItemClickListener clickListener;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);

            itemView.setOnClickListener(this);
            itemView.setOnLongClickListener(this);
        }

        public void setClickListener(ItemClickListener itemClickListener) {
            this.clickListener = itemClickListener;
        }

        @Override
        public void onClick(View view) {
            clickListener.onClick(view, getPosition(), false);
        }

        @Override
        public boolean onLongClick(View view) {
            clickListener.onClick(view, getPosition(), true);
            return true;
        }
    }

}

