package setRealLife;

import java.util.ArrayList;
import java.util.HashSet;

//A company receives registrations containing duplicate email addresses.
//Use HashSet<String> to store unique addresses and compare original registrations with unique users.

public class UniqueEmailAddresses {

	public static void main(String[] args) {
		ArrayList<String> registrations = new ArrayList<>();
        registrations.add("a@mail.com"); 
        registrations.add("b@mail.com"); 
        registrations.add("a@mail.com");
        HashSet<String> uniqueUsers = new HashSet<>(registrations);
        System.out.println("Total registrations: " + registrations.size());
        System.out.println("Unique users: " + uniqueUsers.size());
        System.out.println("Unique addresses: " + uniqueUsers);

	}

}
