package oneDimArrays;

import java.util.Scanner;

public class SubArrayCount {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long count = 0;
        count = (n * (n + 1)) / 2;
        System.out.print(count);
    }
}
