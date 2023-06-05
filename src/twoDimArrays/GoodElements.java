package twoDimArrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GoodElements {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String[] arr = br.readLine().split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);

            int count = 0;

            int maxElement = Integer.MIN_VALUE;
            int minElement = Integer.MAX_VALUE;

            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                String[] rowElements = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(rowElements[j]);
                    if (matrix[i][j] > maxElement) {
                        maxElement = matrix[i][j];
                    }

                    if (matrix[i][j] < minElement) {
                        minElement = matrix[i][j];
                    }
                }
            }

            List<Integer> badRows = new ArrayList();
            List<Integer> badCols = new ArrayList();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (matrix[i][j] == maxElement || matrix[i][j] == minElement) {
                        badRows.add(i);
                        badCols.add(j);
                    }
                }
            }


            for (int i = 0; i < n; i++) {
                if (badRows.contains(i))
                    continue;
                for (int j = 0; j < m; j++) {
                    if (!badCols.contains(j))
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
