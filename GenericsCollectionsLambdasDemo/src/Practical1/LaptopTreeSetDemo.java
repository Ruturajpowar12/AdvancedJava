package Practical1;

import java.util.Comparator;
import java.util.TreeSet;

public class LaptopTreeSetDemo {
    public static void main(String[] args) {
        System.out.println("Ruturaj Powar");
        System.out.println("37");

        TreeSet<Laptop<String>> ts = new TreeSet<>(
            Comparator.comparingDouble(l -> l.price)
        );

        ts.add(new Laptop<>("Inspiron 15", "Dell", 55000, 15.6));
        ts.add(new Laptop<>("ThinkPad E14", "Lenovo", 65000, 14.0));
        ts.add(new Laptop<>("Pavilion", "HP", 48000, 15.6));
        ts.add(new Laptop<>("MacBook Air", "Apple", 95000, 13.6));

        System.out.println("All laptops sorted by price:");
        for (Laptop<String> l : ts) {
            l.display(); 
        }

        System.out.println("\nTotal laptops: " + ts.size());

        ts.removeIf(l -> l.price == 48000);
        System.out.println("\nAfter removing HP laptop:");
        for (Laptop<String> l : ts) {
            l.display();
        }
        
        System.out.println("\nIs TreeSet empty? " + ts.isEmpty());
    }
}