package sorting;

import java.util.Arrays;

// stable count sort
public class CountSort {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 2, 2, 1, 0};

        // step1 : find range of your array elements
        // range : diff between max and min values

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            if (val > max)
                max = val;
            if (val < min)
                min = val;
        }

        int range = max - min + 1;

        // step2 : find freq count of all elements
        int[] freq = new int[range];

        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            freq[val]++;
        }

        // step3 : find prefix sum
        for (int i = 1; i < freq.length; i++) {
            freq[i] = freq[i] + freq[i - 1];
        }

        // step4 : reverse iterate across the given array and put the values in new array according to freq array (prefix sum array)
        int[] ans = new int[arr.length];

        for(int i= arr.length-1;i>=0;i--){
            int val = arr[i];
            int index = freq[val]-1;
            ans[index] = val;
            freq[val] = index;
        }

        System.out.println(Arrays.toString(ans));
    }
}
