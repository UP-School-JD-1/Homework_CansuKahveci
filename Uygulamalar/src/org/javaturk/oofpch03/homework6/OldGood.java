package org.javaturk.oofpch03.homework6;

public class OldGood implements Locationable {
	
	private String location;
	private String description;
	
//	public OldGood(Location location, String description) {
//		this.location = location;
//		this.description = description;
//	}
//	
//	public Locaiton getLocation() {
//		return location;
//	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void Location(String location) {
		this.location = location;
		
	}

//	@Override
//	public void Location(String location) {
//		this.location = location;
//		System.out.println("Location : "+ getLocation());	
//		
//	}

}
