package oneDimArrays;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class HipHipArray {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int revarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            revarr[i] = arr[n - 1 - i];
        }
        int sum = 0;
        long prod = 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                sum += revarr[i];
            } else
                prod *= revarr[i];
        }
        System.out.print(sum + " " + prod);
    }
}