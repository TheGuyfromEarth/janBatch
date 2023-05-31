package oneDimArrays;

public class MissingNumbers {

    public static void main(String[] args) {

        int range = 8; // consider numbers starting from 0 to 7
        int[] arr = {6,1,0,4,5}; // O/P: 2,3,7

        for(int i = 0; i<range; i++){
            boolean isPresent = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j] == i) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent)
                System.out.print(i+" ");
        }
    }
}
