package mathematics;

public class GCDAndLCM {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 6;

        int originalNum1 = num1;
        int originalNum2 = num2;

        // HCF
        // Euclid's Division Algorithm

        while (num2 > 0) {
            // num1 as dividend and num2 as divisor
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num1;
        System.out.println(gcd);

        // LCM
        int lcm = (originalNum1*originalNum2)/gcd;
        System.out.println(lcm);
    }
}

// Ex - 4 and 6
// LCM ->  12

// Product of Two Numbers = GCD * LCM
