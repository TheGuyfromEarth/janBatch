package search;

import java.util.Scanner;

public class PolynomialSolution {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        long k = input.nextLong();

        long low = 0;
        long high = (long) Math.sqrt(k);
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long val = (a * mid * mid) + (b * mid) + c;
            if (val == k) {
                ans = mid;
                break;
            } else if (val < k) {
                low = mid + 1;
            } else {
                if (mid < ans)
                    ans = mid;
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
