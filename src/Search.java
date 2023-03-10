// Given an array, check whether a particular element is present in the array or not
// Ex: arr = [10,20,5,15]
// num = 20
// O/P: True

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {

        int[] arr = {10, 20, 25, 55};
        int num = 60;
        boolean flag = false;
////
////        for (int i = 0; i < arr.length; i++) {
////
////            if (arr[i] == num) {
////                flag = true;
////                break;
////            }
////        }
////
////        if (flag)
////            System.out.println("Present");
////        else
////            System.out.println("Not Present");

        System.out.println(Arrays.binarySearch(arr, num));
    }
}
