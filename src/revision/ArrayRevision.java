package revision;

import java.util.Arrays;

public class ArrayRevision {

    public static void main(String[] args) {

        double[] arr = {20, 10, 30, 20.50, 40};

        double[] marks = new double[5]; // arrays are always having fixed memory

//        char[] ch = new char[1];

//        System.out.println(arr.length);

        arr[2] = 34;
//        System.out.println(arr[2]);

//        for(int i = 0; i<arr.length; i++)
//            System.out.print(arr[i] +" ");

        marks[0] = 20;
        marks[1] = 30;
        marks[2] = 30.50;

        for(int i = 0; i<marks.length; i++)
            System.out.print(marks[i] +" ");

        System.out.println(arr);
        Arrays.toString(marks);
        Arrays.fill(marks,100);
        System.out.println(Arrays.toString(marks));

    }
}
