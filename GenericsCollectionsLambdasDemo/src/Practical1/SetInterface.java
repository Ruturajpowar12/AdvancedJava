package Practical1;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		
		//Add items to the set.
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		System.out.println("Set 1 : "+ set);
		
		//Insert items of one set into the other set.
		Set<Integer> newSet = new HashSet<>();
		newSet.addAll(set);
		System.out.println("NewSet : "+ newSet);
		
		//Remove items from the set.
		set.remove(10);
		set.remove(50);
		set.remove(30);
		System.out.println(set);
		
		//Search for the specified item in the set.
		if (set.contains(20))
            System.out.println("20 is present");
        else
            System.out.println("20 is not present");

	}

}
