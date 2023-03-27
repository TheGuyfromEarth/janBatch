package twoDimArrays;

import java.util.Scanner;

public class RotateBy90 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[][] matrix = new int[N][N];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        // display the given matrix
        display(matrix);
        // create an auxiliary(helper) matrix
        int[][] transposeMatrix = transpose(matrix);

        // printing the transposed matrix
        display(transposeMatrix);

        // reverse array
        for (int row = 0; row < transposeMatrix.length; row++) {
            reverseArray(transposeMatrix[row]);
        }
        // display the matrix rotated by 90 deg
        display(transposeMatrix);
    }

    public static void reverseArray(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transposeMatrix = new int[matrix.length][matrix[0].length];

        // transpose
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transposeMatrix[col][row] = matrix[row][col];
            }
        }
        return transposeMatrix;
    }

    public static void display(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
