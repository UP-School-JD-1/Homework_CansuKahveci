package org.javaturk.oofpch3.homework5;

public class Converter {

	Fahrenheit fahrenheit;
	Celsius celsius;
	Kelvin kelvin;

	public double convertFahrenheitToCelsius() {
		double ans = ((fahrenheit.convert()) * (Celsius.WATER_BOILING_POINT - Celsius.WATER_FREAZING_POINT))
				+ Celsius.WATER_FREAZING_POINT;
		System.out.print("convertFahrenheitToCelsius() metodu");
		return ans;
	}

	public double convertCelsiusToFahrenheit() {
		double ans = ((celsius.convert()) * (Fahrenheit.WATER_BOILING_POINT - Fahrenheit.WATER_FREAZING_POINT))
				+ Fahrenheit.WATER_FREAZING_POINT;
		System.out.print("convertCelsiusToFahrenheit() metodu");
		return ans;
	}

	public double convertCelsiusToKelvin() {
		double ans = ((celsius.convert()) * (Kelvin.WATER_BOILING_POINT - Kelvin.WATER_FREAZING_POINT))
				+ Kelvin.WATER_FREAZING_POINT;
		System.out.print("convertCelsiusToKelvin() metodu");
		return ans;
	}

	public double convertKelvinToCelsius() {
		double ans = ((kelvin.convert()) * (Celsius.WATER_BOILING_POINT - Celsius.WATER_FREAZING_POINT))
				+ Celsius.WATER_FREAZING_POINT;
		System.out.print("convertKelvinToCelsius() metodu");
		return ans;
	}

	public double convertKelvinToFahrenheit() {
		double ans = ((kelvin.convert()) * (Fahrenheit.WATER_BOILING_POINT - Fahrenheit.WATER_FREAZING_POINT))
				+ Fahrenheit.WATER_FREAZING_POINT;
		System.out.print("convertKelvinToFahrenheit() metodu");
		return ans;
	}

	public double convertFahrenheitToKelvin() {
		double ans = ((fahrenheit.convert()) * (Kelvin.WATER_BOILING_POINT - Kelvin.WATER_FREAZING_POINT))
				+ Kelvin.WATER_FREAZING_POINT;
		System.out.print("convertFahrenheitToKelvin() metodu");
		return ans;
	}

}
