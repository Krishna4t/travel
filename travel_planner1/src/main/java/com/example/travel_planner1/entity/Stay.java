package com.example.travel_planner1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter  // 👈 Apply setter for all fields at once
@Entity
public class Stay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stayname;
    private int numberrooms;
    private int numberadults;
    private int childs;
    private int oldage;

    // Default constructor (required by JPA)
    public Stay() {}

    // All-args constructor
    public Stay(String stayname, int numberrooms, int numberadults, int childs, int oldage) {
        this.stayname = stayname;
        this.numberrooms = numberrooms;
        this.numberadults = numberadults;
        this.childs = childs;
        this.oldage = oldage;
    }
}
