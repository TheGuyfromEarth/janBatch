// Given two matrix, find the sum of the two matrices.

// Ex:
// matrix1 = [2 3       matrix2 = [1 3
//            4 5]                 0 1]


// sum = [3 6
//        4 6]


package twoDimArrays;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {2,3},
                {4,5}
        };

        int[][] matrix2 = {
                {1,3},
                {0,1}
        };

        int mat1Rows = matrix1.length;
        int mat1Cols = matrix1[0].length;
        int mat2Rows = matrix2.length;
        int mat2Cols = matrix2[0].length;

        if(mat1Rows == mat2Rows && mat1Cols == mat2Cols){
            int[][] sumMatrix = new int[mat1Rows][mat1Cols];

            for(int row=0; row<mat1Rows;row++){
                for(int col=0;col<mat1Cols;col++){
                    sumMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }

            for(int row=0; row<mat1Rows;row++) {
                for (int col = 0; col < mat1Cols; col++) {
                    System.out.print(sumMatrix[row][col]+" ");
                }
                System.out.println();
            }

        }else
            System.out.println("Sum not possible");
    }
}
