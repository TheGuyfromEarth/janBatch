package twoDimArrays;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

//        int[][] marks = {
//                {90, 80, 100},
//                {89, 78, 60},
//                {100, 80, 78}
//        };


        Scanner input = new Scanner(System.in);

        // user input for number of rows in a 2d array
        int numRows = input.nextInt();

        // user input for number of cols in a 2d array
        int numCols = input.nextInt();

        int[][] scores = new int[numRows][numCols];

        // take user input for array values
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                scores[i][j] = input.nextInt();
            }
        }

        // print the array

        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                System.out.print(scores[row][col] + " ");
            }
            System.out.println();
        }
    }
}