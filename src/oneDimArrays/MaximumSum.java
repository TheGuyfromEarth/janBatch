package oneDimArrays;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }

        int i = 1;
        int j = len - 2;

        long leftSum = arr[0];
        long rightSum = arr[len - 1];
        long ans = 0;

        while (i < j) {

            if (leftSum == rightSum) {
                ans = leftSum;
            }


            if (leftSum < rightSum) {
                leftSum += arr[i];
                i++;
            } else {
                rightSum += arr[j];
                j--;
            }


        }

        if (leftSum == rightSum)
            ans = leftSum;

        System.out.println(ans);
    }
}

