package mathematics;

import java.util.Scanner;

public class NumberOfFactors {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        byte N = input.nextByte();

        // 1) Prime Factors till N
        boolean[] arr = new boolean[N + 1];

        arr[0] = arr[1] = true;
        int prod = 1;

        for (int i = 2; i <= N; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= N; j += i) {
                    arr[j] = true;
                }

                // 2) Find exponent of that prime number
                int p = i;
                int sum = 0;
                int count = 2;
                while (p <= N) {
                    sum += N / p;
                    p = (int) Math.pow(i, count);
                    count++;
                }
                prod = prod * (sum + 1);
            }
        }

        System.out.println(prod);
    }
}


