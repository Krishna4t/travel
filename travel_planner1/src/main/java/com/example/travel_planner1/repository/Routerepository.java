package com.example.travel_planner1.repository;

import com.example.travel_planner1.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Routerepository extends JpaRepository<Route, Long> {
    // Optional: Add custom queries later if needed (like finding routes by start or end location)
}
