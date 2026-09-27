package set;
import java.util.HashSet;


//Write a program to check whether one set is a subset of another set.
public class SubSetCheck {

	public static void main(String[] args) {
		HashSet<Integer> a = new HashSet<>();
		HashSet<Integer> b = new HashSet<>();
		
		System.out.print("a is subset of b "+a.containsAll(b));

	}

}
