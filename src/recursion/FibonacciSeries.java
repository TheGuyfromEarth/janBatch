// 0 1 1 2 3 5 8 13 21.........
// n = 5
// O/P: 3

package recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 5;
        int fib = fibonacci(n - 1);
        System.out.println(fib);
    }

    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 0)
            return 0;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

// fib(5) = fib(4) + fib(3)
// fib(4) = fib(3) + fib(2)
// fib(3) = fib(2) + fib(1)
// fib(2) = fib(1) + fib(0)

// steps(0,N) = N;
// steps(a,b) = 1+steps(a-1, b+1);
//steps(2,4)?

// steps(2,4) = 1+steps(1,5) = 1 + 7 = 8
// steps(1,5) = 1+steps(0,6) = 1 + 6 = 7
// steps(0,6) = 6