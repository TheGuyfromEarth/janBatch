// Example:
// num = 4
// fact(num) = 4*3*2*1 = 24

package recursion;

public class Factorial {

    // without recursion (using a loop)
 /*   public static void main(String[] args) {

        int num = 6;
        int fact = 1;

        while(num >= 1){
            fact = fact*num;
            num--;
        }
        System.out.println(fact);
    }*/

    // with recursion
    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1)
            return 1;

        return factorial(num - 1) * num;
    }
}

// 4! = 4*3*2*1
// 4! = 4*3!
// n! = n*(n-1)!
// factorial(n) = n*factorial(n-1)
