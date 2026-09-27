package mapTreeMap;

import java.util.Map;
import java.util.TreeMap;

//Use TreeMap<Integer,String> for Priority to Patient Name and
//display patients according to priority

public class HospitalAppointmentPriority {

	public static void main(String[] args) {
		TreeMap<Integer,String> p = new TreeMap<>();
		
		p.put(1, "ram");
		p.put(4,"ganesh");
		p.put(3, "dev");
		p.put(5 ,"hanuman");
		
		for(Map.Entry<Integer,String> entry : p.entrySet()){
			System.out.println(entry.getKey()+" priority to patient "+entry.getValue());
		}
	}

}
