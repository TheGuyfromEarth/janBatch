package strings;

import java.util.Scanner;

public class KillAvengers {
    public static void main(String[] args) {
        // Your code here

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();

        int num = len / 4; // allowed occurrences

        int gFreq = 0, aFreq = 0, cFreq = 0, tFreq = 0;

        int lenSubString = 0, temp = 0;

        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'A':
                    aFreq++;
                    if (aFreq > num) {
                        lenSubString = temp;
                        lenSubString++;
                    }
                    break;
                case 'C':
                    cFreq++;
                    if (cFreq > num) {
                        lenSubString = temp;
                        lenSubString++;
                    }
                    break;
                case 'G':
                    gFreq++;
                    if (gFreq > num) {
                        lenSubString = temp;
                        lenSubString++;
                    }
                    break;
                case 'T':
                    tFreq++;
                    if (tFreq > num) {
                        lenSubString = temp;
                        lenSubString++;
                    }
                    break;
            }
            if (lenSubString > 0)
                temp++;
        }

        System.out.println(lenSubString);
    }
}

