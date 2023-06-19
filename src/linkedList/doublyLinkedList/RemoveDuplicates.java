package linkedList.doublyLinkedList;


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

public class RemoveDuplicates {


    public static Node deleteDuplicates(Node head) {
//complete this function

        Node temp = head;
        Node headNew = head;
        headNew.next = null;

        Node tail = headNew;

        temp = temp.next;

        while (temp != null) {

            int data = temp.val;
            int prevData = tail.val;

            if (data != prevData) {
                Node node = new Node(data);
                node.prev = tail;
                tail.next = node;
                tail = node;
            }

            temp = temp.next;
        }

        return headNew;
    }
}
