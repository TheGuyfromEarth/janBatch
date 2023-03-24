package oneDimArrays;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class CountDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // number of elements in array
        int N = sc.nextInt();

        int arr[] = new int[N];
        // populate array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // sort the array
        Arrays.sort(arr);

        int count = 1;
        int prev = 0;
        int curr = 0;

        for (int i = 1; i < N; i++) {
            prev = arr[i - 1];
            curr = arr[i];

            if (prev == curr) {
                count++;
            } else if (count > 1) {
                System.out.println(prev + " " + count);
                // reset count
                count = 1;
            }

            // check for last element
            if (i == N - 1 && count > 1) {
                System.out.println(prev + " " + count);
            }
        }
    }
}

// length -> if array, use length as a variable
// Ex: int[] arr = {1,10,8,19}
// how many elements are present in array => arr.length => 4

// length() -> if String, use length as a function
// Ex: String str = "Java"
// how many characters are present in my string str => str.length() => 4



