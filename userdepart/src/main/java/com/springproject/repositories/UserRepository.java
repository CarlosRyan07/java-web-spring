package com.springproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.userdepart.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
