package com.spring.rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rating.entities.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
    
	//coustom finder methods
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
}
