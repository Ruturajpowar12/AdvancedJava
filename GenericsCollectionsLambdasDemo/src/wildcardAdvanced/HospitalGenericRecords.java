package wildcardAdvanced;

import java.util.ArrayList;
import java.util.List;

//Create a generic MedicalRecord<T> class where T represents the record identifier.
//Create a method that accepts List<? extends MedicalRecord<?>> and displays all records

class MedicalRecord<T>{
	T id;
	 MedicalRecord(T id){
		 this.id= id;
	 }
	 
	 public String toString() {
		 return "Record Id :"+ id;
	 }
}
public class HospitalGenericRecords {
	
	public static void display(List<? extends MedicalRecord<?>>list) {
		for(MedicalRecord<?> val : list) {
			System.out.println(val);
		}
	}

	public static void main(String[] args) {
	
		List<MedicalRecord<Integer>> ids = new ArrayList<>();
		ids.add(new MedicalRecord<>(1));
		ids.add(new MedicalRecord<>(2));
		ids.add(new MedicalRecord<>(3));
		display(ids);

	}

}
