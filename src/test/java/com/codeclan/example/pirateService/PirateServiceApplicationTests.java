package com.codeclan.example.pirateService;

import com.codeclan.example.pirateService.Models.Pirate;
import com.codeclan.example.pirateService.Repositories.PirateRepository;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreatePirate() {
		Pirate piratePete = new Pirate("Pete","The Pirate", 47);
		pirateRepository.save(piratePete);
	}
}
