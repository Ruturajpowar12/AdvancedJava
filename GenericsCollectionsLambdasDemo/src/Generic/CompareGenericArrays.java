package Generic;
import java.util.Arrays;
//Write a generic method that accepts two arrays of the same type and checks whether they are equal.


public class CompareGenericArrays {
	public static <T> boolean areEquals(T[] a,T[] b) {
		return Arrays.equals(a, b);
	}

	
	    public static void main(String[] args) {
	    	
	    	Integer[] a1 = {1 ,2 ,3};
	    	Integer[] a2 = {4 ,2 ,3};
	    	Integer[] a3 = {1 ,2 ,3};
	    	
	    	System.out.println("a1 eaquls a2 :"+areEquals(a1,a2));
	    	System.out.println("a1 eaquls a3 :"+areEquals(a1,a3));
	    
	    }

}
