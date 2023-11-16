package com.spring.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rating.entities.Rating;
import com.spring.rating.services.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	RatingService ratingService;
	
	//create rating
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}
	
	//get all 
	@GetMapping
	public ResponseEntity<List<Rating>> getRating(){
		return ResponseEntity.ok(ratingService.getAllRating());
	}
	
	//get list of rating by userId 
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingService.getRatingByUserId(userId));
	}
	
	//get list of rating by hotelId 
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
	}


}
