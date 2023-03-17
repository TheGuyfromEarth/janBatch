package arrayList;

import java.util.ArrayList;

public class DemoArrayList {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("tomato");
        myList.add("onion");
        myList.add("carrot");
        myList.add("spinach");

//        System.out.println(myList);

        myList.add("beetroot");

        myList.add(3,"brinjal");

        myList.set(4,"sweet potatoes");


//        myList.remove(1);
//        myList.remove("spinach");

//        for(int i=0;i< myList.size();i++){
//            System.out.println(myList.get(i));
//        }

        // for-each loop or enhanced for loop
        for(String str : myList){
            System.out.println(str);
        }

        System.out.println("size:"+myList.size());

    }
}
