package wildCards;

import java.util.ArrayList;
import java.util.List;

//Write a program demonstrating the difference between <? extends Number> and <? super Integer>.

public class ExtendsvsSuper {
	
	public static double sum(List<? extends Number> list) {
        double total = 0;
        for (Number n : list) total += n.doubleValue();
        return total;
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> readList = new ArrayList<>();
        readList.add(5);
        readList.add(15);
        System.out.println("Sum : " + sum(readList));

        List<Number> writeList = new ArrayList<>();
        addIntegers(writeList); 
        System.out.println("List : " + writeList);
    }

}
