package sortingQuestions;

import java.util.Scanner;

public class MedianOfSortedArrays {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for (int i = 0; i < n; i++)
            arr1[i] = input.nextInt();

        for (int j = 0; j < m; j++)
            arr2[j] = input.nextInt();

        // merge two sorted arrays
        // using merge operation that we learnt in merge sort

        int[] aux = new int[m + n];
        // merge
        merge(arr1, arr2, aux);

        int lenAuxArr = aux.length;
        int high = lenAuxArr - 1;
        int mid = (0 + high) / 2;

        if (lenAuxArr % 2 == 0) {
            System.out.printf("%.2f", (aux[mid] + aux[mid + 1]) / 2.0);
        } else {
            // odd
            System.out.printf("%.2f", aux[mid] / 1.0);
        }
    }

    public static void merge(int[] arr1, int[] arr2, int[] aux) {
        int k = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                aux[k] = arr1[i];
                i++;
            } else {
                aux[k] = arr2[j];
                j++;
            }
            k++;
        }

        if (i == arr1.length) {
            while (j < arr2.length) {
                aux[k] = arr2[j];
                j++;
                k++;
            }
        } else {
            while (i < arr1.length) {
                aux[k] = arr1[i];
                i++;
                k++;
            }
        }

    }
}

