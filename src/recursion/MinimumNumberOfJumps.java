package recursion;

public class MinimumNumberOfJumps {

    static int minCount = Integer.MAX_VALUE;

    public static void main(String[] args) {

//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        minJumps(arr,0,0);
        System.out.println(minCount);
    }

    public static void minJumps(int[] arr, int currIndex, int count){
        if(currIndex >= arr.length-1) {
            if(count < minCount)
                minCount = count;
            return;
        }

        int val = arr[currIndex];
        for(int i = currIndex+1;i<=currIndex+val;i++)
            minJumps(arr,i,count+1);
    }
}
