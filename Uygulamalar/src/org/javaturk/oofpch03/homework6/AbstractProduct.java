package org.javaturk.oofpch03.homework6;

public abstract class AbstractProduct {

	private String sku;
	private String description;
	private double tax;

	public AbstractProduct(String sku, String description, double tax) {

		this.sku = sku;
		this.description = description;
		this.tax = tax;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

}
