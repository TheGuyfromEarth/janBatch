// Given an arrayList,
// 1) remove the duplicates from the arrayList
// 2) remove the duplicates from the arrayList & retain the Order of arrayList
// 3) remove the duplicates from the arrayList & sort the arrayList

package hashing;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(10);
        myList.add(5);
        myList.add(20);

        System.out.println(myList);

        // 1) remove the duplicates from the arrayList
/*        HashSet<Integer> set = new HashSet<>(myList);
//        set.addAll(myList);
        myList.clear();
        myList.addAll(set);
        System.out.println(myList);*/

        // 2) remove the duplicates from the arrayList & retain the Order of arrayList
        /*LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(myList);
//        set.addAll(myList);
        myList.clear();
        myList.addAll(linkedHashSet);
        System.out.println(myList);*/

        // 3) remove the duplicates from the arrayList & sort the arrayList
        TreeSet<Integer> treeSet = new TreeSet<>(myList);
//        set.addAll(myList);
        myList.clear();
        myList.addAll(treeSet);
        System.out.println(myList);

    }
}
