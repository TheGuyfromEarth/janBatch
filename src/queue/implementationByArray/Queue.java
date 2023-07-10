package queue.implementationByArray;

public class Queue {

    int[] arr;
    int rear = -1;
    int front = -1;
    int N; // length of array or capacity of queue

    public Queue(int N) {
        this.N = N;
        arr = new int[N];
    }

    public void enqueue(int data) {
        if (isFull()) {
            throw new RuntimeException("Queue is Full, enqueue not possible");
        } else {
            if (isEmpty()) {
                // rear and front both will move forward
                front = rear = 0;
                arr[rear] = data;
            } else {
                // atleast one element is present in queue
                rear = (rear + 1) % N;
                arr[rear] = data;
            }
        }
    }

    public int dequeue() {

        if (isEmpty()) {
            throw new RuntimeException("Queue is empty, nothing to be deleted");
        } else {
            int data = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % N;
            }
            return data;
        }
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;

        return false;
    }

    public boolean isFull() {
        if (front == (rear + 1) % N)
            return true;

        return false;
    }

    public void display() {
        int temp = front;

        while (temp != rear) {
            System.out.print(arr[temp] + " ");
            temp = (temp + 1) % N;
        }
        System.out.print(arr[temp]);
        System.out.println();
    }
}
