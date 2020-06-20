package com.travelagency.travelagency.controller;

import com.travelagency.travelagency.entity.Tour;
import com.travelagency.travelagency.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TourController {
    private TourService tourService;

    public TourController(@Autowired TourService tourService) {
        this.tourService = tourService;
    }

    @GetMapping("/tour")
    public List<Tour> getAll(){
        return tourService.getAll();
    }

    @GetMapping("/tour/{tourId}")
    public Tour get(@PathVariable("tourId") int tourId){
        return tourService.get(tourId);
    }

    @PostMapping("/tour")
    public Tour add(@RequestBody Tour tour){
        return tourService.add(tour);
    }

    @PutMapping("/tour")
    public Tour update(@RequestBody Tour tour){
        return tourService.add(tour);
    }

    @DeleteMapping("/tour/{tourId}")
    public String delete(@PathVariable("tourId") int tourId){
        System.out.println(tourId + " will be deleted");
        tourService.delete(tourId);
        return tourId + " is deleted";
    }
}
