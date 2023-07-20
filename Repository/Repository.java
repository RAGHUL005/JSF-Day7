package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Entity;
@org.springframework.stereotype.Repository

public interface  Repository extends JpaRepository<Entity, Integer>{

}