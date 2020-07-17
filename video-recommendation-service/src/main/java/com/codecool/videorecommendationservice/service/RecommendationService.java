package com.codecool.videorecommendationservice.service;

import com.codecool.videorecommendationservice.entity.Recommendation;
import com.codecool.videorecommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService {

    @Autowired
    private RecommendationRepository repository;

    public Recommendation getRecommendationByVideoId(Long id){
        return repository.findByVideoId(id);
    }
}
