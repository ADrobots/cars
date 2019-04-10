package com.cars.controllers;

import com.cars.dao.MecDao;
import com.cars.dao.MechanicDao;
import com.cars.dto.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class Test {

    @Autowired
    private MecDao mechanicDao;

    @RequestMapping("/")
    public void test(){
        System.out.println("test");
        List<Mechanic> all = mechanicDao.getAll();
        System.out.print(all);
    }

}
