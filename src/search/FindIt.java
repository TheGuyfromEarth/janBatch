package search;

import java.util.Scanner;

public class FindIt {
    public static void main (String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        long k = input.nextLong();

        long low = 0;
        long high = (long) Math.sqrt(k);
        long mid = 0;
        boolean flag = false;

        while(low<=high){
            mid = low + (high-low)/2;

            // if(mid*mid < 0){
            //     high = mid-1;
            //     continue;
            // }

            long midVal = (mid*mid) + (3*mid);

            if(midVal == k){
                flag = true;
                System.out.println(mid);
                break;
            }
            else if(midVal < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(!flag)
            System.out.println(-1);
    }
}

// K = x^2 + 3x

// 28 = X^2 + 3x

// x^2 + 3x - 28 = 0

// 0 <= x <= k

// 0 1 2 3 ........k
