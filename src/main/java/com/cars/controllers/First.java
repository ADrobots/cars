package com.cars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class First {

    @RequestMapping(value = "/first", method = RequestMethod.GET)
    public String common(){
        return "first";
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> getPerson(){
        List<String> list=new ArrayList<String>();

        String p1=new String();
        p1="a";


        String p2=new String();
        p2="c";

        list.add(p1);
        list.add(p2);

        return list;

    }
}
