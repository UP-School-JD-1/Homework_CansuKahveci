package org.javaturk.ch12.homework.question1;

public class Circle extends Shape{
	
	public double r;

	@Override
	double calculateArea(double r) {
         this.r = r;
		return 2 * Math.PI * Math.pow(r,2);
	}
	@Override
	double calculateCircumference(double r) {
		return 2 * Math.PI * r;
	}
}
