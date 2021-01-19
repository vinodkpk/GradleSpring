package com.example.demo.dao;

import com.example.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AlienRepo extends JpaRepository<Alien, Long>, JpaSpecificationExecutor<Alien> {
}
