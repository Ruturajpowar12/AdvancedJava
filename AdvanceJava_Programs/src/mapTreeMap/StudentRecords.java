package mapTreeMap;

import java.util.TreeMap;

//Use TreeMap<Integer,String> for Registration Number to Student Name.
//Maintain ascending registration order and display first and last registration numbers.
public class StudentRecords {

	public static void main(String[] args) {
		TreeMap<Integer,String> data = new TreeMap<Integer,String>();
		 data.put(101, "Ruturaj");
		 data.put(102,"Swarup");
		 data.put(103,"Sanskar");
		 data.put(104,"Piyush");
		 
		 System.out.println("first Registration : "+data.firstKey());
		 System.out.println("Last Registration : "+data.lastKey());
		 
	}

}
