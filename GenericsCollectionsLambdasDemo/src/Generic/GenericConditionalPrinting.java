package Generic;
import java.util.function.Predicate;
//Write a generic method to print only those elements of an array 
//that satisfy a given condition, such as numbers greater than 50

public class GenericConditionalPrinting {
	
	public static <T> void printCondition(T[] arr, Predicate<T> condition) {
		for(T element : arr) {
			if(condition.test(element)) {
				System.out.print(element+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		Integer[] arr = {10,55,30,32,56,89,23};
		
		printCondition(arr,n -> n>50);

	}

}
