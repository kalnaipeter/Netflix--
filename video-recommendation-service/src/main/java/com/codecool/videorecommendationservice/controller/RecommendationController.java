package com.codecool.videorecommendationservice.controller;

import com.codecool.videorecommendationservice.entity.Recommendation;
import com.codecool.videorecommendationservice.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {

    @Autowired
    private RecommendationService service;

    @GetMapping("/1")
    public String asd(){
        return "rendben van";
    }

    @GetMapping("/{id}")
    public Recommendation getRecommendationByVideoId(@PathVariable("id")Long id){
        return service.getRecommendationByVideoId(id);
    }
}
