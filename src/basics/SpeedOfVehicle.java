// Given the distance covered by a car and the time taken to cover that distance,
// find the speed of the car.

// Ex: dist = 100 km
// time = 2 hrs

// O/P -> speed = 50 km/hr

package basics;

public class SpeedOfVehicle {

    // without function
//    public static void main(String[] args) {
//        int dist = 100;
//        int time = 2;
//        int speed = 0;
//
//        speed = dist / time;
//
//        System.out.println(speed + " km/hr");
//    }

    public static void main(String[] args) {
        int dist = 100;
        int time = 2;
//        int speed = speed(dist,time);
//        System.out.println(speed+ " km/hr");

        System.out.println(speed(dist, time)+ " km/hr");
    }

    public static int speed(int dist, int time){
        int speed = dist/time;
        return speed;
    }

}
