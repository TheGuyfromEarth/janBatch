package oop;

import java.util.List;

public class City {

    public String name;
    int population;
    private List<String> attractions;
    String climateType;
    private double perCapitaIncome;

    public City(){

    }

    public City(String name, int population, List<String> attractions, String climateType, double perCapitaIncome){
        this.name = name;
        this.population = population;
        this.attractions = attractions;
        this.climateType = climateType;
        this.perCapitaIncome = perCapitaIncome;
    }

    // returns the number of tourist attractions
    public int numAttractions(){
        return attractions.size();
    }

    // calculate the approx (avg) worth of the place
    public double calculateValue(){
        return population*perCapitaIncome;
    }

    // Getters and Setters

    public void setAttractions(List<String> list){
        this.attractions = list;
    }

    public List<String> getAttractions(){
        return this.attractions;
    }

    public void setPerCapitaIncome(double perCapitaIncome){
        if(perCapitaIncome>=0)
            this.perCapitaIncome = perCapitaIncome;
    }

    public double getPerCapitaIncome(){
        return this.perCapitaIncome;
    }
}


// Features Of OOP:

// 1) Abstraction
// 2) Encapsulation
// 3) Polymorphism
// 4) Inheritance


// Access Specifiers