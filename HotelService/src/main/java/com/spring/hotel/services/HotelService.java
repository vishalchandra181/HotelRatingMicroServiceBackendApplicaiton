package com.spring.hotel.services;

import java.util.List;

import com.spring.hotel.entity.Hotel;

public interface HotelService {
	
	//create
	Hotel createHotel(Hotel hotel);
	
	//getAll
	List<Hotel> getAll();
	
	//getSingle
	Hotel getSingle(String id);
	
	//delete hotel by id
	String deleteHotel(String id);

}
