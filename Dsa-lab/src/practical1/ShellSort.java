package practical1;

import java.util.Scanner;

public class ShellSort {

    public static void shellSort(int[] arr, int n) {
        int pass = 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;

                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }

            System.out.print("\nGap = " + gap);
            System.out.print("\nPass " + pass + ": ");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            pass++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("\nUnsorted Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        shellSort(array, n);

        System.out.print("\n\nSorted list in ascending order: ");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
