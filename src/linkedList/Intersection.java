package linkedList;

public class Intersection {

    public static Node intersection(Node head1, Node head2) {
//Enter your code here

        //1) find size
        int sizeL1 = size(head1);
        int sizeL2 = size(head2);

        //2) Find diff and give a head start to the longer list by diff
        int diff = sizeL1 - sizeL2;
        Node tempL1 = head1;
        Node tempL2 = head2;

        if (diff > 0) {
            tempL1 = headStart(head1, diff);
        } else if (diff < 0) {
            tempL2 = headStart(head2, Math.abs(diff));
        }

        //3) Start comparing the nodes in two lists
        while (tempL1 != null && tempL2 != null) {

            if (tempL1 == tempL2) {
                return tempL1;
            }

            tempL1 = tempL1.next;
            tempL2 = tempL2.next;
        }

        return null;
    }

    public static int size(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static Node headStart(Node head, int diff) {

        int count = 0;
        Node temp = head;

        while (count < diff) {
            temp = temp.next;
            count++;
        }
        return temp;
    }
}
