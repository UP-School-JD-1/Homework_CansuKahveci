package org.javaturk.ch09.example3;

public class PointTest {

	public static void main(String[] args) {

				Point point1 = new Point();
				point1.x = 3;
				point1.y = 7;
				Point point2 = new Point();
				point2.x = 5;
				point2.y = 9;

				System.out.println("x : " + point1.getx());
				point1.setx(5);
				System.out.println("x : " + point1.getx());

				System.out.println("y : " + point2.gety());
				point2.sety(15);
				System.out.println("y : " + point2.gety());

				System.out.println(point1.calculateDistanceFromCenter(1, 2));
				System.out.println(point2.calculateDistanceFromCenter(3, 4));

				System.out.println("Clone of Point1 : " + point1.clone());
				System.out.println("Clone of Point1 : " + point1.clone());
				System.out.println("Clone of Point2 : " + point2.clone());

				Point point3 = point2.clone();
				System.out.println("Point3 : " + point3);
				System.out.println("x of clone object : " + point3.getx());


				System.out.println("Point1 : " + "\n"+"x = " + point1.getx() +"\n" +"y = " + point1.gety());
				System.out.println("Point2 : " +"\n"+ "x = " + point2.getx() +"\n"+ "y = " + point2.gety());

				System.out.println(point1.calculateDistanceBetweenTwoPoints(point1, point2));
				System.out.println(point2.calculateDistanceBetweenTwoPoints(point1, point3));

				System.out.println("x = " + point1.x +"\ny = " + point1.y);
				point1.move(2,3);
				System.out.println("x = " + point1.x +"\ny = " + point1.y);

		}
	}
