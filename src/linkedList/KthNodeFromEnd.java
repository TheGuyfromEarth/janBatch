package linkedList;

// Given a linked list, return the Kth node from end of the linked list

// Ex: I/P: 10 -> 30 -> 20 -> 80 -> 60
// k = 2

// O/P -> 80

public class KthNodeFromEnd {

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node kthNodeFromEnd(Node head, int k) {

        // Create two pointers and give a headstart of k nodes to fast pointer

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Now move both slow and fast together until fast is not null

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
