package basics;

public class FunctionDemo {

    // function definition
    public static int add(int x, int y){
        int sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {

        // add two numbers
        int stud1 = add(20,10);
        int stud2 = add(30,30);

        if(stud1>stud2){

        }else{

        }

    }
}

// Benefits of using functions:
// 1) Makes code neat and clean
// 2) Easier to understand
// 3) Function helps to create sectioning
// 4) Helps to easily debug the code
// 5) Helps to avoid redundancy (duplicacy)

// A function has two main parts:
// 1) Function Declaration (Definition)
// 2) Function Call