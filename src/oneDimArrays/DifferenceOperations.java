package oneDimArrays;

import java.util.Scanner;

public class DifferenceOperations {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        boolean res = true;
        boolean hasZero = false;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();

            if (hasZero && arr[i] != 0) {
                res = false;
                break;
            }

            if (i == 0 && arr[i] == 0) {
                res = false;
                break;
            } else if (i == 1 && arr[i] < arr[i - 1]) {
                res = false;
                break;
            }

            if (arr[i] % arr[0] != 0) {
                res = false;
                break;
            }

            if (arr[i] == 0)
                hasZero = true;

        }

        if (!res)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}

