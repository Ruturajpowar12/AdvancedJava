package listRealLife;

import java.util.LinkedList;

//A hospital maintains a queue of patients using LinkedList<String>.
//Add normal patients at the end, emergency patients at the beginning, remove attended patients, and display the queue.
public class HospitalPatientQueue {

	public static void main(String[] args) {
		
		
		LinkedList<String> queue = new LinkedList<>();
        queue.addLast("Patient A");
        queue.addLast("Patient B");
        queue.addFirst("Emergency Patient");
        System.out.println("Queue: " + queue);
        queue.removeFirst();
        System.out.println("After attending: " + queue);
		
		
	}

}
