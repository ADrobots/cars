package com.cars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Mechanics {
    @RequestMapping(value = "/mechanics", method = RequestMethod.GET)
    public String mechanics(){
        return "mechanics";
    }
}
