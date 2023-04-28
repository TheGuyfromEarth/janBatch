package search;

import java.util.Scanner;

public class CloseToRight {

        static int low;
        static int mid;
        static int high;
        static int index;

        public static void main (String[] args) {
            // Your code here
            Scanner input = new Scanner(System.in);
            int size = input.nextInt();
            int size2 = input.nextInt();
            long array[] = new long[size];
            long temp = 0;
            long max = 0;

            for(int i=0; i<size; i++){
                array[i] = input.nextInt();
                if(array[i]>max)
                    max = array[i];
            }

            // Arrays.sort(array);

            for(int i=0; i<size2; i++){
                temp = input.nextLong();
                if(temp<max)
                    System.out.println(search(array, temp));
                else
                    System.out.println(array.length);
            }
        }

        public static int search(long array[], long k){
            low = 0;
            high = array.length-1;
            index = array.length;
            while(low <= high){
                mid = low+(high-low)/2;
                if(array[mid] == k){
                    index = mid;
                    if(mid<array.length-1 && array[mid+1]!=k)
                        return index+1;
                    else
                        low = mid+1;
                }
                else if(array[mid] < k){
                    low = mid+1;
                }
                else{
                    index = mid;
                    high = mid-1;
                }
            }
            return index;
        }
    }
