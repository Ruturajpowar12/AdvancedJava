package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//A banking application stores transaction amounts using Integer, Float, and Double. 
//Write a method using List<? extends Number> to find the maximum transaction amount.

public class BankTransactionAmounts {
	   public static void maxAmount(List<? extends Number> list) {
	        if (list == null || list.isEmpty()) {
	        	return;
	        }

	        
	        Number max = Collections.max(list, (n1, n2) -> Double.compare(n1.doubleValue(), n2.doubleValue()));

	        System.out.println("Maximum Transaction Amount: " + max);
	    }

	public static void main(String[] args) {
		
		Number[] amounts = {10000,40000.23,54399.12,20000,9000};
		
		List<Number> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(amounts));
		
		maxAmount(list);
		

	}

}
