package arrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
//        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();

        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(30);

        deque.addLast(100);
        deque.addLast(200);

        deque.removeFirst();
        deque.removeFirst();
        deque.removeLast();

        System.out.println(deque);
    }
}
