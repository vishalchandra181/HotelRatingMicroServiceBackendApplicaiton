package com.spring.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hotel.entity.Hotel;
import com.spring.hotel.exception.ResourceNotFoundException;
import com.spring.hotel.repositories.HotelRepository;
import com.spring.hotel.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId=UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getSingle(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(" hotel with given id is not found...!!"));
	}
	
	@Override
	public String deleteHotel(String id) {
	   hotelRepository.deleteById(id);
	   return "One Hotel is deleted";
	}

}
