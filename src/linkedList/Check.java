package linkedList;


public class Check {

    public static void main(String[] args) {

        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.remove(30);


//        System.out.println(linkedList.get(2));
////        System.out.println(linkedList.get(-1));
//        System.out.println(linkedList.get(5));

        linkedList.display();
    }
}
