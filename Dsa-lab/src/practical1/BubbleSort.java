package practical1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(long[] list) {
        int size = list.length;

        for (int hold = 0; hold < size - 1; hold++) {
            boolean swapped = false;

            for (int walker = 0; walker < size - hold - 1; walker++) {
                if (list[walker] > list[walker + 1]) {
                    long temp = list[walker];
                    list[walker] = list[walker + 1];
                    list[walker + 1] = temp;
                    swapped = true;
                }
            }

            System.out.print("\nPass " + (hold + 1) + ": ");
            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + " ");
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("num.txt"));
            ArrayList<Long> numbers = new ArrayList<>();

            while (scanner.hasNextLong()) {
                numbers.add(scanner.nextLong());
            }
            scanner.close();

            long[] myArray = new long[numbers.size()];

            for (int i = 0; i < numbers.size(); i++) {
                myArray[i] = numbers.get(i);
            }

            System.out.print("Unsorted Array: ");
            for (long value : myArray) {
                System.out.print(value + " ");
            }

            bubbleSort(myArray);

            System.out.print("\n\nSorted list in ascending order: ");
            for (long value : myArray) {
                System.out.print(value + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: num.txt file not found!");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}