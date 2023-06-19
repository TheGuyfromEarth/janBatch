package linkedList;

public class DeleteMiddleNode {

    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node deleteMiddleElement(Node head) {
        // return the head of the modified Linked List

        // handle single node case
        if (head.next == null) {
            head.val = -1;
            return head;
        }

        Node prev = null;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // delete the node at slow pointer

        prev.next = slow.next;
        slow.next = null;

        return head;
    }
}