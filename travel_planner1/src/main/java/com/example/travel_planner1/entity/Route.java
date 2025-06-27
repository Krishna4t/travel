package com.example.travel_planner1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String start;

    @Column(name = "end_location")  // 👈 Fix for SQL keyword conflict
    private String end;

    private Double distance;
    private Double duration;

    public Route() {}

    public Route(Long id, String start, String end, Double distance, Double duration) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.duration = duration;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStart() { return start; }
    public void setStart(String start) { this.start = start; }

    public String getEnd() { return end; }
    public void setEnd(String end) { this.end = end; }

    public Double getDistance() { return distance; }
    public void setDistance(Double distance) { this.distance = distance; }

    public Double getDuration() { return duration; }
    public void setDuration(Double duration) { this.duration = duration; }
}
