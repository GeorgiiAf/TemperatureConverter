import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    TemperatureConverter converter = new TemperatureConverter();


    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0, converter.fahrenheitToCelsius(32));
        assertEquals(100, converter.fahrenheitToCelsius(212));
        assertEquals(-40, converter.fahrenheitToCelsius(-40));
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(212, converter.celsiusToFahrenheit(100));
        assertEquals(-40, converter.celsiusToFahrenheit(-40));
    }

    @Test
    void testIsExtremeTemperature() {
        assertTrue(converter.isExtremeTemperature(-80));
        assertTrue(converter.isExtremeTemperature(60));
        assertFalse(converter.isExtremeTemperature(34));
    }


    @Test
    void testKelvinToCelsius() {
        assertEquals(0, converter.kelvinToCelsius(273.15), 0.01);
        assertEquals(26.85, converter.kelvinToCelsius(300), 0.01);
        assertEquals(-273.15, converter.kelvinToCelsius(0), 0.01);
    }

}
