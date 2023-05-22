// Given two sorted arrays, find the union and intersection of the two arrays

// Example: arr1 = {1,4,8,9}
// arr2 = {2,3,4,5,7,8}

// union -> {1,2,3,4,5,7,8,9}

// O/P
// union -> {1,2,3,4,5,7,8,9}
// intersection -> {4,8}

package revision;

import java.util.ArrayList;

public class UnionAndIntersection {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 8, 9}; // m
        int[] arr2 = {2, 3, 4, 5, 7, 8}; // n

        // approach is similar to what we saw in merge algorithm (merge sort)

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) { // O(m+n)
            if (arr1[i] < arr2[j]) {
                union.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                union.add(arr2[j]);
                j++;
            } else {
                union.add(arr1[i]);
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i< arr1.length){
            union.add(arr1[i]);
            i++;
        }

        while(j< arr2.length){
            union.add(arr2[j]);
            j++;
        }

        System.out.println(union);
        System.out.println(intersection);
    }
}
