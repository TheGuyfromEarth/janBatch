package sortingQuestions;

import java.util.Scanner;

public class SeparatingNegAndPosNos {

    static int[] aux;

    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];
        aux = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = input.nextInt();

        divide(arr, 0, N - 1);

        for (int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");
    }

    public static void divide(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;
            divide(arr, low, mid);
            divide(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int k = low;
        int i = low;
        for (; i <= mid; i++) {
            if (arr[i] < 0) {
                aux[k] = arr[i];
                k++;
            }
        }

        i = mid + 1;
        for (; i <= high; i++) {
            if (arr[i] < 0) {
                aux[k] = arr[i];
                k++;
            }
        }

        i = low;
        for (; i <= mid; i++) {
            if (arr[i] >= 0) {
                aux[k] = arr[i];
                k++;
            }
        }

        i = mid + 1;
        for (; i <= high; i++) {
            if (arr[i] >= 0) {
                aux[k] = arr[i];
                k++;
            }
        }

        for (int j = low; j <= high; j++) {
            arr[j] = aux[j];
        }
    }
}