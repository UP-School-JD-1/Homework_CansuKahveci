package org.javaturk.oofpch03.homework5;

public class Fahrenheit extends Temperature {

	public final static double WATER_BOILING_POINT = 212;
	public final static double WATER_FREAZING_POINT = 32;

	public Fahrenheit(double scale) {
		super(scale);
	}

	@Override
	public double convert() {
		double fahrenheit = (getScale() - WATER_FREAZING_POINT) / (WATER_BOILING_POINT - WATER_FREAZING_POINT);
		System.out.println(fahrenheit);
		return fahrenheit;
	}

	@Override
	public double getScale() {
		return super.getScale();
	}

	@Override
	public void setScale(double scale) {
		super.setScale(scale);
	}

}
