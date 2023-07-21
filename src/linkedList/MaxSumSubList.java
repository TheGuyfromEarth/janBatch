package linkedList;

public class MaxSumSubList {
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static int solve(Node head) {

        Node temp = head;

        int currSum = head.val;
        int maxSum = head.val;

        temp = head.next;

        while (temp != null) {

            // Kadane's Algorithm  TC O(N)
            if (currSum >= 0) {
                currSum += temp.val;
            } else {
                currSum = temp.val;
            }

            if (currSum > maxSum)
                maxSum = currSum;

            temp = temp.next;
        }

        return maxSum;
    }
}
