package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 30, 15};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // loop for maintaining passes in selection sort
            int minIndex = i;
            for (int j = i + 1; j < n; j++) { // loop for finding min element index in the unsorted array
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(i!=minIndex)
                swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
