package twoDimArrays;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class BooleanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int Mat[][] = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    Mat[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < m; i++) {
                boolean flag = false;
                for (int j = 0; j < n; j++) {
                    if (Mat[i][j] == 1) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    for (int j = 0; j < n; j++) {
                        Mat[i][j] = 1;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(Mat[i][j] + " ");
                }
                System.out.println();
            }
        }

    }
}
