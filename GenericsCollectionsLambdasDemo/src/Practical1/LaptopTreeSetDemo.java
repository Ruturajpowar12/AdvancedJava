package Practical1;

import Practical1.Laptop;
import java.util.TreeSet;
import java.util.Comparator;

public class LaptopTreeSetDemo {
    public static void main(String[] args) {

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