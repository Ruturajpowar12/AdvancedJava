package listRealLife;

import java.util.ArrayList;

//An online shopping application maintains products in an ArrayList<String>.
//Implement add, remove, search, display, and clear operations.

public class ShoppingCart {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mobile");
		list.add("laptop");
		list.add("tab");
		list.add("cyle");
		
		System.out.println("Products are : "+list);
		
		list.remove(2);
		list.remove(1);
		
		System.out.println("after revmoveing Products are : "+list);
		
		System.out.println("products of 1st index : "+list.get(1));
		
		System.out.println("Total Products : "+list.size());
		
		list.clear();
		

	}

}
