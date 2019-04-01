package com.codeclan.example.pirateService.Repositories;

import com.codeclan.example.pirateService.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
