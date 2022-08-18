package org.javaturk.ch12.homework.question1;

public class Triangle extends Shape {

	public double side1;
	public double side2;
	public double side3;

	// bunu yapmak gerekli mi? super kullanmamanın bir eksisi var mı?
	Triangle() {
		super();
	};

	Triangle(double side1, double side2, double side3) {
		super(side1, side2);
		this.side3 = side3;
	};

	@Override
	void erase() {
		System.out.print("This is a method to erase triangle");
		super.erase();
	}

	@Override
	double calculateArea(double side1, double side2) {
		double area = (super.calculateArea(side1, side2)) / 2;
		return area;
	}

	@Override
	double calculateCircumference(double side1, double side2, double side3) {
		return super.calculateCircumference(side1, side2, side3);
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Triangle Info : ";
		str += "side1: " + side1 + "\n";
		str += "side2: " + side2 + "\n";
		str += "side3: " + side3 + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		int random = (int) Math.random();
		int total = (int) side1 + (int) side2 + (int) side3;
		int hash = total + random;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Triangle t = (Triangle) o;
		boolean b = false;
		if (side1 == t.side1 & side2 == t.side2 & side3 == t.side3)
			b = true;
		return b;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

}
