package org.javaturk.ch12.homework.question1;

public class ShapeTest {

	public static void main(String[] args) {

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(4);
		

		Square s1 = new Square();
		Shape shape = new Shape(4,4);
		Square s2 = new Square();

		Triangle t1 = new Triangle(2,4,5);
		Triangle t2 = new Triangle(7,6,9);
		Triangle t3 = t2;

		Rectangle r1 = new Rectangle(5, 9);
		Rectangle r2 = new Rectangle(2, 4);
		Rectangle r3 = r1;
		
		
		

		shape.toString();
		// square de toString i ezmedik
		s1.toString();
		c1.toString();
		t1.toString();
		
		System.out.println();
		System.out.println("c1.equals(c2) " + c1.equals(c2));
		System.out.println("s1.equals(s2) " + s1.equals(s2));
		System.out.println("shape.equals(t1) " + shape.equals(t1));
		System.out.println("t3.equals(t2) " + t3.equals(t2));
		System.out.println("r3.equals(r1) " + r3.equals(r1));
		System.out.println();
		
		System.out.println("c1.hashCode() " + c1.hashCode());
		System.out.println("c2.hashCode() " + c2.hashCode());
		
		System.out.println("t3.hashCode() " + t3.hashCode());
		System.out.println("t1.hashCode() " + t1.hashCode());
		
		System.out.println("r3.hashCode() " + r3.hashCode());
		System.out.println("r1.hashCode() " + r1.hashCode());
		
		//Square sınıfında hashcode'u sabit bir değer verildi 
		System.out.println("s1.hashCode() " + s1.hashCode());
		System.out.println("s2.hashCode() " + s2.hashCode());
		
	}

}
