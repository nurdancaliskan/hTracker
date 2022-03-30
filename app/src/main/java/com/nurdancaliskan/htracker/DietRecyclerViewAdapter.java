package com.nurdancaliskan.htracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DietRecyclerViewAdapter extends RecyclerView.Adapter<com.nurdancaliskan.htracker.DietRecyclerViewAdapter.ViewHolder> {


        ArrayList<DietData> dietData;
        Context context;

        public DietRecyclerViewAdapter(ArrayList<DietData> dietData, DietActivity activity) {
            this.dietData = dietData;
            this.context = activity;

        }

        @NonNull
        @Override
        public DietRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.layout_diet_list_item,parent,false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull com.nurdancaliskan.htracker.DietRecyclerViewAdapter.ViewHolder holder, int position) {
            DietData dietItem = dietData.get(position);
            holder.bind(dietItem);
        }

        @Override
        public int getItemCount() {
            return dietData.size();
        }

        public static class ViewHolder extends RecyclerView.ViewHolder{
            CardView parentItemCard;
            TextView dayText;
            TextView breakfastTime;
            TextView launchTime;
            TextView dinnerTime;
            TextView breakfastText;
            TextView launchText;
            TextView dinnerText;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                parentItemCard = itemView.findViewById(R.id.parentItemCard);
                dayText = itemView.findViewById(R.id.dayText);
                breakfastTime = itemView.findViewById(R.id.breakfastTime);
                launchTime = itemView.findViewById(R.id.launchTime);
                dinnerTime = itemView.findViewById(R.id.dinnerTime);
                breakfastText = itemView.findViewById(R.id.breakfastText);
                launchText = itemView.findViewById(R.id.launchText);
                dinnerText = itemView.findViewById(R.id.dinnerText);
            }
            public void bind(DietData data){
                dayText.setText(data.getDayText());
                breakfastText.setText(data.getBreakfast());
                launchText.setText(data.getLaunch());
                dinnerText.setText(data.getDinner());
                breakfastTime.setText(data.getBreakfastTime());
                launchTime.setText(data.getLunchTime());
                dinnerTime.setText(data.getDinnerTime());
            }


        }
    }
