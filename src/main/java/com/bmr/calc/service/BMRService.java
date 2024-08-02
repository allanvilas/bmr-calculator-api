package com.bmr.calc.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bmr.calc.model.Person;
import com.bmr.calc.util.ActivityLevel;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BMRService {

    public String calculateBMRandTDEE(Person person){
        int add = person.isWoman() == true ? -161 : 5;
        double weight = person.getWeight();
        double height = person.getHeight();
        int age = person.getAge();
        ActivityLevel activityLevel = person.getActivityLevel();

        double BMR = (10 * weight) + (6.25 * height) - (5 * age) + add;
        double TDEE = calculateTDEE(BMR, activityLevel);
        
        // Calculate adjustments
        double caloricDeficit = TDEE - 500;  // For weight loss
        double caloricSurplus = TDEE + 500;  // For weight gain

        // Create JSON response
        Map<String, Object> response = new HashMap<>();
        response.put("BMR", BMR);
        response.put("TDEE", TDEE);
        response.put("caloricDeficit", caloricDeficit);
        response.put("caloricSurplus", caloricSurplus);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(response);
        } catch (Exception e) {
           e.printStackTrace();
           return "{}";
        }
    }

    private double calculateTDEE(double BMR, ActivityLevel activityLevel) {
        double multiplier;

        switch (activityLevel) {
            case SEDENTARY:
                multiplier = 1.2;
                break;
            case LIGHTLY_ACTIVE:
                multiplier = 1.375;
                break;
            case MODERATELY_ACTIVE:
                multiplier = 1.55;
                break;
            case VERY_ACTIVE:
                multiplier = 1.725;
                break;
            case SUPER_ACTIVE:
                multiplier = 1.9;
                break;
            default:
                multiplier = 1.2;
        }
        
        return BMR * multiplier;

    }
}
