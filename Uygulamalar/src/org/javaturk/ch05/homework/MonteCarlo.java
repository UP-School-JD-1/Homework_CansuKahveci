package org.javaturk.ch05.homework;

import java.util.Random;
import java.util.Scanner;

public class MonteCarlo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many point do you put in square?");
		int pointNumber = sc.nextInt();
		int numberInCircle = 0;

		long start = System.currentTimeMillis();
//		for (int i = 0; i < 1000000; i++) {
		for (int i = 0; i < pointNumber; i++) {
			double x = Math.random();
			double y = Math.random();
//			double r = Math.sqrt(x * x + y * y);
//			birim çember üzerinde işlem yapılacağı için r max 1 olur. Karakök hesaplayarak bilgisayara işlem yaptırmamız gerekmiyor.
			double r = x * x + y * y;
			if (r <= 1) {
				numberInCircle++;
			}
		}
		long end = System.currentTimeMillis();
		long time = end - start;

//		ri / 4 = numberInCircle / n(total point number)  --> Monte Carlo Formula
//		double PI = 4.0 * numberInCircle / 1000000;
		double PI = 4.0 * numberInCircle / pointNumber;

		System.out.println("Monto Carlo formulas PI = " + PI);
		System.out.println(time);
		System.out.println("PI = " + Math.PI);

	}

}
