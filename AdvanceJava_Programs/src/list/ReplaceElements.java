package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Write a program to replace all occurrences of a particular element in an ArrayList.

public class ReplaceElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
        Integer[] vals = {1, 2, 3, 2, 4, 2};
        list.addAll(Arrays.asList(vals));
        System.out.print("List : ");
        for(int val : list) {
        	System.out.print(val+" ");
        }
        
        Collections.replaceAll(list,2,99);
        System.out.print("\nAfterList : ");
        for(int val : list) {
        	System.out.print(val+" ");
        }

	}

}
