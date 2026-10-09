package lambda;

import java.util.Scanner;
import java.util.function.Predicate;

// takes input and check condition 

public class PredicateInterface {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number :");
		
		int num = sc.nextInt();
		
		Predicate<Integer> p = (a) -> a % 2 ==0;
		
		if(p.test(num)) {
			System.out.println(num+" is even " );
		}else {
			System.out.println(num+" is odd " );
		}
		sc.close();

	}

}
