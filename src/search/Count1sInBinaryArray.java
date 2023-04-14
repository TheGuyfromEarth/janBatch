package search;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Count1sInBinaryArray {

    public static int count(int ar[]) {
        int i = 0;
        int j = ar.length - 1;

        while (i <= j) {
            int m = i + (j - i) / 2;
            if (ar[m] > 0) {
                i = m + 1;
                if (i < ar.length && ar[i] == 0) {
                    return (i);
                } else if (i == ar.length) {
                    return (ar.length);
                }
            } else {
                j = m - 1;
                if (j >= 0 && ar[j] == 1) {
                    return (j + 1);
                } else if (j < 0) {
                    return (0);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(count(ar));
            T--;
        }
    }
}
