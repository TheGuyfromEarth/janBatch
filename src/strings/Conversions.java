package strings;

import java.io.*;
import java.util.*;

public class Conversions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            char ch = str.charAt(0);
            ch = (char) (ch - 'a' + 'A');
            String convertedString = ch + str.substring(1);
            System.out.print(convertedString + " ");
        }
    }
}


// lowercase to uppercase
// char uc = (char) (lc - 'a' + 'A')

// uppercase to lowercase
// char lc = (char) (uc - 'A' + 'a')