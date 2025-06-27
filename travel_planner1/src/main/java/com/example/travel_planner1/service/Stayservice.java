package com.example.travel_planner1.service;

import com.example.travel_planner1.entity.Stay;
import com.example.travel_planner1.repository.Stayrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Stayservice {
@Autowired
    private Stayrepository StayRepository;
    public Stay savestay(Stay stay){
        return StayRepository.save(stay);
    }
    public List<Stay> getAllstay(){
        return StayRepository.findAll();
    }
    public Optional<Stay> getStaytId(Long id){
        return StayRepository.findById(id);
    }
    public void deleteStay(Long id) {
        StayRepository.deleteById(id);
    }
}
