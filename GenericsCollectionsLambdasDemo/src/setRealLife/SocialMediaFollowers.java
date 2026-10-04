package setRealLife;

import java.util.HashSet;

//Two users have sets of followers. Use HashSet<Integer> to find common followers, 
//unique followers of each, and total unique followers.

public class SocialMediaFollowers {

	public static void main(String[] args) {
		
		HashSet<Integer> user1 = new HashSet<Integer>();
		HashSet<Integer> user2 = new HashSet<Integer>();
		
		user1.add(102);
		user1.add(123);
		user1.add(173);
		
		user2.add(232);
		user2.add(123);
		user2.add(353);
		
		HashSet<Integer> common = new HashSet<>(user1);
		common.retainAll(user2);
		System.out.println("common followers : "+common);
		
		HashSet<Integer> unique = new HashSet<>(user1);
		unique.removeAll(user2);
		System.out.println("Unique followers : "+ unique);
		System.out.println(" Total Unique followers : "+ unique.size());
		
	
		
		
	}

}
