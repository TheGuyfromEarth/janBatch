package oneDimArrays;

import java.util.Scanner;

public class BattingScore {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] scores = new int[N];
        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < N; j++) {
                if (scores[j] > scores[i]) {
                    ans[i] = count;
                    break;
                } else {
                    count++;
                }
            }
        }

        for (int i = 0; i < N; i++)
            System.out.print(ans[i] + " ");
    }
}
