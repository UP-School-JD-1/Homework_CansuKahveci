package org.javaturk.ch05.homework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to learn it is prime or not\n");
		int number = sc.nextInt();

//		if(number < 2) {
//			System.out.print(number + " have to be bigger than 1.");
//		}
//		if(number == 2) {
//				System.out.print(number + " is prime number.");
//			}
//		for(int i = 2; i< number; i++) {
//			
//			if(number % i == 0) {
//				System.out.print(number + " is not prime number.");
//				break;
//			}else {
//				System.out.print(number + " is prime number.");
//				break;
//			}
//		}

//		
//		if (number > 1) {
//			for (int i = 1; i < Math.sqrt(number); i++) {
//
//				if (number == 2) {
//					System.out.print(number + " is not prime number.");
//				} else if (number % i == 0) {
//					System.out.print(number + " is not prime number.");
//				} else {
//					System.out.print(number + " is prime number.");
//					
//				}
//
//			}
//		}
//		else {
//			System.out.print("Please enter a number bigger than 1");
//		}

		PrimeNumber pn = new PrimeNumber();
		pn.HowManyPrime(number);

	}

	void HowManyPrime(int number) {
		
		for (int i = 2; i < number; i++) {
			int count = 0;
			if (number % i == 0) {
				System.out.print(number + " is not prime number.");
				
				
			} else {
				System.out.print(number + " is prime number.");
				count++;

			}System.out.print("count = " + count);
		}
	}
}
