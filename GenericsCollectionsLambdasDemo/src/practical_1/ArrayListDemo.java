package practical_1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("Shreya Patil");
        System.out.println("54");

        // 1. Create an ArrayList and add elements
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("JavaScript");

        System.out.println("\nOriginal ArrayList: " + list);

        // 2. Access elements using index
        System.out.println("\nAccess using index:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Access elements using Iterator
        System.out.println("\nAccess using Iterator:");
        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // 3. Modify an element
        list.set(1, "HTML");
        System.out.println("\nAfter modification: " + list);

        // 4. Remove an element
        list.remove("C++");
        System.out.println("After removal: " + list);
    }
}