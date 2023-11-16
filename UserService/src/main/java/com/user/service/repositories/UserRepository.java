package com.user.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.service.Entities.User;

public interface UserRepository extends JpaRepository<User,String> {

}
