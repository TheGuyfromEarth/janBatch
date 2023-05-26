package oop;

// OOP
public class Player {

    // class variables or attributes
    String name;
    String team;
    int jerseyNumber;
    boolean isRightHanded;
    String type;
    boolean isCaptain;
    int runsScored;

    // class methods
    public void printPlayerDetails() {
        System.out.println(name);
        System.out.println(team);
        System.out.println(jerseyNumber);
        System.out.println(isRightHanded);
        System.out.println(type);
    }

    public void printCricketerType(String type) {
        System.out.println(type + " " + this.type);
    }

    public String playerName(String name) {
        return name + " " + this.name;
    }
}

