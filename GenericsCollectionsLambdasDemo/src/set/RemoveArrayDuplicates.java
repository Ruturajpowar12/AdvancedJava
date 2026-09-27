package set;
import java.util.HashSet;

//Write a program to remove duplicate integers from an array using HashSet

public class RemoveArrayDuplicates {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,4,5,2,8,3};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int val : arr) {
			set.add(val);
		}
		
		System.out.print("Array is ");
		for(int val : arr ) {
			System.out.print(val+" ");
		}
		
		System.out.print("\nUnique hashset ");
		for(int val : set ) {
			System.out.print(val+" ");
		}
		

	}

}
