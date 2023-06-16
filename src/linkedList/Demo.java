package linkedList;

import java.util.LinkedList;

public class Demo {

    public static void main(String[] args) {

        LinkedList<Integer> myList = new LinkedList();
        myList.add(90);
        myList.add(20);
        myList.add(10);
        myList.add(80);
        myList.add(1,100);

//        System.out.println(myList.isEmpty());

//        myList.remove(1);
        System.out.println(myList);
    }
}
