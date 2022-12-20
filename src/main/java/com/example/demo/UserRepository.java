package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<CustomUser, Long> {

    CustomUser findCustomUserByUsername(String email);

}