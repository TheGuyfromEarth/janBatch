package basics;


import java.io.*;
import java.util.*;

public class MinimumOperationII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;
        int count = 0;
        while (x < n && y < n) {
            if (x <= y) {
                x = x + y;
            } else {
                y = x + y;
            }
            count++;
        }
        if (n < 100000)
            System.out.print(count);
        else
            System.out.print(count + 1);
    }


}
