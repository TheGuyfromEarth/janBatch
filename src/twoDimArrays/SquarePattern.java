package twoDimArrays;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        for (int row = 1; row <= size; row++) {
            if (row == 1 || row == size) {
                // outer row
                for (int i = 1; i <= size; i++) {
                    System.out.print("*");
                }
            } else {
                // inner row
                for (int i = 1; i <= size; i++) {
                    if (i == 1 || i == size)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

//***
//* *
//***