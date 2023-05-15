package bitManipulation;

import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];

        long res = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = sc.nextLong();
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}

