package com.example.travel_planner1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Restaurants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String restaurantname;
    private int averageprice;
    private double rating;

    public Restaurants() {}

    public Restaurants(String restaurantname, int averageprice, double rating) {
        this.restaurantname = restaurantname;
        this.averageprice = averageprice;
        this.rating = rating;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getRestaurantname() {
        return restaurantname;
    }

    public void setRestaurantname(String restaurantname) {
        this.restaurantname = restaurantname;
    }

    public int getAverageprice() {
        return averageprice;
    }

    public void setAverageprice(int averageprice) {
        this.averageprice = averageprice;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
