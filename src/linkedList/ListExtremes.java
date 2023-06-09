package linkedList;

public class ListExtremes {
// class Node {
//     int data;
//     Node next;

    //     Node(int d) {
//         data = d;
//         next = null;
//     }
// }
    public static int findDifference(Node head) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Node temp = head;

        while (temp != null) {
            int val = temp.data;
            if (val > max)
                max = val;
            if (val < min)
                min = val;

            temp = temp.next;
        }

        return max - min;
    }
}