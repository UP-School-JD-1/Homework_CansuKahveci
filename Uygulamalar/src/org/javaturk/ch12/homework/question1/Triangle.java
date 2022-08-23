package org.javaturk.ch12.homework.question1;

public class Triangle extends Shape {

	private double edge;

	Triangle(double length, double width, double edge) {
		super(length, width);
		this.edge = edge;
	};

	@Override
	void erase() {
		System.out.print("This is a method to erase triangle");
//		super.erase();
	}

	@Override
	double calculateArea(double length, double width) {
		double area = (super.calculateArea(length, width)) / 2;
		return area;
	}

	@Override
	double calculateCircumference(double length, double width, double edge) {
		return super.calculateCircumference(length, width, edge);
	}

	@Override
	public String toString() {
		String str = new String();
		str += "Triangle Info : ";
		str += "side1: " + length + "\n";
		str += "side2: " + width + "\n";
		str += "side3: " + edge + "\n";
		return str;
	}

	@Override
	public int hashCode() {
		int random = (int) Math.random();
		int total = (int) length + (int) width + (int) edge;
		int hash = total + random;
		return hash;
	}

	@Override
	public boolean equals(Object o) {
		Triangle t = (Triangle) o;
		boolean b = false;
		if (length == t.length & width == t.width & edge == t.edge)
			b = true;
		return b;
	}

	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

}
