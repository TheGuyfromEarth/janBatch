package revision;

public class Loops {

    public static void main(String[] args) {

        // for loop
//        for (int i = 1; i <= 5; i++) { // i = 6
//            System.out.println("Java is a programming language");
//        }

        // while loop
//        int i = 1;
//
//        while (i <= 5) {
//            System.out.println("Java is a programming language");
//            i++;
//        }

        // do while loop
//        int i = 1;
//        do {
//            System.out.println("Java is a programming language");
//            i++;
//        }
//        while (i < -1) ;


        int[] arr = {10,20,40,60};

//        for(int i=0;i<arr.length;i++)
//            System.out.print(arr[i]+" ");

        // for-each loop or enhanced for loop
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        System.out.println(sum);
    }
}

// Types of Loops
// 1) for loop
// 2) while loop
// 3) do while loop

// Structure of any loop
// a) Initialization
// b) Condition
// c) Increment/Decrement
// d) Body of the loop