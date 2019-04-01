package com.codeclan.example.pirateService.Repositories;

import com.codeclan.example.pirateService.Models.Raid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaidRepository extends JpaRepository<Raid, Long> {

}
