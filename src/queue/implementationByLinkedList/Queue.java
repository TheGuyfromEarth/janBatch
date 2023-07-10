package queue.implementationByLinkedList;

public class Queue {

    Node front;
    Node rear;

    public void enqueue(int val) {
        Node node = new Node(val);

        if (isEmpty()) {
            // queue is empty and this is the first node being inserted in the queue
            front = rear = node;
        } else {
            // queue is not empty and already atleast one element is present
            rear.next = node;
            rear = rear.next;
        }
    }

    public Integer deqeueue() {
        if (isEmpty()) {
            // queue is empty
            throw new RuntimeException("Cannot delete from an empty queue");
//            return null;
        } else {
            // queue is not empty
            int val = front.data;
            front = front.next;
            return val;
        }
    }

    public boolean isEmpty() {
        if (front == null)
            return true;

        return false;
//        return head == null;
    }

    public void display(){

        if(isEmpty())
            return;

        Node temp = front;

        while(temp!= rear){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        // print tail's data
        System.out.print(temp.data);
    }

    public int peek(){
        if(isEmpty())
            throw new RuntimeException("Queue is empty!!!");

        return front.data;
    }
}
