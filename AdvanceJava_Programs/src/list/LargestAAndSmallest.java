package list;
import java.util.ArrayList;

//Write a program to find the largest and smallest elements in an ArrayList<Integer>.

public class LargestAAndSmallest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(70);
		list.add(30);
		list.add(100);
		list.add(45);
		System.out.println(list);
		
		int Largest = list.get(0);
		int Smallest = list.get(0);
		
		for(int val : list) {
			if(val > Largest) {
				Largest = val;
			}
		}
		
		for(int val : list) {
			if(val < Smallest) {
				Smallest = val;
			}
		}
		
		System.out.println("Largest value :" + Largest);
		System.out.println("Smallest value :" + Smallest);
		
		
		
		
		
		

	}

}
