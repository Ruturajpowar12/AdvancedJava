package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//An online shopping application stores product prices as Integer, Double, or 
//other subclasses of Number. Write a method using List<? extends Number> 
//to calculate the total price of products


public class OnlineShoppingPrices {
	
	public static void calculateTotal(List<? extends Number> prices) {
		double total = 0;
		for(Number o : prices) {
			total += o.doubleValue();
		}
	 System.out.println("Total price of products : "+total);
	}

	public static void main(String[] args) {
	
		List<Number> price = new ArrayList<>();
		price.addAll(Arrays.asList(120,130.2,190,341,221.4));
		
		calculateTotal(price);

	}

}
