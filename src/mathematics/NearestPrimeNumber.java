package mathematics;

import java.util.Scanner;

public class NearestPrimeNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();

        long ans = 0;

        // backwards
        long numLo = N;

        while (true) {
            numLo = numLo - 1;
            if (isPrime(numLo))
                break;
        }

        // forward
        long numHi = N;

        while (true) {
            numHi = numHi + 1;
            if (isPrime(numHi))
                break;
        }

        long lowerDiff = N - numLo;
        long higherDiff = numHi - N;

        if (N != 1 && lowerDiff <= higherDiff)
            ans = numLo;
        else
            ans = numHi;

        System.out.println(ans);
    }

    public static boolean isPrime(long num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}




