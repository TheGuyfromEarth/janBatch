// A die is thrown, and you win the game if the number is a multiple of 2,
// but if the number is 1, the die is thrown again
// otherwise computer wins

// Ex:
// I/P -> num = 4
// O/P -> You win

package revision;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        while (num == 1) {
            num = input.nextInt();
        }

//        while (true) {
//            num = input.nextInt();
//            if(num != 1)
//                break;
//        }

        if (num % 2 == 0)
            System.out.println("You win");
        else
            System.out.println("Computer wins");
    }
}
