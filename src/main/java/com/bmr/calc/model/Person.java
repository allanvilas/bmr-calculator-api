package com.bmr.calc.model;

import com.bmr.calc.util.ActivityLevel;

public class Person {

    private double weight;
    private double height;
    private int age;
    private boolean isWoman;
    private ActivityLevel activityLevel;
    
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isWoman() {
        return isWoman;
    }
    public void setWoman(boolean isWoman) {
        this.isWoman = isWoman;
    }
    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }
    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }
}
