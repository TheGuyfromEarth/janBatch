package linkedList;

public class ExchangeNodes {
    /*
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
    */
    public static Node exchangeNodes(Node head) {
//Enter your code here

        Node temp = head;
        Node second = head.next;
        Node prev = null;

        while (temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        // update addresses
        temp.next = second;
        head.next = temp;
        prev.next = head;
        head = temp;

        return head;
    }
}