package bitManipulation;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            res = res ^ arr[i];
        }
        System.out.println(res);
    }
}



