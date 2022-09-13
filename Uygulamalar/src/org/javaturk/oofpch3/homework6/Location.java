package org.javaturk.oofpch3.homework6;

public class Location implements Locationable {

	private String depot;
	private String place;

	public Location(String depot, String place) {
		this.depot = depot;
		this.place = place;
	}

	public String getDepot() {
		return depot;
	}

	public void setDepot(String depot) {
		this.depot = depot;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
