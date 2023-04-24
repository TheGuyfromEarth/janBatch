package sortingQuestions;

import java.util.Scanner;

public class InversionCount {

    static long count = 0;
    static int[] aux;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] arr = new int[N];
        aux = new int[arr.length];
        for (int i = 0; i < N; i++)
            arr[i] = input.nextInt();

        divide(arr, 0, arr.length - 1);
        System.out.println(count);
    }

    public static void divide(int[] arr, int low, int high) {  // mergeSort is the standard name for this function
        if (low < high) {
            int mid = low + (high - low) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        int k = i;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                aux[k] = arr[i];
                i++;
            } else {
                aux[k] = arr[j];
                j++;
                count += (mid - i) + 1;
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
    }
}

