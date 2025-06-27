package com.example.travel_planner1.service;

import com.example.travel_planner1.entity.Route;
import com.example.travel_planner1.repository.Routerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Routeservice {

    @Autowired
    private Routerepository routeRepository;

    // Add a new Route
    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }

    // Get all Routes
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    // Get Route by ID
    public Optional<Route> getRouteById(Long id) {
        return routeRepository.findById(id);
    }

    // Delete Route by ID
    public void deleteRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
