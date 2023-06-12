package linkedListRevision;

public class LinkedListDemo {

    Node head;

    public void add(int data) {

        Node node = new Node(data);

        if (head == null) {
            // Linked list is empty
            head = node;
        } else {
            // Linked List is not empty
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
    }

    public int size() {
        int count = 0;

        if (head != null) {
            Node temp = head;

            while (temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }

}
