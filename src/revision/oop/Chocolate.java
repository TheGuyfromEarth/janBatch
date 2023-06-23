package revision.oop;

public class Chocolate {

    int barCode;
    String name;
    double weight;
    double cost;

    // default constructor
    public Chocolate(){
    }

    // parametrized constructor
    public Chocolate(int barCode, String name, double weight, double cost){
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Getter Methods
    public int getBarCode(){
        return this.barCode;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName(){
        return this.name;
    }

    // Setter Methods
    public void setBarCode(int barCode){
        this.barCode = barCode;
    }

    public void setName(String name){
        this.name = name;
    }
}
