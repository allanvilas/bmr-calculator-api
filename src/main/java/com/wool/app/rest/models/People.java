package com.wool.app.rest.models;

import com.wool.app.rest.util.ActivityLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private double height;
    
    @Column
    private double weight;
    
    @Column
    private int age;

    @Column
    private boolean isWoman;

    @Column
    private ActivityLevel activityLevel;

    public boolean isWoman() {
        return isWoman;
    }

    public void setWoman(boolean isWoman) {
        this.isWoman = isWoman;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
