package org.javaturk.oofpch3.homework6;

public class ConsultancyService extends AbstractProduct implements Priceable {

	private double price;

	public ConsultancyService(String sku, String description, double tax, double price) {
		super(sku, description, tax);
		this.price = price;
	}

	@Override
	public void purchaise() {
		System.out.println("purchaise() in ConsultancyService");
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
