package Generic;
//Create a generic class Pair<T,U> and write a method to exchange the values of two pairs.

public class GenericPairValues <T,U> {
	
	T value1;
	U value2;
	
	GenericPairValues(T value1,U value2){
		this.value1 = value1;
		this.value2 = value2;
	}
	
	public String toString() {
		return "(" + value1 + ", " + value2 + ")";
	}
	
	public static  <T,U> void exchange(GenericPairValues <T,U> p1,GenericPairValues <T,U> p2) {
        T tempT = p1.value1;
        p1.value1 = p2.value1;
        p2.value1 = tempT;
        
        U tempU = p1.value2;
        p1.value2 = p2.value2; 
        p2.value2 = tempU;
    }


	public static void main(String[] args) {
		GenericPairValues<Integer, String> p1 = new  GenericPairValues<>(1, "A");
		 GenericPairValues<Integer, String> p2 = new  GenericPairValues<>(2, "B");
        System.out.println("Before: " + p1 + " " + p2);
        exchange(p1, p2);
        System.out.println("After: " + p1 + " " + p2);
	}

}
