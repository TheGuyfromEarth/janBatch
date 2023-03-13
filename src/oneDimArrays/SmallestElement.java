package oneDimArrays;// Given an array, find the smallest element present in that array
// Ex: arr = {10,8,12,9,11}
// O/P: 8

public class SmallestElement {

    public static void main(String[] args) {

        int[] arr = {10, 8, 6, 11};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);
    }
}
