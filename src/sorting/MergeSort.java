package sorting;

import java.util.Arrays;

public class MergeSort {

    static int count = 0;

    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 30, 15};

        divide(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }

    public static void divide(int[] arr, int low, int high) {  // mergeSort is the standard name for this function
        if (low < high) {
            int mid = (low + high) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int[] aux = new int[arr.length];
        int k = i;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                aux[k] = arr[i];
                i++;
            } else {
                aux[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > mid) { // first sub array exhausted
            while (j <= high) {
                // all remaining elements to come from second sub array
                aux[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                // all remaining elements to come from first sub array
                aux[k] = arr[i];
                i++;
                k++;
            }
        }

        // copy elements from aux to arr
        for (int index = low; index <= high; index++)
            arr[index] = aux[index];

        count++;
    }
}
