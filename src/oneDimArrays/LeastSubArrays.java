package oneDimArrays;

import java.util.Scanner;

public class LeastSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int A[] = new int[N];
            int B[] = new int[M];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int j = 0; j < M; j++) {
                B[j] = sc.nextInt();
            }

            long S = sc.nextLong();
            boolean flag = false;

            int k = 1;

            for (; k <= M && k <= N; k++) {

                // sliding window logic to find max sum for size k
                long sumA = 0;
                long maxSumA = 0;
                long sumB = 0;
                long maxSumB = 0;

                // sum of first k elements
                for (int i = 0; i < k; i++) {
                    sumA += A[i];
                    sumB += B[i];
                }

                maxSumA = sumA;
                maxSumB = sumB;

                for (int i = k; i < N; i++) {
                    sumA = sumA - A[i - k] + A[i];
                    if (sumA > maxSumA)
                        maxSumA = sumA;
                }

                for (int i = k; i < M; i++) {
                    sumB = sumB - B[i - k] + B[i];
                    if (sumB > maxSumB)
                        maxSumB = sumB;
                }


                if (maxSumA * maxSumB >= S) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.println(k);
            else
                System.out.println(-1);
        }
    }
}





