package strings;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        String b = sc.next();

        int c = Integer.parseInt(b, 2);

        int d = Integer.parseInt(a, 2);

        int y = 0;

        for (int i = 1; i <= c; i++) {

            if ((d | i) == c)

                y += 1;

        }

        System.out.println(y);

    }

}