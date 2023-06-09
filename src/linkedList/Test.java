package linkedList;

import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList();
        myList.add(20);
        myList.add(40);
        myList.add(50);

        myList.remove((Integer)20);

        myList.addFirst(10);
        System.out.println(myList.contains(40));

        System.out.println(myList);

    }
}
