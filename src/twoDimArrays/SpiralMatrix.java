package twoDimArrays;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class SpiralMatrix {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        spiralOrder(m, n, arr);
    }

    public static void spiralOrder(int m, int n, int a[][]) {
        int i, minRow = 0, minCol = 0, count = 0, total = m * n;
        int maxRow = m - 1;
        int maxCol = n - 1;

        while (count < total) {
            // Print the first row from the remaining rows
            for (i = minCol; i <= maxCol && count < total; ++i) {
                System.out.print(a[minRow][i] + " ");
                count++;
            }
            minRow++;

            // Print the last column from the remaining
            // columns
            for (i = minRow; i <= maxRow && count < total; ++i) {
                System.out.print(a[i][maxCol] + " ");
                count++;
            }
            maxCol--;

            // Print the last row from the remaining rows */
            for (i = maxCol; i >= minCol && count < total; --i) {
                System.out.print(a[maxRow][i] + " ");
                count++;
            }
            maxRow--;

            // Print the first column from the remaining
            // columns */
            for (i = maxRow; i >= minRow && count < total; --i) {
                System.out.print(a[i][minCol] + " ");
                count++;
            }
            minCol++;
        }
    }
}

