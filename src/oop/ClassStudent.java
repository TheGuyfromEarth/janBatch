package oop;

import java.util.Scanner;

public class ClassStudent {
    static Scanner sc = new Scanner(System.in);

    static class Student {
        //Enter your code here
        String name;
        int eng;
        int maths;
        int hindi;
    }

    static Student[] createStudentArray(int n) {
        //Enter your code here

        Student[] arr = new Student[n];

        for (int i = 0; i < n; i++) {
            Student obj = new Student();
            obj.name = sc.next();
            obj.eng = sc.nextInt();
            obj.maths = sc.nextInt();
            obj.hindi = sc.nextInt();

            arr[i] = obj;
        }
        return arr;
    }

    static int engAverage(Student st[], int n) {
        //Enter your code here
        int sum = 0;

        for (int i = 0; i < n; i++) {
            Student obj = st[i];
            int engMarks = obj.eng;
            sum += engMarks;
        }

        int avg = sum / n;
        return avg;
    }

    static int avgPercentageOfClass(Student st[], int n) {
        //Enter your code here
        int avg = 0;

        for (int i = 0; i < n; i++) {
            Student obj = st[i];
            avg += (obj.eng + obj.hindi + obj.maths) / 3;
        }

        int classAvg = avg / n;
        return classAvg;
    }
}