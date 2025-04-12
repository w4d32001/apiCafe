package com.cafe.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafe.main.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
    
}
