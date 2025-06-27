package com.example.travel_planner1.controller;

import com.example.travel_planner1.entity.Stay;
import com.example.travel_planner1.service.Stayservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stays")
public class Staycontroller {
    @Autowired
    private Stayservice StayService;
    @PostMapping
    public Stay addStay(@RequestBody Stay stay){
        return StayService.savestay(stay);
    }
    @GetMapping
    public List<Stay> getAllstay(){
        return StayService.getAllstay();
    }
    @GetMapping("/{id}")
    public Optional<Stay> getstaybyId(@PathVariable long id){
        return StayService.getStaytId(id);
    }
    @DeleteMapping("/{id}")
    public void deletestay(@PathVariable long id){
        StayService.deleteStay(id);
    }
}
