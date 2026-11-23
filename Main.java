package ihablab3;

import java.util.Scanner;

/** Console demonstration of the recursion and search methods. */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UML lab = new UML();

        System.out.println("GCD(3, 6): " + lab.GCD(3, 6));
        System.out.println("4!: " + lab.factorial(4));
        System.out.println("Fibonacci(6): " + lab.fibonacci(6));
        System.out.println("2.5 ^ 6: " + lab.power(2.5, 6));
        System.out.println("Sum of digits of 123: " + lab.sumofdigits(123));

        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Array size cannot be negative.");
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int x = input.nextInt();

        System.out.println("Linear search:");
        lab.recursivelinearsearch(arr, 0, x);

        if (lab.issorted(arr, n)) {
            System.out.println("Binary search:");
            lab.BinarySearch(arr, 0, n - 1, x);
        } else {
            System.out.println("Binary search skipped (array is not sorted).");
        }
        System.out.println("Array sum: " + lab.arraysum(arr, n));
    }
}
