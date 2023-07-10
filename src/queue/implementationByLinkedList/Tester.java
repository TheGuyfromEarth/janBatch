package queue.implementationByLinkedList;

public class Tester {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(15);

        queue.display();
        System.out.println();
        System.out.println("peek val "+queue.peek());
        System.out.println(queue.deqeueue());
        System.out.println("peek val "+queue.peek());
        System.out.println(queue.deqeueue());

        queue.display();
        System.out.println();
        System.out.println(queue.deqeueue());
        System.out.println(queue.deqeueue());

        queue.display();

        System.out.println(queue.deqeueue());
        System.out.println(queue.deqeueue());
    }
}
