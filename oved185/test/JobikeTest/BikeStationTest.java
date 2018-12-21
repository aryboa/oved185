package JobikeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import glp91.jobike.BikeStation;
import glp91.jobike.EBike;

class BikeStationTest {

	@Test
	public void createAndAddNumMaxBikes() {
		BikeStation bs01 = new BikeStation("Duomo", 10);
		EBike e01 = new EBike();
		bs01.addNewBike("Ciao", e01);
		
	}
	
}
