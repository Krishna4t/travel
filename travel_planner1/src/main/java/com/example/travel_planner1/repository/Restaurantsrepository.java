package com.example.travel_planner1.repository;

import com.example.travel_planner1.entity.Restaurants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Restaurantsrepository extends JpaRepository<Restaurants, Long> {
    List<Restaurants> findByRestaurantnameContainingIgnoreCase(String name);
}
