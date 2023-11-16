package com.spring.rating.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.rating.entities.Rating;
import com.spring.rating.repositories.RatingRepository;
import com.spring.rating.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
    
	@Autowired
	private RatingRepository ratingRepository;
	
	@Override
	public Rating createRating(Rating rating) {
		// TODO Auto-generated method stub
		String randomUUID=UUID.randomUUID().toString();
		rating.setRatingId(randomUUID);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		// TODO Auto-generated method stub
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByUserId(String userid) {
		// TODO Auto-generated method stub
		return ratingRepository.findByUserId(userid);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(hotelId);
	}
	

}
