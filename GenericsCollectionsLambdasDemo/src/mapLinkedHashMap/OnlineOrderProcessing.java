package mapLinkedHashMap;

import java.util.LinkedHashMap;

//An online shopping system stores Order ID to Customer Name using LinkedHashMap.
//Display orders in the same order they were placed and explain why LinkedHashMap is suitable

public class OnlineOrderProcessing {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> data = new LinkedHashMap<>();
		data.put(101, "Rohit");
		data.put(102, "Sanskar");
		data.put(106, "Ruturaj");
		data.put(104, "Piyush");
		
		//LinkedHashMap is suitable because it preserves insertion order, unlike HashMap.
		System.out.print("Customers are : "+data);
		
		
	}

}
