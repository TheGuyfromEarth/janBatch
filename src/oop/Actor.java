package oop;

public class Actor {

    String name;
    int numMovies;
    double contractAmount;
    int numSpotBoys;
    static String movieName = "The return of Java";
    int actorId = 0;

    static int numDaysOfWork = 0;
    static int actorIdCounter = 0;

    // Default Constructor
    public Actor(){
//        movieName = "The return of Java";
        actorId = ++actorIdCounter;
    }

    // Parametrised Constructor
    public Actor(String nm, int num, double ca, int spotBoys){
        actorId = ++actorIdCounter;
        name = nm;
        numMovies = num;
        contractAmount = ca;
        numSpotBoys = spotBoys;
    }
}
