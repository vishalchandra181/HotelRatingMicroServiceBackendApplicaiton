package com.spring.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hotel.entity.Hotel;
import com.spring.hotel.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	//create
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
	}
	
	
	//getSingle
	@GetMapping("/{hotelid}")
	public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelid){
		return ResponseEntity.status(HttpStatus.OK).body(hotelService.getSingle(hotelid));
	}
	
	//getAll
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllUser(){
		return ResponseEntity.ok(hotelService.getAll());
	}
	
	//delete single record 
	@DeleteMapping("/{hotelid}")
	public ResponseEntity<String> deleteSingleHotel(@PathVariable String hotelid){
		return ResponseEntity.ok(hotelService.deleteHotel(hotelid));
	}
}
