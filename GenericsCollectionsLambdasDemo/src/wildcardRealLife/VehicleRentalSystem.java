package wildcardRealLife;

import java.util.Arrays;
import java.util.List;

//Given Vehicle with subclasses Car, Bike, and Truck, 
//write a method using List<? extends Vehicle> that displays details of any list containing these vehicle types.
class Vehicle{
	String name;
	Vehicle(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}
class Car extends Vehicle{

	Car(String name) {
		super(name);
	}
	
}
class Bike extends Vehicle{

	Bike(String name) {
		super(name);
	}
	
}
public class VehicleRentalSystem {
	
	public static void displaydetails(List<? extends Vehicle> list) {
		for(Vehicle val : list) {
			System.out.print(val+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	 List<Car> car =  Arrays.asList(new Car("BMW"),new Car("Audi"));
	 List<Bike> bike = Arrays.asList(new Bike("hero"),new Bike("Royal"));
	 
	 displaydetails(car);
	 displaydetails(bike);

	}

}
