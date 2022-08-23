package org.javaturk.ch12.homework.question1;

public class Shape {

	protected double length;
	protected double width;

	public Shape() {

	};

	public Shape(double length) {
		this.length = length;
	};

	public Shape(double length, double witdh) {
		this.length = length;
		this.width = witdh;
	};

	void draw() {

	};

	void erase() {

	};

	double calculateArea(double length) {
		this.length = length;
		double area = Math.pow(length, 2);
		return area;
	};

	double calculateArea(double length, double width) {
		this.length = length;
		this.width = width;
		double area = length * width;
		return area;
	};

	double calculateCircumference(double d) {
		double circumference = 4 * d;
		return circumference;
	}

	double calculateCircumference(double length, double width) {
		this.length = length;
		this.width = width;
		double circumference = 2 * length * length;
		return circumference;
	}

	double calculateCircumference(double length, double witdh, double edge) {
		this.length = length;
		this.width = witdh;
		double circumference = length + witdh + edge;
		return circumference;
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Shape Info : ";
		str += "length: " + length + "\n";
		str += "width: " + width + "\n";
		return str;
	}

	@Override
	public boolean equals(Object o) {
		Shape s = (Shape) o;
		boolean b = false;
		if (length == s.length & width == s.width)
			b = true;
		return b;
	}

}
