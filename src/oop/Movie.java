package oop;

public class Movie {

    public static void main(String[] args) { // command line arguments

        System.out.println(args[0]);
        System.out.println(args[1]);

        Actor actor1 = new Actor();
        actor1.name = "Akshay";
        actor1.contractAmount = 110000000;
        actor1.numMovies = 190;
        actor1.numSpotBoys = 6;
//        actor1.movieName = "The return of Java";


        Actor actor2 = new Actor();
        actor2.name = "Hritik";
        actor2.contractAmount = 90000000;
        actor2.numMovies = 40;
        actor2.numSpotBoys = 5;
//        actor2.movieName = "The return of Java";
        System.out.println(Actor.movieName);

        Actor actor3 = new Actor("Vidyut", 15, 10000000, 3);

//        System.out.println(actor3.actorId);
        System.out.println(Actor.actorIdCounter);

    }
}

// Constructor
// 1) A special method where method name is same as the class name
// 2) Helps to create an object
// 3) It is of two types:
//      3a) Default Constructor : Created by java itself (Can be created by user as well)
//      3b) Parametrised Constructor : Created by user only (helps to create object and initialise values at time of obj creation)