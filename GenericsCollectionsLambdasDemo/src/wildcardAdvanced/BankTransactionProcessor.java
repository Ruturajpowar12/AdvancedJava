package wildcardAdvanced;

import java.util.Arrays;
import java.util.List;

//Create processTransactions(...) that can read transaction amounts from List<Integer>,
//List<Double>, and List<Float>. Use an appropriate wildcard and calculate the total.

public class BankTransactionProcessor {

	public static double processTransactions(List<? extends Number>list) {
		double total =0;
		for(Number val : list) {
			total += val.doubleValue()
					;
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println("total Integer : "+processTransactions(Arrays.asList(102,104,106)));
		System.out.println("Total (Double): " + processTransactions(Arrays.asList(100.5, 200.5)));
		 System.out.println("Total (Float): " + processTransactions(Arrays.asList(50.0f, 75.0f)));
		

	}

}
