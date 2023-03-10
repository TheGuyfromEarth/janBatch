public class Demo {

    public static void main(String[] args) {

        int n = 10;

        // print numbers from 1 to n
        for(int i=1; i<=n;i++){
            System.out.println(i);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
