package twoDimArrays;

import java.util.Scanner;

public class SimpleTranspose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, i, j;
        N = sc.nextInt();
        int[][] arr = new int[N][N];


        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                arr[i][j] = sc.nextInt();
        }

        int[][] arr_transpose = new int[N][N];

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                arr_transpose[j][i] = arr[i][j];
            }
        }

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print(arr_transpose[i][j]+" ");
            }
            System.out.println();
        }



    }
}
