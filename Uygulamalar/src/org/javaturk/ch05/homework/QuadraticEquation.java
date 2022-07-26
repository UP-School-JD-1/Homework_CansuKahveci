package org.javaturk.ch05.homework;

import java.util.Scanner;

public class QuadraticEquation {
	
	double x1;
	double x2;

	public static void main(String[] args) {

		QuadraticEquation qe = new QuadraticEquation();

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a constant of quadratic equation to calculate");
		int a = sc.nextInt();
		System.out.println("Please enter b constant of quadratic equation to calculate");
		int b = sc.nextInt();
		System.out.println("Please enter c constant of quadratic equation to calculate");
		int c = sc.nextInt();
//		System.out.println("a = " + a +"b = "+ b +"c = "+ c);
//		if-else eklenebilir denklemde sayılar eksili olursa farklı yazılmalı
//		System.out.println("Denklemiz: " + a + "x²" + b + "x" + c);
		qe.CalculateEquation(a, b, c);

	}



	void CalculateEquation(int a, int b, int c) {
		
		double discriminant = (Math.pow(b, 2)) - (4 * a * c);
		System.out.println("a = " + a +" b = "+ b +" c = "+ c + " disc = " + discriminant);
		x1 = this.x1;
		x2 = this.x2;

		if (discriminant < 0) {

			System.out.println("The equation does not have reel root");
			

		} else if (discriminant == 0) {

			x1 = -b / (2 * a);
			x2 = x1;
			System.out.print("Roots of the equation: \n" + "x1 = x2 = " + x1 );
		} else {
			x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.print("Roots of the equation: \n" + "x1 = " + x1 + "\n" + "x2 = " + x2);
		}
	
	}
	
	

}
