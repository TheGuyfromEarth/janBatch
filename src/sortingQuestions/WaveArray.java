package sortingQuestions;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);

        // wave array
        for (int i = 1; i < arr.length; i += 2) {
            swap(arr, i, i - 1);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

