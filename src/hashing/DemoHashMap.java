package hashing;

import java.util.*;

public class DemoHashMap {

    public static void main(String[] args) {

        // to store marks of students against their roll numbers
        HashMap<Integer, Double> scoreMap = new HashMap<>();
        scoreMap.put(1, 90.50);
        scoreMap.put(3, 80.50);
        scoreMap.put(2, 81.00);
        scoreMap.put(4, 100.00);
        scoreMap.put(5, 70.00);

        scoreMap.remove(4);
        scoreMap.put(5, 88.50);
        scoreMap.put(10, 88.50);


        Set<Integer> rollNumbers = scoreMap.keySet();
        System.out.println(rollNumbers);

        // return the marks of student with roll no - 2;
//        System.out.println(scoreMap.get(2));

        // print all students' marks along with their roll numbers
        Set<Integer> rollNumberSet = scoreMap.keySet();

        for (int key : rollNumbers) {
            System.out.println(key + "->" + scoreMap.get(key));
        }

//        System.out.println(scoreMap);

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
    }
}
