package com.codecool.videoservice.service;

import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoRepository repository;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${recommendation.url}")
    private String recommendationUrl;

    public List<Video> getAllWithoutRecommendation(){
        return repository.findAll();
    }

    public List<Object> getVideoWithRecommendationById(Long id) {
        List<Object> list = new ArrayList<>();
        list.add(repository.findById(id));

        String recommendation = restTemplate.getForEntity(recommendationUrl + "/1",String.class).getBody();
        System.out.println("the string is " + recommendation);
        return list;
    }

}
