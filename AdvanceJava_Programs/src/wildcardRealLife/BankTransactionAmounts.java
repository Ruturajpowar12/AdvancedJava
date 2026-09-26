package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//A banking application stores transaction amounts using Integer, Float, and Double. 
//Write a method using List<? extends Number> to find the maximum transaction amount.

public class BankTransactionAmounts {
	   public static void maxAmount(List<? extends Number> list) {
	      
		   double max = Double.MIN_VALUE;
		   
		   for(Number val : list) {
			   if(val.doubleValue() > max) {
				   max = val.doubleValue();			   }
		   }
		   System.out.println("Maximum Amount is : "+ max );
	    }

	public static void main(String[] args) {
		
		Number[] amounts = {10000,40000.23,54399.12,20000,9000};
		
		List<Number> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(amounts));
		
		maxAmount(list);
		

	}

}
