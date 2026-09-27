package wildcardRealLife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//A hospital stores patient IDs in List<Integer> and another system uses List<Number>.
//Write a generic copy method using ? extends T for the source and ? super T for the destination.

public class HospitalPatientIDTransfer {
	
	public static <T> void copy(List<? extends T> source , List<? super T>dest) {
		
		for(T val : source) {
			dest.add(val);
		}
	}

	public static void main(String[] args) {
	
		List<String> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList("Ruturaj","swarup","sanskar"));
		System.out.println("original list : "+list1);
		
		List<String> dest = new ArrayList<>();
		copy(list1,dest);
		System.out.println("copy list : "+dest);
	}

}
