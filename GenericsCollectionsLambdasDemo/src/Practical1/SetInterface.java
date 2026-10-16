package Practical1;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

    public static void main(String[] args) {
        System.out.println("Ruturaj Powar");
        System.out.println("37");

        // 1. Add items to the set
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Set 1: " + set);

        // 2. Insert items of one set into another set
        Set<Integer> newSet = new HashSet<>();

        newSet.addAll(set);

        System.out.println("New Set: " + newSet);

        // 3. Remove items from the set
        set.remove(10);
        set.remove(50);
        set.remove(30);

        System.out.println("After removing items: " + set);

        // 4. Search for a specified item in the set
        if (set.contains(20)) {
            System.out.println("20 is present");
        } else {
            System.out.println("20 is not present");
        }
    }
}