package wildCards;

import java.util.ArrayList;
import java.util.List;

//Write a generic method using wildcards to copy elements from one list to another.

public class CopywithWildcards {

	public static <T> void copy(List<? extends T> source, List<? super T> dest) {
        for (T item : source) dest.add(item);
    }

    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        source.add(1);
        source.add(2); 
        source.add(3);
        List<Number> dest = new ArrayList<>();
        copy(source, dest);
        System.out.println("Destination: " + dest);
    }

	

}
