package setRealLife;

import java.util.LinkedHashSet;

//A college event needs unique student registrations
//while maintaining registration order. Use LinkedHashSet<String>

public class EventRegistration {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		set.add("Ruturaj");
		set.add("Ram");
		set.add("sham");
		set.add("Raman");
		set.add("Rohit");
		
		System.out.println("Students : "+set);
		

	}

}
