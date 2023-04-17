package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {20, 10, 5, 30, 15};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // loop for maintaining passes in bubble sort
            boolean isSwapped = false;
            for (int j = 1; j < n - i; j++) { // loop for performing adjacent comparisons in single pass
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
