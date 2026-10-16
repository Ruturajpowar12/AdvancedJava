package practical_1;

import java.util.HashSet;
import java.util.Iterator;

public class GenericHashSet {
    public static void main(String[] args) {

        System.out.println("Shreya Patil");
        System.out.println("54");

        // Create a generic HashSet of Car objects
        HashSet<Car<String>> cars = new HashSet<>();

        // Add Car objects
        cars.add(new Car<>("Swift", "Maruti Suzuki", 700000, 1197));
        cars.add(new Car<>("Thar", "Mahindra", 1500000, 2184));
        cars.add(new Car<>("Nexon", "Tata", 900000, 1199));

        // Display all cars
        System.out.println("\nAll Cars:");
        for (Car<String> c : cars) {
            c.display();
            System.out.println();
        }

        // Display the size
        System.out.println("Total Cars: " + cars.size());

        // Search for a car
        boolean found = false;
        for (Car<String> c : cars) {
            if (c.model.equals("Thar")) {
                found = true;
                break;
            }
        }
        System.out.println("Thar exists: " + found);

        // Remove a car using its reference
        Car<String> c1 = new Car<>(
            "Swift", "Maruti Suzuki", 700000, 1197
        );

        // Remove by matching object reference/equality
        // HashSet uses equals() and hashCode() for matching
        System.out.println("Cars before removal: " + cars.size());

        // Clear all cars
        cars.clear();
        System.out.println("Cars after clear(): " + cars.size());
    }
}