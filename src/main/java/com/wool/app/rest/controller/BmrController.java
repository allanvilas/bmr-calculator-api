package com.wool.app.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.wool.app.rest.models.People;
import com.wool.app.rest.repo.PeopleRepo;

@RestController
public class BmrController {
    @Autowired
    private PeopleRepo peopleRepo;

    @PostMapping(value = "/calculate")
    public String CalculateBmr(@RequestBody People people) {
        int add;
        double height = people.getHeight() ;
        double weight = people.getWeight();
        double age = people.getAge();
        
        if(people.isWoman()) {
            add = -161;
        }
        else {
            add = 5;
        }

        double BMR = (10 * weight) + (6.25 * height) - (5 * age) + add;
        
        return Double.toString(BMR);
    }
}
