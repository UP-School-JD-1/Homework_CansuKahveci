package org.javaturk.ch05.homework;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("Please enter a positive number");
		int a = sc.nextInt();


		for(int i = 1; i <= a; i++ ) {
//			System.out.println(i);
			if((i % 15) == 0) {
				System.out.print("Fizz Buzz\n");
			}else if((i % 5) == 0) {
				System.out.print("Fizz\n");
			}else if((i % 3) == 0) {
				System.out.print("Buzz\n");
			}else {
				System.out.print(i + "\n");
			}
		}
	}

}
