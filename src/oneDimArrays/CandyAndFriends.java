package oneDimArrays;

import java.util.Scanner;

public class CandyAndFriends {

    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int[] arr = new int[N];

        int minNum = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
            if (arr[i] < minNum)
                minNum = arr[i];
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + arr[i] - minNum;
        }

        System.out.println(sum);
    }
}

