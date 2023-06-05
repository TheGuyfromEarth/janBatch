package oop;

import java.util.ArrayList;
import java.util.List;

public class CityTourism {

    public static void main(String[] args) {

        City city1 = new City();
        city1.name = "Delhi";
        city1.climateType = "Hot";
        city1.population = 20000000;
        List<String> myAttractions = new ArrayList<>();
        myAttractions.add("Red Fort");
        myAttractions.add("India Gate");
        myAttractions.add("Lotus Temple");
        city1.setAttractions(myAttractions);
        city1.setPerCapitaIncome(283);
        System.out.println(city1.getPerCapitaIncome());

        List<String> list = new ArrayList<>();
        list.add("Gateway of India");
        list.add("Juhu Beach");
        list.add("Marine Drive");

        City city2 =  new City("Mumbai", 17500000,list,"Humid",6500);

        System.out.println(city2.numAttractions());
    }
}
