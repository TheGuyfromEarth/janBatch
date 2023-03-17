package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbersList = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbersList.add(100);
        numbersList.add(200);
        numbersList.add(300);
        numbersList.add(400);

        numbersList.addAll(numbers);

        System.out.println(numbersList.contains(180));
        numbersList.clear();
        System.out.println(numbersList.isEmpty());
        System.out.println(numbersList);




//        LinkedList<Integer> numbers1 = new LinkedList<>();
//        List<Integer> numbersList1 = new LinkedList<>();



//        String str = "100";
//        int x = Integer.parseInt(str);
//        System.out.println(x);
//
//        int max = Integer.MAX_VALUE;
//        System.out.println(max);
    }
}

/*
primitive  Wrapper
data type  Classes
int ->     Integer
long ->     Long
float ->    Float
char ->    Character
*/

