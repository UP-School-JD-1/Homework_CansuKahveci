package org.javaturk.oofpch03.homework6;

public class Product extends AbstractProduct implements Priceable, Locationable {

	private double price;
	private String location;

	public Product(String sku, String description, double tax, double price, String location) {
		super(sku, description, tax);
		this.price = price;
		this.location = location;
	}

	@Override
	public void purchaise() {
		System.out.println("purchaise() in Product");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
