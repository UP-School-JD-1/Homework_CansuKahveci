package org.javaturk.ch12.homework.question1;

public class Shape {

	protected double length;
	protected double width;

	public Shape() {

	};

	public Shape(double length, double witdh) {
		this.length = length;
		this.width = witdh;
	};

	void draw() {

	};

	void erase() {

	};

	double calculateArea(double lenght, double width) {

		this.length = length;
		this.width = width;
		double area = lenght * width;
		return area;
	};

	double calculateArea(double lenght) {

		this.length = length;
		double area = Math.pow(lenght, 2);
		return area;
	};

	double calculateCircumference(double length, double witdh, double c) {
		this.length = length;
		this.width = witdh;
		double circumference = 2 * length * witdh * c;
		return circumference;
	}

	double calculateCircumference(double length, double width) {
		this.length = length;
		this.width = width;
		double circumference = 2 * length * length;
		return circumference;
	}

	double calculateCircumference(double d) {
		double circumference = 4 * d;
		return circumference;
	}

}
