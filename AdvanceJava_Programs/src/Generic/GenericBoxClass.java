package Generic;

//Generic Classes & Methods Generic Box Class Write a Java program to create a generic class Box<T> that can store a single value of any data type. 
//Demonstrate it using Integer, String, and Double.

class Box<T>{
	T t;
	
	//value set by constructor
	Box(T t){
		this.t = t;
	}

	//value set by setter function
//	T setValue(T t) {
//		this.t = t;
//	}
	
	T printValue() {
		return t;
	}
	
	
}
public class GenericBoxClass {

	public static void main(String[] args) {
		
		Box<Integer> b1= new Box<>(10);
		Box<String> b2= new Box<>("Ruturaj");
		Box<Double> b3= new Box<>(20.34);
		
		System.out.println("Integer value "+b1.printValue());
		System.out.println("String value "+b2.printValue());
		System.out.println("Double value "+b3.printValue());
	}

}
