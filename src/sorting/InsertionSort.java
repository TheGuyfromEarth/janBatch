package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {20, 10, 5, 30, 15};

        int n = arr.length;

        for (int i = 1; i < n; i++) { // loop for maintaining passes in insertion sort
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) { // loop for comparing element at j with temp value
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
