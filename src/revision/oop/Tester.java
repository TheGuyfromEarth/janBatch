package revision.oop;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Point p1 = new Point();
        Scanner input = new Scanner(System.in);

        p1.setX(input.nextDouble());
        p1.setY(input.nextDouble());

        System.out.println("The distance of p1 from the origin is "+p1.distance());

        Point p2 = new Point(input.nextDouble(),input.nextDouble());
        System.out.println("The distance of p1 from p2 is "+p2.distance(p1));

    }
}
