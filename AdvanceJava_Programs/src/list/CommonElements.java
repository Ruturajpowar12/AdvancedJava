package list;

import java.util.ArrayList;

//Write a program to find common elements between two ArrayList objects.

public class CommonElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);  l1.add(2);
		l1.add(3);  l1.add(4);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(5);  l2.add(1);
		l2.add(3);  l2.add(8);
		
		System.out.print("list 1 : ");
		for(int val : l1) System.out.print(val+" ");
		
		System.out.print("\nlist 2 : ");
		for(int val : l2) System.out.print(val+" ");
		
		System.out.print("\n\nCommon Elemnts : ");
		ArrayList<Integer> common = new ArrayList<>(l1);
        common.retainAll(l2);
        for(int val : common) System.out.print(val+" ");
//		for(int val : l1) {
//			if(l2.contains(val)) {
//				System.out.print(val+" ");
//			}
//		}
		

	}

}
