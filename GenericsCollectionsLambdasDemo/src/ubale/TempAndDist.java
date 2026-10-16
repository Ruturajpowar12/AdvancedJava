package ubale;


import java.util.Scanner;

interface Conversion {
    double convert(double value);
}

public class TempAndDist {
    public static void main(String[] args) {
    	System.out.println("Macchindranath Ubale");
		System.out.println("21");
        Scanner sc = new Scanner(System.in);

        // Lambda expression: Fahrenheit to Celsius
        Conversion fahrenheitToCelsius =
                (f) -> (f - 32) * 5 / 9;

        // Lambda expression: Kilometers to Miles
        Conversion kilometersToMiles =
                (km) -> km * 0.621371;

        

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        System.out.println("Temperature in Celsius: "
                + fahrenheitToCelsius.convert(fahrenheit));

        System.out.print("Enter distance in Kilometers: ");
        double kilometers = sc.nextDouble();

        System.out.println("Distance in Miles: "
                + kilometersToMiles.convert(kilometers));

        sc.close();
    }
}

