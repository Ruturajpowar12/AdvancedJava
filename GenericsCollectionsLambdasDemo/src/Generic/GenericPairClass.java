package Generic;

//Write a generic class Pair<K,V> that stores a key and a value.
//Create objects using Integer-String and String-Double combinations

class Pair <K,V>{
	K mobileCompany;
	V price;
	
	Pair(K mobileCompany, V price ){
		this.mobileCompany = mobileCompany;
		this.price = price;
	}
	
	K printCompany() {
		return mobileCompany;
	}
	
	V printPrice() {
		return price;
	}
	
}

public class GenericPairClass {

	public static void main(String[] args) {
		
		//Integer-String
		Pair<String,Integer> p1=new Pair<>("Samsung",30000);
		System.out.println("Integer-String ");
		System.out.println("Mobile Company : "+p1.printCompany());
		System.out.println("Mobile Price : "+p1.printPrice());
		
		//Double-String
		Pair<String,Double> p2=new Pair<>("Samsung",25000.00);
		System.out.println("\nDouble-String ");
		System.out.println("Mobile Company : "+p2.printCompany());
		System.out.println("Mobile Price : "+p2.printPrice());


	}

}
