// Given a fast food centre, build their menu,
// where we need to display 4 items,
// we need to display the item selected by customer

package revision;

import java.util.Scanner;

public class FastFoodMenu {

    public static void main(String[] args) {

        int choice = 0;

        do {
            System.out.println("*********MENU*********");
            System.out.println("1 Rolls");
            System.out.println("2 Pizza");
            System.out.println("3 Shakes");
            System.out.println("4 Pasta");
            System.out.println("5 Exit");

            Scanner input = new Scanner(System.in);
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Rolls");
                    break;
                case 2:
                    System.out.println("Pizza");
                    break;
                case 3:
                    System.out.println("Shakes");
                    break;
                case 4:
                    System.out.println("Pasta");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Incorrect Input");
            }
        }while (choice != 5);

//        if (choice == 1)
//            System.out.println("Rolls");
//        else if (choice == 2)
//            System.out.println("Pizza");
//        else if (choice == 3)
//            System.out.println("Shakes");
//        else if (choice == 4)
//            System.out.println("Pasta");
//        else
//            System.out.println("Incorrect input");

    }

}
