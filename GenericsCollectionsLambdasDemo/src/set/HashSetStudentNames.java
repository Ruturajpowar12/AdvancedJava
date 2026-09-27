package set;
import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to demonstrate the use of HashSet by storing student names


public class HashSetStudentNames {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.add("Ruturaj");
		set.add("Swarup");
		set.add("Ram");
		set.add("Sanskar");
		
		System.out.print("Students Name : ");
		for(String s : set ) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		Iterator<String> it = set.iterator();
		
		System.out.print("\nStudents Name : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}

}
