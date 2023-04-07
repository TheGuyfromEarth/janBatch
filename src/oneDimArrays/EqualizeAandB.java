package oneDimArrays;

import java.util.Scanner;

public class EqualizeAandB {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        // indexA represents index of -1 (element) in A
        int indexA = -1;
        int indexB = -1;
        int secondIndex = -1;
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();

            if (A[i] == -1) {
                if (indexA == -1)
                    indexA = i;
                else
                    secondIndex = i;
            } else
                sumA = sumA + A[i];
        }

        for (int i = 0; i < N; i++) {
            B[i] = input.nextInt();
            if (B[i] == -1) {
                if (indexB == -1)
                    indexB = i;
                else
                    secondIndex = i;
            } else
                sumB = sumB + B[i];
        }

        if (indexA != -1 && indexB != -1) {
            System.out.println("Infinite");
        }
        // -1 is present twice in same Array (A)
        else if (indexA != -1 && secondIndex != -1) {
            if (sumA < sumB) {
                // find ways to generate the given difference
                int diff = sumA - sumB;
                System.out.println(diff + 1);
            } else
                System.out.println(0);
        }
        // -1 is present twice in same Array (B)
        else if (indexB != -1 && secondIndex != -1) {
            if (sumB < sumA) {
                // find ways to generate the given difference
                int diff = sumA - sumB;
                System.out.println(diff + 1);

            } else
                System.out.println(0);
        } else {
            // -1 occurred only once
            if (indexA != -1) {
                if (sumA < sumB)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else {
                if (sumB < sumA)
                    System.out.println(1);
                else
                    System.out.println(0);
            }
        }
    }
}


// If -1 is present in an array whose sum is less than the other array, only one way will be there
// If -1 is present in an array whose sum is greater or equal than the other array, zero ways will be there

// If -1 is present twice:
// a) -1 in both arrays -> Infinite
// b) -1 present twice in same array (A)
//   b1) sum(A) < sum(b) -> find the difference => sum(B) - sum(A) -> Total ways of generating
// that difference using two digits

// 4
// 0,4 4,0
// 1,3 3,1
// 2,2

// 3
// 0,3 3,0
// 1,2 2,1

// 6
// 0,6 6,0
// 1,5 5,1
// 2,4 4,2
// 3,3

// 5
// 0,5 5,0
// 1,4 4,1
// 2,3 3,2


