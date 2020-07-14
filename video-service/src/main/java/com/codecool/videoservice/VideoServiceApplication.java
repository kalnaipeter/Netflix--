package com.codecool.videoservice;

import com.codecool.videoservice.entity.Video;
import com.codecool.videoservice.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class VideoServiceApplication {

	@Autowired
	private VideoRepository videoRepository;

	public static void main(String[] args) {
		SpringApplication.run(VideoServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(){
		return args -> {
			Video video = Video.builder()
					.name("Crawl")
					.url("https://www.youtube.com/watch?v=H6MLJG0RdDE")
					.build();

			videoRepository.save(video);
		};
	}
}
