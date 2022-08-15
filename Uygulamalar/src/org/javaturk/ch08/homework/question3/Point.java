package org.javaturk.ch08.homework.question3;

public class Point {

	double x;
	double y;

//	public double[] getPoint(double x, double y) {
//		double[] coordinatePoint = new double[2];
//     	coordinatePoint[0] = this.x;
//		coordinatePoint[1] = this.y;
//		
//		return coordinatePoint;
//	}

	public double getx() {
		return x;
	}

	public void setx(double x) {
		this.x = x;
	}

	public double gety() {
		return y;
	}

	public void sety(double y) {
		this.y = y;
	}

	public double calculateDistanceFromCenter(double x, double y) {
		this.x = x;
		this.y = y;
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return d;
	}

	public double calculateDistanceBetweenTwoPoints(Point p1, Point p2) {

		this.x = p1.x;
		this.y = p1.y;

		double d = Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
		return d;
	}

	public Point clone() {
		Point cloneObject = new Point();
		return cloneObject;

	}

	public void move(double x, double y) {
		this.x += x;
		this.y += y;

	}

}
