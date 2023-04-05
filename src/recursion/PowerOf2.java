// Given n, find 2^n

// Example:
// n = 4
// 2^n = 16

package recursion;

public class PowerOf2 {

    public static void main(String[] args) {

        int result = power(4);
        System.out.println(result);
    }

    public static int power(int n) {
        if (n == 0)
            return 1;

        return power(n - 1) * 2;
    }
}

// 2^4 = 2*2*2*2
// 2^4 = 2*2^3
// 2^n = 2*2^(n-1)
// power(n) = 2*power(n-1)


