package com.example.travel_planner1.controller;

import com.example.travel_planner1.entity.Restaurants;
import com.example.travel_planner1.service.Restaurantservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class Restaurantscontroller {

    @Autowired
    private Restaurantservice restaurantsService;

    // Add a new restaurant
    @PostMapping
    public Restaurants addRestaurant(@RequestBody Restaurants restaurant) {
        return restaurantsService.save(restaurant);
    }

    // Get all restaurants
    @GetMapping
    public List<Restaurants> getAllRestaurants() {
        return restaurantsService.getAll();
    }

    // Search restaurants by name
    @GetMapping("/search")
    public List<Restaurants> searchRestaurants(@RequestParam String name) {
        return restaurantsService.searchByName(name);
    }

    // Delete restaurant by ID
    @DeleteMapping("/{id}")
    public void deleteRestaurant(@PathVariable Long id) {
        restaurantsService.deleteById(id);
    }
}
