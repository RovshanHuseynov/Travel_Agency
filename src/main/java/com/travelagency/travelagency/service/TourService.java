package com.travelagency.travelagency.service;

import com.travelagency.travelagency.entity.Tour;
import com.travelagency.travelagency.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    private TourRepository tourRepository;

    public TourService(@Autowired TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    public List<Tour> getAll(){
        return tourRepository.findAll();
    }

    public Tour get(int tourId){
        return tourRepository.findById(tourId).get();
    }

    public Tour add(Tour tour){
        return tourRepository.save(tour);
    }

    public void delete(int tourId){
        tourRepository.deleteById(tourId);
    }
}
