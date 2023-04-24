package oneDimArrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeastSubSequence {
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

            int size = 1;
            boolean flag = false;

            Arrays.sort(A);
            Arrays.sort(B);

            while (size <= M && size <= N) {
                long sumA = 0;
                for (int i = N - 1; i > N - 1 - size; i--) {
                    sumA += A[i];
                }

                long sumB = 0;
                for (int i = M - 1; i > M - 1 - size; i--) {
                    sumB += B[i];
                }

                if (sumA * sumB >= S) {
                    flag = true;
                    break;
                } else
                    size++;
            }

            if (flag)
                System.out.println(size);
            else
                System.out.println(-1);
        }
    }
}




