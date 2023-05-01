package search;

import java.util.Scanner;

public class GabbaTest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int currentPlayersFit = M / X;

        if (currentPlayersFit >= N)
            System.out.println(N);
        else {
            if (currentPlayersFit == N - 1)
                System.out.println(N - 1);
            else {
                int count = 1;
                while (N > 0 && N > currentPlayersFit) {
                    int totMagicPills = M + (Y * count);
                    N = N - count;
                    int numPlayersFitAfterExc = totMagicPills / X;
                    if (numPlayersFitAfterExc >= N && numPlayersFitAfterExc > currentPlayersFit)
                        currentPlayersFit = numPlayersFitAfterExc;
                    count++;
                }
                System.out.println(currentPlayersFit);
            }
        }
    }
}


