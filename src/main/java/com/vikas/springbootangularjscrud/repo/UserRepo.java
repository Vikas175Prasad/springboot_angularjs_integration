package com.vikas.springbootangularjscrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikas.springbootangularjscrud.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
