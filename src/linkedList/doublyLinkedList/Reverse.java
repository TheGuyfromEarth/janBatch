package linkedList.doublyLinkedList;

public class Reverse {

    class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }

    public static Node Reverse(Node head) {
//complete this function

        // Two pointer approach (start and end) and swap their data (No need to swap nodes)

        // 1) Create the pointers and take end pointer till the last node
        Node start = head;
        Node end = head;
        int size = 0;

        while (end.next != null) {
            size++;
            end = end.next;
        }

        // 2) Start comparing start and end's data and make the swap

        int count = 0;

        while (count <= size / 2) {
            swap(start, end);
            start = start.next;
            end = end.prev;
            count++;
        }

        return head;
    }

    public static void swap(Node start, Node end) {
        int temp = start.val;
        start.val = end.val;
        end.val = temp;
    }
}