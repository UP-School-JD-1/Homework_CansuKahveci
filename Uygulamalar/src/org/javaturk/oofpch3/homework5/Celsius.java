package org.javaturk.oofpch3.homework5;

public class Celsius extends Temperature {

	public final static double WATER_BOILING_POINT = 100;
	public final static double WATER_FREAZING_POINT = 0;

	public Celsius(double scale) {
		super(scale);
	}

	@Override
	public double convert() {
		double celsius = (getScale() - WATER_FREAZING_POINT) / (WATER_BOILING_POINT - WATER_FREAZING_POINT);
		System.out.println(celsius);
		return celsius;
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
