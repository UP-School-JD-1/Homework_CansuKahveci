package org.javaturk.ch12.homework.question1;

public class Triangle extends Shape{

	public double side;
	@Override
	void erase() {
		System.out.print("This is a method to erase triangle");
		super.erase();
	}

	@Override
	double calculateArea(double lenght, double width) {
		double area = (super.calculateArea(lenght, width)) / 2;
		return area;
	}

	@Override
	double calculateCircumference(double lenght,double width,double side) {
		this.side = side;
		return super.calculateCircumference(lenght, width);
	}

}
