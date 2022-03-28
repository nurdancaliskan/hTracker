package com.nurdancaliskan.htracker;

import android.content.Intent;

public class RecipesData {

    private String foodName;
    private String recipe;
    private Integer foodImage;

    public RecipesData(String foodName, String recipe, Integer foodImage) {
        this.foodName = foodName;
        this.recipe = recipe;
        this.foodImage = foodImage;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public Integer getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(Integer foodImage) {
        this.foodImage = foodImage;
    }
}
