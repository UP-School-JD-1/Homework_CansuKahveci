package org.javaturk.ch05.homework;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number to learn it is prime or not\n");
		int number = sc.nextInt();
		PrimeNumber pn = new PrimeNumber();
//		pn.isPrime(number);
//		System.out.print(pn.isPrime(number));
		pn.countOfPrimeNumber(number);

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
//		int upperBound = (int)(Math.sqrt(number)+1);
//			for (int i = 1; i < upperBound; i++) {
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

	}

	static boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
//		if (number < 2) {
//			System.out.print("Please enter a number bigger than 1");
//			return false;
//		}
		for (; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
//		if (prime) {
//			System.out.println(i + "Number is prime! ");
//		} else {
//			System.out.println("First divisor : " + i);
//		}
		return prime;

	}

	void countOfPrimeNumber(int n) {
		int numberOfPrimes = 0;
		for (int i = 2; i < n; i++) {
			boolean prime = isPrime(i);
			if (prime == true) {
				numberOfPrimes++;
				System.out.println("Prime Divisor: " +i);
			}
		}
		System.out.println("There are " + numberOfPrimes + " primes in " + n);
	}

}
