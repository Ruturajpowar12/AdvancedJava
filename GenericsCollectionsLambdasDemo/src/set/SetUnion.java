package set;
import java.util.HashSet;
//Write a program to find the union of two sets
public class SetUnion {

	public static void main(String[] args) {
		
		HashSet<Integer> a = new HashSet<>(); 
		a.add(1);
		a.add(2);
		a.add(3);
		
        HashSet<Integer> b = new HashSet<>(); 
        b.add(3); 
        b.add(4);
        b.add(5);
        
        HashSet<Integer> union = new HashSet<>(a); 
        union.addAll(b);
        
        System.out.print("Union : "+union);
		
	}

}
