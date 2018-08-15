package com.epam.lowcost.model;

import lombok.Getter;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
}
