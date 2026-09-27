package set;
import java.util.HashSet;
//Write a program to find the intersection of two sets
public class SetIntersection {

	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<>(); 
		a.add(1);
		a.add(2);
		a.add(3);
		
        HashSet<Integer> b = new HashSet<>(); 
        b.add(3); 
        b.add(1);
        b.add(5);
        
        HashSet<Integer> intersection = new HashSet<>(a);
        
        intersection.retainAll(b);
        
        System.out.print("Intersection : "+intersection);
        

	}

}
