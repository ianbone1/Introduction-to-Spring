package com.codeclan.example.pirateService;

import com.codeclan.example.pirateService.Models.Pirate;
import com.codeclan.example.pirateService.Models.Raid;
import com.codeclan.example.pirateService.Models.Ship;
import com.codeclan.example.pirateService.Repositories.PirateRepository;
import com.codeclan.example.pirateService.Repositories.RaidRepository;
import com.codeclan.example.pirateService.Repositories.ShipRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateServiceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Before
	public void setup(){

	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShip() {
		Ship ship = new Ship("Flying Dutchman");
		shipRepository.save(ship);
		Pirate piratePete = new Pirate("Pete","The Pirate", 47,ship);
		pirateRepository.save(piratePete);
		Raid raid = new Raid("Ransack Aldis");
		raidRepository.save(raid);
		piratePete.addRaid(raid);
		pirateRepository.save(piratePete);
	}

}
