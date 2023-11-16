package com.spring.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
