package glp91.jobike;

import java.util.HashMap;

public class BikeStation {
	static final int DEFAULT_BIKES_NO = 10;
	private HashMap<String, Bike> bikes;

	private String nameStation;
	private int maxNum;

	public String getNameStation() {
		return nameStation;
	}

	public void setNameStation(String nameStation) {
		this.nameStation = nameStation;
	}

	public BikeStation() {
		this.bikes = new HashMap<>();
		this.maxNum = 10;
		this.nameStation = "Unknown";
	}
	
	public BikeStation(String nameStation, int maxNum) {
		this.bikes = new HashMap<>();
		this.maxNum = maxNum;
	}

//	public BikeStation(HashMap<String, Bike> bikes) {
//		this.bikes = bikes;
//
//	}

	public HashMap<String, Bike> getBikes() {
		return bikes;
	}

	public void setBikes(HashMap<String, Bike> bikes) {
		this.bikes = bikes;
	}

	public void addNewBike(String id, Bike bike) {
		this.bikes.put(id, bike);
	}

	public Bike searchBike(String id) {
		if (this.bikes.containsKey(id)) {
			return this.bikes.get(id);
		} else {
			return null;
		}
	}

	public boolean removeBike(String id) {
		boolean flag = false;
		if (this.bikes.containsKey(id)) {
			this.bikes.remove(id);
			flag = true;
		}
		return flag;

	}

}
