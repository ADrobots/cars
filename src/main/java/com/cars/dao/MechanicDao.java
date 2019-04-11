package com.cars.dao;

import com.cars.dto.Mechanic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MechanicDao  implements  MecDao{

    @Autowired
    private SessionFactory sessionFactory;
    public List<Mechanic> getAll(){


       List<Mechanic> list=sessionFactory.getCurrentSession().createCriteria(Mechanic.class).list();
        System.out.print(""+list.toString());
       return list;
    }
}
