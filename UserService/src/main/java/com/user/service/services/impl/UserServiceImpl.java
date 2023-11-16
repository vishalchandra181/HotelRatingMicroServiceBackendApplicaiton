 package com.user.service.services.impl;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.Entities.Hotel;
import com.user.service.Entities.Rating;
import com.user.service.Entities.User;
import com.user.service.exception.ResourceNotFoundException;
import com.user.service.externalServices.HotelService;
import com.user.service.externalServices.RatingService;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private RatingService ratingService;
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUUID=UUID.randomUUID().toString();
		user.setUserId(randomUUID);
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		List<User> allUser=userRepository.findAll();
		return allUser;
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		
	    User user=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User with given ID is not found..!!  "+userId)); 
	    Rating[] RatingUser=ratingService.getRating(user.getUserId());
	    List<Rating> ratings =Arrays.stream(RatingUser).toList(); 
	    List<Rating> ratingList=ratings.stream().map(rating ->{Hotel hotel=hotelService.getHotel(rating.getHotelId());
	    rating.setHotel(hotel);
	    return rating;}).collect(Collectors.toList());
	    user.setRating(ratingList);
	    return user;
		
	}

}
