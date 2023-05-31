package twoDimArrays;

import java.io.*;

public class KinematicMatrix {
    public static void main(String[] args) throws Exception {
        // Your code here
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String[] lengthArr = br.readLine().split(" ");

        int n = Integer.parseInt(lengthArr[0]);
        int m = Integer.parseInt(lengthArr[1]);

        if (n != m) {
            System.out.println("No");
            return;
        }

        int arr[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] elementArr = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(elementArr[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }
}
