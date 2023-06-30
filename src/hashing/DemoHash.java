package hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class DemoHash {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Tea");
        set.add("Coffee");
        set.add("Soft Drinks");
        set.add("Coffee");
        set.add("Coffee");

        System.out.println("HashSet "+set);

        // order needs to be retained
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Tea");
        linkedHashSet.add("Coffee");
        linkedHashSet.add("Soft Drinks");
        linkedHashSet.add("Coffee");
        linkedHashSet.add("Coffee");
        System.out.println("LinkedHashSet "+linkedHashSet);

        // sort the data
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Tea");
        treeSet.add("Coffee");
        treeSet.add("Soft Drinks");
        treeSet.add("Coffee");
        treeSet.add("Coffee");
        System.out.println("TreeSet "+treeSet);
    }
}
