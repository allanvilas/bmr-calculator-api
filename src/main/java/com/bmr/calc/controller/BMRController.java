package com.bmr.calc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmr.calc.model.Person;
import com.bmr.calc.service.BMRService;

@RestController
@RequestMapping("/api")
public class BMRController {

    @Autowired
    private BMRService bmrService;

    @PostMapping(value = "/calculate")
    public String calculateBMRandTDEE(@RequestBody Person person){
        return bmrService.calculateBMRandTDEE(person);
    }
}
