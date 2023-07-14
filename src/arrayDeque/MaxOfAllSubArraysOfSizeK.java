package arrayDeque;

import java.util.Scanner;

public class MaxOfAllSubArraysOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        // Deque <Integer> deq=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max)
                    max = arr[j];
            }
            System.out.print(max + " ");
        }
    }
}
