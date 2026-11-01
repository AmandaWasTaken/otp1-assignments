package app;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TemperatureConverter {	
	
	public static double fahrenheitToCelsius (double f) { 
		return (f - 32) * 5.0/9.0;
	}
	public static double celsiusToFahrenheit (double c) { 
		return (c * 9.0/5.0) + 32;    
	}
	public static boolean isExtremeTemperature(double c) {
		return c < -40 || c > 50;
	}
	public static double  kelvinToCelsius (double k) {
		return k - 273.15; 
	}
}

