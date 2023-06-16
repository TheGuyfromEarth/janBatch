package linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);

        reverse(linkedList.head);
    }

    public static void reverse(Node node){

        if (node == null)
            return;

        // pre-call area

        reverse(node.next);

        // post-call area
        System.out.print(node.data+" ");
    }
}
