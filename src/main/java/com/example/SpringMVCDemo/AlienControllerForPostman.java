package com.example.SpringMVCDemo;

import com.example.SpringMVCDemo.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AlienControllerForPostman {
    @Autowired
    AlienRepo repo;



    @GetMapping(path ="aliens",produces= {"application/xml","application/json"})
    public List<Alien> getAliens(){
        List<Alien> aliens = repo.findAll();
        return aliens;
    }

    @GetMapping("alien/{id}")
    public Alien getAlien(@PathVariable("id") int id){
        Alien alien = repo.findById(id).orElse(new Alien(0,""));
        return alien;
    }
    @GetMapping("show")
    public List<Alien> show(){
        List<Alien> aliens = Arrays.asList(new Alien(101, "Love"), new Alien(102, "Preet"));
        return aliens;
    }
    @PostMapping("alien")
    public Alien addAlien(Alien alien){
        System.out.println("saving data .....");
        repo.save(alien);
        return alien;
    }
}
