package linkedList.doublyLinkedList;

class Node1 {
    char data;
    Node1 next, prev;
};

public class IsPalindrome {
    static boolean isPalin(Node1 head) {
        // Write your code here

        if (head == null)
            return false;

        Node1 left = head;

        Node1 right = head;
        int size = 1;

        while (right.next != null) {
            right = right.next;
            size++;
        }

        int count = 0;
        while (count < size / 2) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
            count++;
        }
        return true;
    }
}