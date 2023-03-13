package oneDimArrays;

import java.util.*; // contains Collections framework

public class MinimumAdjacentDifference {

    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int numTestCases = input.nextInt();

        while (numTestCases > 0) {

            int arrSize = input.nextInt();
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = input.nextInt();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < arrSize - 1; i++) {
                int temp = Math.abs(arr[i] - arr[i + 1]);
                if (temp < min)
                    min = temp;
            }

            int temp = Math.abs(arr[arrSize - 1] - arr[0]);
            if (temp < min)
                min = temp;

            System.out.println(min);

            numTestCases--;
        }
    }
}

