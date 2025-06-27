package com.example.travel_planner1.controller;

import com.example.travel_planner1.entity.Route;
import com.example.travel_planner1.service.Routeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/Route")
public class Routecontroller {
    @Autowired
    private Routeservice RouteService;
    @PostMapping
    public Route addRoute(@RequestBody Route route) {
        return RouteService.saveRoute(route);
    }
    @GetMapping
    public List<Route> getAllRoutes(){
        return RouteService.getAllRoutes();
    }
    // Get route by ID
    @GetMapping("/{id}")
    public Optional<Route> getRouteById(@PathVariable Long id) {
        return RouteService.getRouteById(id);
    }

    // Delete route by ID
    @DeleteMapping("/{id}")
    public void deleteRoute(@PathVariable Long id) {
        RouteService.deleteRoute(id);
    }

}
