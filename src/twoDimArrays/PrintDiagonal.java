// Given a matrix, print it's diagonal elements

// Ex: arr = {1,3,5
//            4,9,10
//            2,6,11}

// O/P: 1,9,11

package twoDimArrays;

public class PrintDiagonal {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 3, 5},
                {4, 9, 10},
                {2, 6, 11}
        };

//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[0].length; col++) {
//                if (row == col)
//                    System.out.println(arr[row][col]);
//            }
//        }

        // Better Solution
        for (int row = 0; row < arr.length; row++)
                System.out.println(arr[row][row]);
    }
}
