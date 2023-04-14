package oneDimArrays;

import java.util.*; // contains Collections framework

public class OddOccurringElement {

    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int res = binarySearch(arr);
        System.out.println(res);
    }

    public static int binarySearch(int[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {

            mid = low + (high - low) / 2;

            if (mid != 0 && arr[mid] == arr[mid - 1]) {
                // pair found in left side
                int var = mid - low + 1;
                if (var % 2 != 0)
                    high = mid - 2;
                else
                    low = mid + 1;
            } else if (mid != arr.length - 1 && arr[mid] == arr[mid + 1]) {
                // pair found in right side
                int var = high - mid + 1;
                if (var % 2 != 0)
                    low = mid + 2;
                else
                    high = mid - 1;

            } else {
                // pair not found
                return arr[mid];
            }
        }
        return -1;
    }
}

// 11
// 2 2 3 3 2 2               3 3 4 4 1
// 0 1 2 3 4 5               6 7 8 9 10
//                           l   m    h
// mid = 8
// N/2 = 5

// m - l + 1= 3

// 5
// 1 1 3 3 4
// 0 1 2 3 4
//       l h
//       m
// mid = 3



