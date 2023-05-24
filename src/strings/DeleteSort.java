package strings;

import java.util.Scanner;

public class DeleteSort {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        if (str.length() == 1) {
            System.out.print("YES");
            return;
        } else {
            char prev = str.charAt(0);
            char curr = str.charAt(1);

            for (int i = 1; i < str.length(); i++) {

                if (prev > curr) {
                    count++;
                } else
                    prev = str.charAt(i);

                if (i + 1 < str.length())
                    curr = str.charAt(i + 1);

                if (count > 1)
                    break;
            }
        }

        if (count <= 1)
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}

