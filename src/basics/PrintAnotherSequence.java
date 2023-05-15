package basics;

import java.util.Scanner;

public class PrintAnotherSequence {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long a = 1, b = 2;
        long res = 0;

        if (n == 1)
            System.out.print("1");
        else if (n >= 2)
            System.out.print("1 2 ");

        for (int i = 3; i <= n; i++) {
            res = (a) - (b);
            a = b;
            b = res;
            System.out.print(res + " ");
        }
    }
}