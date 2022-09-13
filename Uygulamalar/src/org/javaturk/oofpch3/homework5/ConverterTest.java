package org.javaturk.oofpch3.homework5;

import java.util.Scanner;

public class ConverterTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		option();
		int number = scanner.nextInt();

		System.out.println("Please enter temperature");
		double temperature = scanner.nextDouble();

		Converter converter = new Converter();
		Fahrenheit fahrenheit = new Fahrenheit(temperature);
		Celsius celsius = new Celsius(temperature);
		Kelvin kelvin = new Kelvin(temperature);
		converter.fahrenheit = fahrenheit;
		converter.celsius = celsius;
		converter.kelvin = kelvin;

		switch (number) {
		case 1:
			System.out.print("Convert Celsius to Fahrenheit : ");
			converter.convertCelsiusToFahrenheit();
			break;

		case 2:
			System.out.print("Convert Celsius to Kelvin : ");
			converter.convertCelsiusToKelvin();
			break;

		case 3:
			System.out.print("Convert Kelvin to Celsius : ");
			converter.convertKelvinToCelsius();
			break;

		case 4:
			System.out.print("Convert Kelvin to Fahrenheit : ");
			converter.convertKelvinToFahrenheit();
			break;
		case 5:
			System.out.print("Convert Fahrenheit Kelvin to : ");
			converter.convertKelvinToFahrenheit();
			break;
		default:
			System.out.print("Please enter the avaible value");
		}
		
		option();
	

	}

	public static void option() {
		System.out.println("Please choose which converting do you want to use ");
		System.out.println("FahrenheitToCelsius" + "\n1- CelsiusToFahrenheit" + "\n2- CelsiusToKelvin"
				+ "\n3- KelvinToCelsius" + "\n4- KelvinToFahrenheit" + "\n5- FahrenheitToKelvin");
	}
}
