package com.cars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cars")
public class Cars {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String cars(){
        return "cars";
    }

}
