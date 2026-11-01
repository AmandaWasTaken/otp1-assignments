package app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
	
	private final TemperatureConverter tc = new TemperatureConverter();

	@Test
	void fToC_converts_correctly(){
		assertEquals(0.0, tc.fahrenheitToCelsius(32.0), 0.0001);
		assertEquals(100.0, tc.fahrenheitToCelsius(212.0), 0.0001);
		assertEquals(-40.0, tc.fahrenheitToCelsius(-40.0), 0.0001);
	}

	@Test
	void cToF_converts_correctly(){
		assertEquals(32.0, tc.celsiusToFahrenheit(0.0), 0.0001);
		assertEquals(212.0, tc.celsiusToFahrenheit(100.0), 0.0001);
		assertEquals(-40, tc.celsiusToFahrenheit(-40.0), 0.0001);
	}

	@Test
	void isExtremeTemperature_returnsTrue(){
		assertTrue(tc.isExtremeTemperature(-41.0));
		assertTrue(tc.isExtremeTemperature(51.0));
		assertTrue(tc.isExtremeTemperature(100.0));
	}

	@Test
	void isExtremeTemperature_returnsFalse(){
		assertFalse(tc.isExtremeTemperature(-40.0));
		assertFalse(tc.isExtremeTemperature(0.0));
		assertFalse(tc.isExtremeTemperature(50.0));
	}

	@Test
	void cToK_converts_correctly(){
		assertEquals(-273.15, tc.kelvinToCelsius(0.0), 0.0001);
		assertEquals(26.85, tc.kelvinToCelsius(300), 0.0001);
	}
} 




