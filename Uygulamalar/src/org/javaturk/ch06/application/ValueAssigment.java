package org.javaturk.ch06.application;

import java.util.Random;

public class ValueAssigment {
	public static void main(String[] args) {

		Random rand = new Random();

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {

			int r = rand.nextInt();
			int number = r % 10;
			arr[i] = number;
			System.out.println(arr[i]);

		}
		
		

		String[] strArray = { "Apple", "Orange", "Mango" };
		double doubleArray[] = { 2.5, 9.0, 7, 9.7 };

		System.out.println(strArray);

		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		for (int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
		
		for(String str : strArray) {
			System.out.print(str);
		}
		
		
		Boolean booleanArray[] = {true, false};
		booleanArray[0] = false;
		System.out.print(booleanArray[0] + "\n" + booleanArray[1]);
		
		
//		derleme hatası alıyor  , 
//		int [] a ;
//		a = {2,8};
		
		int [] a = {2,8};
		
		System.out.println();
		System.out.println();
		System.out.println();
		int [] b = null ;
//		b null olarak belirttik, dizinin boyutunu belirtmeden atama yapılamaz, compile time hatası alınır.
//		dizi tanımlanırken atama yapılmalı-> boyutu belirlenmiş oluyor veya atama yapmadan önce dizinin boyutu belirtilmeli
		b = new int[3];
		b[0] = 1;
		b[1] = 2;
		
		
//	foreach de i yE atama yapılmaz, b nin 0'ıncı elemanı hala 1'dir
		for(int i : b) {
			i = 7;
			System.out.println(i);
			
		}
		
		System.out.println(b[0]);
		
		
		

	}
}
