package com.codeclan.example.pirateService.Controllers;

import com.codeclan.example.pirateService.Models.Ship;
import com.codeclan.example.pirateService.Repositories.PirateRepository;
import com.codeclan.example.pirateService.Repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/ships")
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/")
    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Ship> getPirate(@PathVariable Long id){
        return shipRepository.findById(id);
    }


}
