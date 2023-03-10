// Given two arrays, check whether the two arrays are equal to each other or not.
// Ex: arr1 = {10,70,30,60};
// Ex: arr2 = {10,70,30,60,80};
// O/P : false

import java.util.Arrays;

public class EqualityofArrays {

    public static void main(String[] args) {
        int[] arr1 = {10,70,30,60};
        int[] arr2 = {10,70,30,60};

//        if(arr1.length == arr2.length) { // O(1)
//
//            boolean isEqual = true; // O(1)
//
//            for(int i=0; i<arr1.length;i++){ // O(n)
//                if(arr1[i] != arr2[i]) // O(1)
//                {
//                    isEqual = false; // O(1)
//                    break;
//                }
//            }
//
//            if(isEqual == true) // O(1)
//                System.out.println("Equal"); // O(1)
//            else
//                System.out.println("Unequal"); // O(1)
//        } else
//            System.out.println("Unequal"); // O(1)

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
