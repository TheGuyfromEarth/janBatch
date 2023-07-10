package queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    static Queue<Integer> ReverseK(Queue<Integer> queue, int k) {
        //enter your code here

        Stack<Integer> stack = new Stack();

        for (int i = 0; i < k; i++) {
            int element = queue.poll(); // same as dequeue
            stack.push(element);
        }

        while (!stack.isEmpty()) {
            int element = stack.pop();
            queue.add(element);
        }

        for (int i = 0; i < queue.size() - k; i++) {
            int element = queue.poll(); // same as dequeue
            queue.add(element);
        }

        return queue;
    }
}
