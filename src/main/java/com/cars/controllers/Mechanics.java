package com.cars.controllers;

import com.cars.dto.Mechanic;
import com.cars.service.MechanicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/mechanics")
public class Mechanics {
    @Autowired
    private MechanicService mechanicService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mechanics(){
        return "mechanics";
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Mechanic> getAll(){
        return mechanicService.getAll();
    }




}
