package basics;

import java.util.*;
import java.math.*;

public class PassCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        BigInteger five = new BigInteger("5");
        BigInteger four = new BigInteger("4");
        BigInteger m = new BigInteger("1000000007");
        long fourPower = n / 2;
        long fivePow = n - fourPower;
        BigInteger res = five.modPow(BigInteger.valueOf(fivePow), m);
        BigInteger res2 = four.modPow(BigInteger.valueOf(fourPower), m);
        long ans = (res.longValue() * res2.longValue()) % mod;
        System.out.print(ans);
    }

    static long mod = 1000000007;
}

// alternate solution

   /* static final int MOD = 1000000007;

 *//*   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long evenChoices = powMod(5, (n + 1) / 2);
        long oddChoices = powMod(4, n / 2);

        long ans = (evenChoices * oddChoices) % MOD;
        System.out.println(ans);
    }

    static long powMod(long x, long y) {
        long res = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % MOD;
            }
            x = (x * x) % MOD;
            y /= 2;
        }
        return res;
    }
}*/