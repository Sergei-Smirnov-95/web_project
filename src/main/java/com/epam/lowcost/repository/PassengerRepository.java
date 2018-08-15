package com.epam.lowcost.repository;

import com.epam.lowcost.model.Passenger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//Component
@Repository
public interface PassengerRepository extends CrudRepository {
    /*@Autowired
    SessionFactory SessionFactory;

    public List<Passenger> findall() {
        return (List<Passenger>) SessionFactory
                .getCurrentSession()
                .createQuery("from Passenger").list();
    }*/
}
