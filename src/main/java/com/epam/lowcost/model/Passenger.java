package com.epam.lowcost.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;

import static lombok.AccessLevel.PRIVATE;

@Entity
@NoArgsConstructor
@Data
@FieldDefaults(level = PRIVATE)
public class Passenger extends AbstractEntity {
    String name;
    Integer passport;
}
