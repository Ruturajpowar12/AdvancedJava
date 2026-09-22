package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//Write a program to demonstrate the difference between HashSet, LinkedHashSet, and TreeSet.
public class CompareSetImplementations {

	public static void main(String[] args) {
		
		String[] names = {"Ruturaj","Swarup","Sanskar","Piyush"};
		
		HashSet<String> hashset = new HashSet<>();
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		TreeSet<String> treeset = new TreeSet<>();
		
		for(String val : names) {
			hashset.add(val);
			lhset.add(val);
			treeset.add(val);
		}
		
		System.out.print("HashSet (order no perfect) : "+hashset);
		System.out.print("\nLinkedHashSet (order is perfect) : "+lhset);
		System.out.print("\nTreeSet (order no perfect) : "+treeset);
		

	}

}
