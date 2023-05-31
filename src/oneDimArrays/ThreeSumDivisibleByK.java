package oneDimArrays;

import java.util.Scanner;

public class ThreeSumDivisibleByK {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int p = j + 1; p < n; p++) {
                    int sum = arr[i] + arr[j] + arr[p];
                    if (sum % k == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
