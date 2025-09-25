import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double c = converter.fahrenheitToCelsius(f);
        System.out.println(f + "°F = " + c + "°C");

        sc.close();
    }
}
