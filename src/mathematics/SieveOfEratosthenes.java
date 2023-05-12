// Identify whether given number is prime or not
// T -> Composite
// F -> Prime

package mathematics;
//  T  T  F  F  T  F  T  F  T  T  T   F   T   F   T   T
//  0  1  2  3  4  5  6  7  8  9  10  11  12  13  14  15

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        int n = 15;

        boolean[] arr = new boolean[n + 1];
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!arr[i]) {

                // to mark numbers (multiples) which are composite
                for (int j = i * i; j <= n; j = j + i)
                    arr[j] = true;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!arr[i])
                System.out.print(i + " ");
        }
    }

//    public static void main(String[] args) {
//        // general method
//
//        int n = 15;
//        boolean isPrime = true;
//
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            int rem = n % i;
//            if (rem == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        System.out.println(isPrime);
//    }
}

// 51
// 17 * 3

// 36

// 2 * 18
// 3 * 12
// 4 * 9
// 6 * 6
