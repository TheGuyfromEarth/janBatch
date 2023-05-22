package mathematics;

import java.io.*;
import java.util.*;

public class FindF1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int fn = Integer.parseInt(st.nextToken());
        long ans = fn;
        int P = 1000000007;

        long inv2n = (long) pow(pow(2, n - 1, P) % P, P - 2, P);
        ans = ((ans % P) * (inv2n % P)) % P;
        System.out.println((ans) % P);

    }

    static long pow(long x, long y, long P) {
        long res = 1l;

        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % P;

            y = y >> 1;
            x = (x * x) % P;
        }
        return res;
    }
}