package list;

//Write a program to demonstrate the use of ListIterator to traverse an ArrayList in both forward and backward directions.
import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteraterProgram {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		ListIterator<Integer> it = list.listIterator();
		
		System.out.print("forward : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}		
		
		System.out.print("\nbackward : ");
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}	

	}

}
