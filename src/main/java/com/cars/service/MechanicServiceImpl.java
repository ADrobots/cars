package com.cars.service;

import com.cars.controllers.Mechanics;
import com.cars.dao.MecDao;
import com.cars.dao.MechanicDao;
import com.cars.dto.Mechanic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicServiceImpl implements MechanicService {

    @Autowired
    private MecDao mechanicDao;


    public List<Mechanic> getAll(){
        /*List<Mechanic> allMechanic=mechanicDao.getAll();
        return mechanicDao.getAll();*/

        List<Mechanic> allMechanic=mechanicDao.getAll();
        return mechanicDao.getAll();
    }

}
