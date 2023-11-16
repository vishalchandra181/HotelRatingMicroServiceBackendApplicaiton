package com.spring.rating.services;

import java.util.List;

import com.spring.rating.entities.Rating;

public interface RatingService {
	
	//create 
	Rating createRating(Rating rating);
	
	//get all rating
	List<Rating> getAllRating();
	
	//get rating by userId
	List<Rating> getRatingByUserId(String userid);
	
	//get all rating byHotel
	List<Rating> getRatingByHotelId(String hotelId);
	

}
