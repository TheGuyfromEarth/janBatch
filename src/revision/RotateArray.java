// Given an array, rotate the given array from last k elements

// Ex: arr = {9,3,5,1,6,4}, k = 2
// O/P: {6,4,9,3,5,1}

package revision;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {9, 3, 5, 1, 6, 4};
        int k = 2;

        // part A
        int start = 0;
        int end = arr.length - k - 1;
        // reverse part A
        reverse(arr, start, end);

        // part B
        start = arr.length - k;
        end = arr.length - 1;
        // reverse part B
        reverse(arr, start, end);

        // reverse entire array
        start = 0;
        end = arr.length - 1;
        reverse(arr, start, end);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[] arr, int start, int end) {
        int i = start;
        int j = end;

        while(i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
    }
}
