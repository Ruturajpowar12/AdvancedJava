package setRealLife;

import java.util.HashSet;

//A website records visitor IDs. Use HashSet<Integer> to store unique visitor 
//IDs and display unique count and whether a particular visitor visited.

public class UniqueVisitorTracking {

	public static void main(String[] args) {
		HashSet<Integer> ids = new HashSet<>();
		 int[] visits = {101, 102, 101, 103, 102, 104};
		 
		 for(int i : visits) {
			 ids.add(i);
		 }
		 System.out.println("Display Unique visitors : "+ids);
		 System.out.println("Display visitors count : "+ids.size());
		 System.out.println("Display 103 is contains :"+ids.contains(103));
		 

	}

}
