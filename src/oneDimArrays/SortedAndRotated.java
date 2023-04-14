package oneDimArrays;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class SortedAndRotated {

    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        while (testCases > 0) {

            int N = input.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            String result = checkSortedRotated(arr);
            System.out.println(result);
            testCases--;
        }
    }

    public static String checkSortedRotated(int[] arr) {
        // a) Identification of sequence
        int count = 0;
        if (arr[0] > arr[arr.length - 1]) { // 5 1 2 3 4
            // increasing sequence
            // b) Count the number of sequence changes
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1])
                    count++;
            }
        } else {
            // decreasing sequence
            // b) Count the number of sequence changes
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1])
                    count++;
            }
        }
        if (count == 1)
            return "Yes";
        else
            return "No";
    }

}

// count = 3
// 4
// 3 4 1 2 -> inc => YES


// 3
// 1 3 2 -> dec => YES

// 4
// 1 2 3 4 -> dec => NO
// 4 1 2 3

// 1 3 2 4
// 4 1 3 2 -> increasing sequence => NO
// count = 2


// a) Identification of sequence
// b) Count the number of sequence changes
