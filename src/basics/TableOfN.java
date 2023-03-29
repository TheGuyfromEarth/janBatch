// Given N, print the table of N

// Ex: N = 5
// O/P: 5 * 1 = 5
//      5 * 2 = 10
//.................
//      5 * 10 = 50

package basics;

public class TableOfN {

    // without function
//    public static void main(String[] args) {
//
//        int N = 5;
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(N + "*" + i + "=" + N * i);
//        }
//
//    }

    // with function
    public static void main(String[] args) {
        printTable(5);
        printTable(15);
    }

    public static void printTable(int N){
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + "*" + i + "=" + N * i);
        }
    }
}
