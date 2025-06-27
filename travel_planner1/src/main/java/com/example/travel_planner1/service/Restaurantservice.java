package com.example.travel_planner1.service;

import com.example.travel_planner1.entity.Restaurants;
import com.example.travel_planner1.repository.Restaurantsrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Restaurantservice {

    @Autowired
    private Restaurantsrepository restaurantsRepository;

    public Restaurants save(Restaurants restaurant) {
        return restaurantsRepository.save(restaurant);
    }

    public List<Restaurants> getAll() {
        return restaurantsRepository.findAll();
    }

    public List<Restaurants> searchByName(String name) {
        return restaurantsRepository.findByRestaurantnameContainingIgnoreCase(name);
    }

    public void deleteById(Long id) {
        restaurantsRepository.deleteById(id);
    }
}
