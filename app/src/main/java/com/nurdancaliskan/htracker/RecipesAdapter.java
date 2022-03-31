package com.nurdancaliskan.htracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecipesAdapter extends RecyclerView.Adapter<RecipesAdapter.ViewHolder> {

    RecipesData[] recipesData;
    Context context;

    public RecipesAdapter(RecipesData[] recipesData, RecipesActivity activity) {
        this.recipesData = recipesData;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.food_recipes_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RecipesData recipesDataList = recipesData[position];
        holder.textViewFoodName.setText(recipesDataList.getFoodName());
        holder.foodImage.setImageResource(recipesDataList.getFoodImage());
        holder.textViewRecipe.setText(recipesDataList.getRecipe());
        
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, recipesDataList.getFoodName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return recipesData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView foodImage;
        TextView textViewRecipe;
        TextView textViewFoodName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.imageview_food_repices_list);
            textViewRecipe = itemView.findViewById(R.id.recipe_list_textview);
            textViewFoodName = itemView.findViewById(R.id.food_name);

        }
    }


}
