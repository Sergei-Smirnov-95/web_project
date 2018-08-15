package com.epam.lowcost.controller;

import com.epam.lowcost.model.Passenger;
import com.epam.lowcost.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class PassengerController {
    @Autowired
    private PassengerRepository passengerRepository;

    @RequestMapping(value = "/passengers", method = GET)
    public List<Passenger> getAll() {
        return (List<Passenger>) passengerRepository.findAll();
    }

}
