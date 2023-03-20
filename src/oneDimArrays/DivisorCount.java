package oneDimArrays;

public class DivisorCount {
    public static String solve(int N, int X, int[] A) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            if (X % A[i] == 0)
                count++;
        }
        return numToWords(count);
    }

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 3, 4};
        System.out.println(solve(5, 6, A));
    }

    public static String numToWords(int num){

        String str = "";

        switch(num){
            case 1:
               str = "one";
               break;
            case 2:
               str = "two";
               break;
            case 3:
               str = "three";
               break;
            case 4:
               str = "four";
               break;
            case 5:
               str = "five";
               break;
            default:
                str = "zero";
        }
        return str;
    }
}

// Head First Java
// Java Reference
// w3schools
