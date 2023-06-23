package revision.oop;

public class ChocolateTester {

    public static void main(String[] args) {

        Chocolate chocolate1 = new Chocolate();
        chocolate1.barCode = 101;
        chocolate1.name = "Cadbury";
        chocolate1.weight = 12;
        chocolate1.cost = 10;

        Chocolate chocolate2 = new Chocolate(102, "Hershey's", 24, 50);

        System.out.println(chocolate2.getName());
        System.out.println(chocolate2.getBarCode());
        System.out.println(chocolate2.getCost());
        System.out.println(chocolate2.getWeight());

        // update values for name and cost
        chocolate2.setName("Five Star");
        chocolate2.setCost(100);

        System.out.println("*********************");

        System.out.println(chocolate2.getName());
        System.out.println(chocolate2.getBarCode());
        System.out.println(chocolate2.getCost());
        System.out.println(chocolate2.getWeight());
    }

}
