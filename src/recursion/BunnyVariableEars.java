// Given that an odd numbered bunny has 1 ear and an even numbered bunny has 2 ears,
// find how many ears will be present in total, when given n bunnies.

// Ex: n = 4
// No of bunny ears = 1 + 2 + 1 + 2 = 6

// Ex: n = 5
// No of bunny ears = 1 + 2 + 1 + 2 + 1 = 7

package recursion;

public class BunnyVariableEars {

    public static void main(String[] args) {
        int result = bunnyEars(4);
        System.out.println(result);
    }

    public static int bunnyEars(int n) {
        if (n == 0)
            return 0;

        if (n % 2 == 0)
            return bunnyEars(n - 1) + 2;
        else
            return bunnyEars(n - 1) + 1;
    }
}

// BE(4) -> BE(3) + 2 -> BE(2) + 1 -> BE(1) + 2 -> BE(0)+1
//  6