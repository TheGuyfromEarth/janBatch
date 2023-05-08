package mathematics;

import java.util.Scanner;

public class PrimeNumbersBeforeN {
    public static void main(String[] args) {

        // pre computation
        boolean[] arr = new boolean[100001];
        int[] ans = new int[arr.length];

        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            boolean val = arr[i];
            if (!val) {
                for (int j = i * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i < arr.length; i++) {
            boolean val = arr[i];
            if (!val)
                ans[i] = ans[i - 1] + 1;
            else
                ans[i] = ans[i - 1];
        }

        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();

            System.out.println(ans[N]);
        }
    }
}

