package wildcardRealLife;

import java.util.Arrays;
import java.util.List;

//A food delivery application stores order prices in List<Double>. 
//Write a method using List<? extends Number> to calculate total,
//average, and highest order value. It should also work with List<Integer>

public class FoodDeliveryOrderPrices {
	
	public static void calculate(List<? extends Number> prices){
		double total = 0;
		double max = Double.MIN_VALUE;
		
		for(Number val : prices) {
			total += val.doubleValue();
			
			if(val.doubleValue()>max) {
				max = val.doubleValue();
			}
		}
		System.out.println("Total is "+total);
		System.out.println("Average is "+ total/prices.size());
		System.out.println("Highest value is "+ max);
	}

	public static void main(String[] args) {
		
		List<Double> list = Arrays.asList(200.34,100.00,120.30);
		calculate(list);
	}

}
