package org.javaturk.oofpch03.homework5;

public abstract class Temperature implements TemperatureConverter {
	
	protected double scale;
//	protected double waterBoilingPoint;
//	protected double waterFreazingPoint;
	

	public Temperature(double scale) {
		this.scale = scale;
//		this.waterBoilingPoint = waterBoilingPoint;
//		this.waterFreazingPoint = waterFreazingPoint;
		
	}


	public double getScale() {
		return scale;
	}


	public void setScale(double scale) {
		this.scale = scale;
	}


}
