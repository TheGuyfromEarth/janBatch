public class TimeComplexity {

    public static void main(String[] args) {

        // note the start time of my program

        int n = 200;

        if(true)
            System.out.println("This is a revision session");
        //note the end time of my program
    }
}
// System A                    // System B (Friend)
// 0.5 secs                    2 secs

// 2 83 91 94 1 83 99 199 28 48 199 24 78 28  (n)

// Types of time complexities:

// 1) Best Case TC : (omega) : 16
// 2) Average Case TC : (Qeta): 20
// 3) Worst Case TC : (Big O) :  25

// Input is n where n represents the number of elements in the input

// 1) Constant TC (O(1))
// 2) Logarithmic TC (O(logn)) - binary search
// 3) Linear TC (O(n)) - one for loop
// 4) (O(nlogn)) - sorting algorithms
// 5) Quadratic TC (O(n^2)) - two for loops
// 6) Cubic TC (O(n^3)) - three nested for loops
// 7) O(2^n) - Exponential TC (Recursion)
// 8) O(n!) - Factorial (Recursion)

// TC = O(n) + O(n^2) = O(n^2)
// TC = 2O(n) + 4(O(n^2)) = O(n^2)
// TC = O(logn) + O(n) = O(n)
// TC = O(n^3)/100 + O(n!)/200 + 5O(n) = O(n!)
