package com.example.SpringMVCDemo;

import com.example.SpringMVCDemo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien, Integer> {
    List<Alien> findByName(String name);
//    @Query("from Alien where name= :naam")
//    List<Alien> find(@Param("naam") String name);
}

