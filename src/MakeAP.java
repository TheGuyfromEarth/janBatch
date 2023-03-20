import java.util.Scanner;

public class MakeAP {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int C = input.nextInt();

        int sum = A + C;

        if (sum % 2 == 0)
            System.out.println(sum/2);
        else
            System.out.println(-1);

    }
}
