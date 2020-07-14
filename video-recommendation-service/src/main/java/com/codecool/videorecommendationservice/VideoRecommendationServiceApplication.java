package com.codecool.videorecommendationservice;

import com.codecool.videorecommendationservice.entity.Recommendation;
import com.codecool.videorecommendationservice.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class VideoRecommendationServiceApplication {

	@Autowired
	private RecommendationRepository recommendationRepository;

	public static void main(String[] args) {
		SpringApplication.run(VideoRecommendationServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(){
		return args -> {
			Recommendation recommendationEntity = Recommendation.builder()
					.text("does not worth the time, such a fleo movie")
					.build();

			recommendationRepository.save(recommendationEntity);
		};
	}
}
