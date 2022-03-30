package com.nurdancaliskan.htracker;

import android.widget.TextView;

import androidx.annotation.Nullable;

public class DietData {
    @Nullable
    private String dayText;
    @Nullable
    private String breakfastTime;
    @Nullable
    private String lunchTime;
    @Nullable
    private String dinnerTime;
    @Nullable
    private String breakfast;
    @Nullable
    private String launch;
    @Nullable
    private String dinner;

    public DietData(@Nullable String dayText, @Nullable String breakfastTime, @Nullable String lunchTime, @Nullable String dinnerTime, @Nullable String breakfast, @Nullable String launch, @Nullable String dinner) {
        this.dayText = dayText;
        this.breakfastTime = breakfastTime;
        this.lunchTime = lunchTime;
        this.dinnerTime = dinnerTime;
        this.breakfast = breakfast;
        this.launch = launch;
        this.dinner = dinner;
    }

    @Nullable
    public String getDayText() {
        return dayText;
    }

    public void setDayText(@Nullable String dayText) {
        this.dayText = dayText;
    }

    @Nullable
    public String getBreakfastTime() {
        return breakfastTime;
    }

    public void setBreakfastTime(@Nullable String breakfastTime) {
        this.breakfastTime = breakfastTime;
    }

    @Nullable
    public String getLunchTime() {
        return lunchTime;
    }

    public void setLunchTime(@Nullable String lunchTime) {
        this.lunchTime = lunchTime;
    }

    @Nullable
    public String getDinnerTime() {
        return dinnerTime;
    }

    public void setDinnerTime(@Nullable String dinnerTime) {
        this.dinnerTime = dinnerTime;
    }

    @Nullable
    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(@Nullable String breakfast) {
        this.breakfast = breakfast;
    }

    @Nullable
    public String getLaunch() {
        return launch;
    }

    public void setLaunch(@Nullable String launch) {
        this.launch = launch;
    }

    @Nullable
    public String getDinner() {
        return dinner;
    }

    public void setDinner(@Nullable String dinner) {
        this.dinner = dinner;
    }
}
