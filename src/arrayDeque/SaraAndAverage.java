package arrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SaraAndAverage {
    public static void main(String[] args) {
        // Your code here

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int W = input.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }


        Deque<Integer> deque = new ArrayDeque<>();
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < N; i++) {

            int element = arr[i];

            deque.addLast(element);

            sum += element;

            if (i < W)
                avg = sum / (i + 1);
            else {
                int removedElement = deque.removeFirst();
                sum = sum - removedElement;
                avg = sum / W;
            }

            System.out.print(avg + " ");

        }
    }
}
