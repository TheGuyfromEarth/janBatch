// Given that a bunny has 2 ears, find how many ears will be present in total, when given n bunnies.

// n = 4
// No of bunny ears = 8

package recursion;

public class BunnyEars {

    public static void main(String[] args) {
        int result = bunnyEars(4);
        System.out.println(result);
    }

    public static int bunnyEars(int n) {
        if (n == 0)
            return 0;

        return bunnyEars(n - 1) + 2;
    }
}

// 4 bunnies = 4 * 2
// 3 bunnies = 3 * 2
// 2 bunnies = 2 * 2
