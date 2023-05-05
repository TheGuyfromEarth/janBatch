package mathematics;

import java.util.Scanner;

public class EvenlyDivisibleNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;

        for (int i = 2; i <= n; i++) {
            res = findLcm(res, i);
        }
        System.out.print(res);
    }

    public static long findLcm(long a, long b) {
        long num1 = a;
        long num2 = b;
        long temp = 0;
        long gcd = 0;
        long lcm = 0;
        while (num2 > 0) {
            temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        gcd = num1;
        lcm = (a * b) / gcd;
        return lcm;
    }
}
