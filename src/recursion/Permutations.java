package recursion;

import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Permutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str.length() == 1)
            System.out.print(str);
        else
            permutations(str);
    }

    public static void permutations(String str) {
        char[] charstr = str.toCharArray();
        Arrays.sort(charstr);

        while (true) {
            System.out.print(new String(charstr) + " ");

            if (!next_String(charstr)) {
                break;
            }
        }
    }

    static void swap(char[] charstr, int i, int j) {
        char ch = charstr[i];
        charstr[i] = charstr[j];
        charstr[j] = ch;
    }

    static void reverse(char[] charstr, int start) {
        for (int i = start, j = charstr.length - 1; i < j; i++, j--) {
            swap(charstr, i, j);
        }
    }

    public static boolean next_String(char[] charstr) {

        int i = charstr.length - 1;
        while (charstr[i - 1] >= charstr[i]) {
            if (--i == 0) {
                return false;
            }
        }

        int j = charstr.length - 1;
        while (j > i && charstr[j] <= charstr[i - 1]) {
            j--;
        }

        swap(charstr, i - 1, j);

        reverse(charstr, i);

        return true;
    }


}
