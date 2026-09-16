package Generic;

//Create a generic class Calculator<T extends Number> that calculates the square of a numeric value

class Calculator<T extends Number>{
	
	T value;
	
	Calculator(T value){
		this.value = value;
	}
	
	Double getSquare() {
		return value.doubleValue() * value.doubleValue();	
		}
}

public class BoundedGenericCalculator {

	public static void main(String[] args) {
		
		Calculator<Integer> c1 = new Calculator<>(5);
		System.out.println("Square is "+c1.getSquare());
		
		Calculator<Double> c2 = new Calculator<>(2.5);
		System.out.println("Square is "+c2.getSquare());

	}

}
