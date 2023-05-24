package twoDimArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AltMatrixSum {
    //    public static void main(String[] args) {
//        // Your code here
//        Scanner input = new Scanner(System.in);
//        Short N = input.nextShort();
//        long blackSum = 0, whiteSum = 0;
//
//        // Read the matrix values
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if ((i + j) % 2 == 0) {
//                    // Black square
//                    blackSum += input.nextInt();
//                } else {
//                    // White square
//                    whiteSum += input.nextInt();
//                }
//            }
//        }
//
//
//        // Print the sums
//        System.out.println(blackSum);
//        System.out.println(whiteSum);
//    }
//}
    public static void main(String[] args) throws Exception {

        InputStreamReader r = new InputStreamReader(System.in);

        BufferedReader sc = new BufferedReader(r);

        int N = Integer.parseInt(sc.readLine());

        String[] str = sc.readLine().split(" ");

        int sumb = 0;

        int sumw = 0;

        int cur = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                int temp = Integer.parseInt(str[cur]);

                if (i % 2 != 0 && j % 2 != 0) {

                    sumb += temp;

                } else if (i % 2 == 0 && j % 2 == 0) {

                    sumb += temp;

                } else {

                    sumw += temp;

                }

                cur++;

            }

        }

        System.out.println(sumb);

        System.out.println(sumw);

    }

}
