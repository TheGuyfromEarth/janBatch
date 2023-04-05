package recursion;

import java.util.Scanner;

public class InsertOperator {

    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long k = scanner.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        boolean result = insertOperator(arr, k, 0, 0);
        if (result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    public static boolean insertOperator(long[] arr, long k, int index, long sum) {

        if (index == arr.length) {
            if (k == sum)
                return true;
            else
                return false;
        }

        if (insertOperator(arr, k, index + 1, sum + arr[index]))
            return true;
        if (insertOperator(arr, k, index + 1, sum - arr[index]))
            return true;

        return false;
    }
}

//        1 + 2 + 3 + 4
//        1 + 2 - 3 - 4
//        1 + 2 + 3 - 4
//        .
//        .
//        .
//        .
//        1 - 2 - 3 - 4
