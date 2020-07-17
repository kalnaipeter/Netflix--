package com.codecool.videoservice.controller;

import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {

    @Autowired
    private VideoService service;

    @GetMapping("/all")
    public List<Video> getAllWithoutRecommendation(){
        return service.getAllWithoutRecommendation();
    }

    @GetMapping("/1")
    public String asd(){
        return "asd";
    }

    @GetMapping("/video/{id}")
    public List<Object> getVideoWithRecommendationById(@PathVariable("id")Long id){
        return service.getVideoWithRecommendationById(id);
    }
}
