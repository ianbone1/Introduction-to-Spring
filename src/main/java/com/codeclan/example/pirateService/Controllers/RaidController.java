package com.codeclan.example.pirateService.Controllers;

import com.codeclan.example.pirateService.Models.Raid;
import com.codeclan.example.pirateService.Models.Ship;
import com.codeclan.example.pirateService.Repositories.RaidRepository;
import com.codeclan.example.pirateService.Repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/raids")
public class RaidController {

    @Autowired
    RaidRepository raidRepository;

    @GetMapping(value = "/")
    public List<Raid> getAllRaids(){
        return raidRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Raid> getRaid(@PathVariable Long id){
        return raidRepository.findById(id);
    }


}
