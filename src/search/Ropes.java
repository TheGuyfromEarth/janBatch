package search;

import java.util.Scanner;

public class Ropes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] ropes = new int[n];

        for (int i = 0; i < n; i++) {

            ropes[i] = sc.nextInt();

        }

        double left = 0, right = 1000000000;

        while (right - left > 0.000001) {

            double mid = (left + right) / 2.0;

            int p = 0;

            for (int i = 0; i < n; i++) {

                p += ropes[i] / mid;

            }

            if (p >= k) {

                left = mid;

            } else {

                right = mid;

            }

        }

        System.out.printf("%.6f", left);

    }

}
