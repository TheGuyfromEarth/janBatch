package twoDimArrays;

import java.util.Scanner;

public class AkashsAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        short m = sc.nextShort();
        int sum = 0;
        byte num = 0;
        short diagonal_sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                num = sc.nextByte();
                sum += num * num;

                if (i == j)
                    diagonal_sum += num;
            }
        }

        System.out.println(sum + " " + diagonal_sum);
    }
}
