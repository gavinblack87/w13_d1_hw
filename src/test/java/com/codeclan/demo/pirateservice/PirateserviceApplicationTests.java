package com.codeclan.demo.pirateservice;

import com.codeclan.demo.pirateservice.models.Pirate;
import com.codeclan.demo.pirateservice.models.Raid;
import com.codeclan.demo.pirateservice.models.Ship;
import com.codeclan.demo.pirateservice.repositories.PirateRepository;
import com.codeclan.demo.pirateservice.repositories.RaidRepository;
import com.codeclan.demo.pirateservice.repositories.ShipRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createPirateAndShipAndRaid(){
		Ship ship = new Ship("The Flying Dutchman");
		shipRepository.save(ship);

		Pirate pirate1 = new Pirate("Jack", "Sparrow", 32, ship);
		pirateRepository.save(pirate1);

		Raid raid = new Raid("Cape Code", 200.00);
		raidRepository.save(raid);
	}
}

