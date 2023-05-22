package oneDimArrays;

public class SumOfNumbers {

    public void Sum(int n, int[] a, int s) {
        int i, j;
        for (i = 0; i < (1 << n); i++) {
            int x = 0;
            for (j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) x += a[j];
            }
            if (x == s) {
                System.out.println("YES");
                break;
            }
        }
        if (i == (1 << n)) {
            System.out.println("NO");
        }

    }

}
