package wildcardRealLife;

import java.util.ArrayList;
import java.util.List;

//A warehouse needs one method to read/display products from a collection containing 
//Product or subclasses, and another to add Product objects to a collection accepting 
//Product or superclasses. Use appropriate wildcards

class Product12 {
	String name;
	Product12(String name){
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class WarehouseProducts {
	public static void readProduct(List<? extends Product12> products) {
		for(Product12 p : products) {
			System.out.print( p + " ");
		}
	}
	
	public static void addProduct(List<? super Product12> products,Product12 p ) {
		products.add(p);
	}

	public static void main(String[] args) {
		List<Product12> list = new ArrayList<>();
		
		addProduct(list,new Product12("Laptop"));
		addProduct(list,new Product12("Mobile"));
		readProduct(list);
	}

}
