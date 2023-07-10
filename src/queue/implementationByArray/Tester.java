package queue.implementationByArray;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
//        queue.enqueue(60);

        queue.display();


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.display();

        queue.enqueue(-10);
        queue.enqueue(-20);
        queue.enqueue(-30);

        queue.display();
    }
}
