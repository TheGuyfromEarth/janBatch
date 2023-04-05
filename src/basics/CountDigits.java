package basics;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while(T>0){

            int n = scanner.nextInt();
            int count = countDigs(n);
            System.out.println(count);
            T--;
        }
    }

    public static int countDigs(int num){

        int count = 0;

        while (num!=0){
            num = num/10;
            count++;
        }
        return count;
    }
}

// 1) We get the unit's place digit by performing mod operation with 10.
// 2) In order to remove the unit's place from the given num, divide that number by 10.

