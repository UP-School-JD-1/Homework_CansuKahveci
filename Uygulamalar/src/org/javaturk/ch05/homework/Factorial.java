package org.javaturk.ch05.homework;

import java.util.Scanner;

public class Factorial {

	long factorial = 1;

	public static void main(String[] args) {
		Factorial fac = new Factorial();
//		System.out.print(fac.calculateFactorial(4));
//		System.out.print(fac.calculateFactorialRecursive(5));
		Scanner sc = new Scanner(System.in);
		System.out.print(" Please enter a number to calculate factorial");
		int number = sc.nextInt();
//		long number = sc.nextLong();

		if (number < 0) {
			System.out.print(" Please enter pozitif number");
		} else if (number == 0 || number == 1) {
			System.out.print(" factorial = " + 1);
		} else {
			long factor = fac.calculateFactorialRecursive(number);
			System.out.println("Factorial = " + factor);
		}
	}

	public long calculateFactorialRecursive(int n) {
		if (n == 1) {
			return factorial = 1;

		} else {
			factorial = n * calculateFactorialRecursive(n - 1);
			return factorial;
		}

//	public int calculateFactorial(int n) {
//		for (int i = 0; i <= n; i++) {
//			if (i == 1 | i == 0) {
//				factorial = factorial * 1;
//			} else {
//				factorial = factorial * i;
//			}
//		}
//
//		return factorial;
//	}
//	long factor = 1;
//	public long calculateFactorialRecursive(int n) {
//		if (n == 1) {
//			factor = 1;
//
//		} else {
//			factor = n * calculateFactorialRecursive(n - 1);
//			return factor;
//		}
//	}
	}
}
