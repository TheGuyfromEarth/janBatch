package strings;

import java.util.Scanner;

public class LazySam {
    public static void main (String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        while(T-- > 0){
            int len = input.nextInt();
            String A = input.next();
            String B = input.next();

            int countA = 0;
            int countB = 0;

            for(int i=0; i<A.length();i++){
                char chA = A.charAt(i);
                char chB = B.charAt(i);

                if(chA == '1')
                    countA++;

                if(chB == '1')
                    countB++;
            }

            if(countA == countB)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}


