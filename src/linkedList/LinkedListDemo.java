package linkedList;

public class LinkedListDemo {

    Node head;

    public void add(int data) {

        Node node = new Node(data);

        if (head == null) {
            // if list empty, then create first node and update head
            head = node;
        } else {
            // if list not empty, insert element at end of linked list

            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public int get(int index) {
        Node temp = head;
        int count = 0;

        if(index<0)
            throw new RuntimeException("Index cannot be negative");

        while (count != index) {
            temp = temp.next;
            if(temp == null)
                throw new RuntimeException("Index greater than size of the linked list");
            count++;
        }
        return temp.data;
    }

    public void addLast(){

    }

    public void addFirst(){

    }

    public int size(){
        return -1;
    }

    public boolean isEmpty(){
        return false;
    }

    public void remove(int data){

    }

    // 10 20 40 30
    // I/P: 2, 80
    // O/P: 10 20 80 40 30
    public void addElementAt(int index, int data){

    }
}
