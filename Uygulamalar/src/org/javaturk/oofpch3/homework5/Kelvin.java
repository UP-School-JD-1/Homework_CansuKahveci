package org.javaturk.oofpch3.homework5;

public class Kelvin extends Temperature {

	public final static double WATER_BOILING_POINT = 373;
	public final static double WATER_FREAZING_POINT = 273;

	public Kelvin(double scale) {
		super(scale);
	}

	@Override
	public double convert() {
		double kelvin = (getScale() - WATER_FREAZING_POINT) / (WATER_BOILING_POINT - WATER_FREAZING_POINT);
		System.out.println(kelvin);
		return kelvin;

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
