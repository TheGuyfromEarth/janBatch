package oneDimArrays;

import java.util.Scanner;

public class ArrayInsertAtEnd {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int element = scanner.nextInt();


            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }

            // Create a new array with size N+1
            int[] modifiedArr = new int[N + 1];

            // Copy elements from the original array to the new array
            for (int i = 0; i < N; i++) {
                modifiedArr[i] = arr[i];
            }

            // Insert the element at the end of the new array
            modifiedArr[N] = element;


            for (int i = 0; i < N + 1; i++) {
                System.out.print(modifiedArr[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
