package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 5, 4};
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }

    // recursive function
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // left partitioning
            quickSort(arr, low, pivotIndex - 1);
            // right partitioning
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivotIndex = low;
        int pivotVal = arr[pivotIndex];
        int i = low;
        int j = high;

        while (i < j) {
            while (i < arr.length && arr[i] <= pivotVal)
                i++;

            while (j >= 0 && arr[j] > pivotVal)
                j--;

            if (i < j)
                swap(arr, i, j);
        }
        swap(arr, pivotIndex, j);
        return j;
    }

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
