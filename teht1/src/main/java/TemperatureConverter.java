import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TemperatureConverter {

	public static void Main (String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a language");
		int lang = sc.nextInt();
		Locale locale = new Locale("en", "US");
		switch(lang){
			case 1:
				locale = new Locale("fi", "FI");
				break;
			case 2:
				locale = new Locale("en", "US");
				break;
			case 3:
				locale = new Locale("se", "SE");
				break;
			case 4:
				locale = new Locale("jp", "JP");
				break;
		}

		ResourceBundle rb = ResourceBundle.getBundle("Message_bundle", locale);
		
	}
	
	public double  fahrenheitToCelsius (double f) { return (f - 32) * 5.0/9.0;    }
	public double  celsiusToFahrenheit (double c) { return (c * 9.0/5.0) + 32;    }
	public boolean isExtremeTemperature(double c) { return c < -40 || c > 50; 	  }
	public double  kelvinToCelsius	   (double k) { return k - 273.15; 			  }
}

