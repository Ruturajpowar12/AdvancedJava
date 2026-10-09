package lambda;

import java.util.Scanner;
import java.util.function.Function;

//takes input and return value

public class FunctionInterface {

	public static void main(String[] args) {
		
		Function<Integer,Integer> square = (n) -> n * n;
		Function<Integer,Integer> cube = (n) -> n * n * n;
		Function<Integer,String> checkevenodd = (n) -> {
			String str = null;
			if(n % 2 == 0 ) {
				str = n+" is even number";
			}else {
				str = n +" is odd number";
			}
			return str;
		};
        Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number :");
		int num = sc.nextInt();
		
		System.out.println("Square of "+num+" is "+square.apply(num));
		
		System.out.println("Cube of "+num+" is "+cube.apply(num));
		
		System.out.println("Check number "+num+" is "+checkevenodd.apply(num));
	}

}
