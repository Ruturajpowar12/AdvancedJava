package list;
import java.util.ArrayList;
//Write a Java program to create an ArrayList<Integer> 
//and perform insertion, deletion, searching, and traversal operations

public class ArrayListBasicOperations {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		//insert values in ArrayList.
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(0,50);
		
		System.out.println(list);
		
		//set value in ArrayList
		list.set(4, 80);
		System.out.println(list);
		
		//delete value from ArrayList
		list.remove(2);
		System.out.println(list);
		
		//get value form ArrayList
		int value = list.get(2);
		System.out.println(value);
		
		//searching value 
		System.out.println(list.contains(30)); //true 
		
		//print values form arrayList || Traversal ArrayList
		for(int val :list) {
			System.out.print(val+" ");
		}
		
		
		
	}

}
