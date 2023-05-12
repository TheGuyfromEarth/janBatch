// Print the squares of first n natural numbers
// Print the sum of squares of first n natural numbers

// n = 3
// O/P: 1 4 9
// sum: 14

package revision;

import java.util.Scanner;

public class PrintSquares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println();
        System.out.println(n * (n + 1) * (2 * n + 1) / 6);
    }
}
