package listRealLife;

import java.util.ArrayList;
import java.util.Collections;

//Create a shopping cart using ArrayList<Double>. Store product prices and calculate total, highest, lowest, and average price.

public class ShoppingCartwithPrices {

	public static void main(String[] args) {
		
		ArrayList<Double> list = new ArrayList<>(); 
		
		list.add(100.23);
		list.add(600.60);
		list.add(300.00);
		list.add(200.20);
		list.add(100.4);
		
		System.out.println("prices : "+list);
		
		double total =0;
		for(double val : list) {
			
			total+=val;
		}
		System.out.println("Total : "+total);
		
		System.out.println("Highest : "+ Collections.max(list));
		System.out.println("Lowest : "+ Collections.min(list));
		
		System.out.println("Average : "+ total/list.size());

	}

}
