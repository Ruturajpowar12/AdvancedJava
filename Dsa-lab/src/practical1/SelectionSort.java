package practical1;

import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(long[] list, int size) {
        long temp;
        int pos;

        for (int hold = 0; hold < size - 1; hold++) {
            pos = hold;

            for (int walker = hold + 1; walker < size; walker++) {
                if (list[walker] < list[pos]) {
                    pos = walker;
                }
            }

            if (hold != pos) {
                temp = list[pos];
                list[pos] = list[hold];
                list[hold] = temp;
            }

            System.out.print("\nPass " + (hold + 1) + ": ");

            for (int i = 0; i < size; i++) {
                System.out.print(list[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        long[] array = new long[n];

        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }

        System.out.print("\nUnsorted Array: ");
        for (long value : array) {
            System.out.print(value + " ");
        }

        selectionSort(array, n);

        System.out.print("\n\nSorted list in ascending order: ");
        for (long value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
