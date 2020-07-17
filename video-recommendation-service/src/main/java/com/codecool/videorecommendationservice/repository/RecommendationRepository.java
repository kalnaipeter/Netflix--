package com.codecool.videorecommendationservice.repository;

import com.codecool.videorecommendationservice.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RecommendationRepository extends JpaRepository<Recommendation,Long> {

    @Query("SELECT r FROM Recommendation r WHERE r.videoId = : id")
    Recommendation findByVideoId(@Param("id") Long id);
}
