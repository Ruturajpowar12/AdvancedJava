package wildcardRealLife;

import java.util.*;;

//An e-commerce application has a method that receives a list of products 
//and only needs to display them. The list may contain Book, Mobile, Laptop, or 
//other product objects. Use List<?>.


class Product { 
	String name; 
	Product(String name){
		this.name = name; 
		} 
	public String toString(){
		return name; 
		}
	}

public class ECommerceProductCatalog {
	    public static void displayProducts(List<?> products) {
	        for (Object p : products) {
	        	System.out.println(p);
	        }
	    }

	    public static void main(String[] args) {
	        List<Product> products = Arrays.asList(new Product("Book"), new Product("Mobile"));
	        displayProducts(products);
	    }
	}