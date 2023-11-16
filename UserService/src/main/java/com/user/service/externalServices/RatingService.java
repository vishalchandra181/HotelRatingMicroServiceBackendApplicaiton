package com.user.service.externalServices;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.service.Entities.Rating;

@FeignClient("RatingService")
public interface RatingService {
	
	@GetMapping("/ratings/users/{userId}")
	public Rating[] getRating(@PathVariable("userId") String userId);
	
	

}
