package com.cars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Repository@RequestMapping("/book")
public class Book {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String book(){
        return "book";
    }
}
