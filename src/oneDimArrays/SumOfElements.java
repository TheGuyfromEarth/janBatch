package oneDimArrays;// Given an array, find the sum of all the elements present in the array
// Ex: arr = [10,20,5,15]
// O/P: 50

public class SumOfElements {

    public static void main(String[] args) {

        int[] arr = {10,20,5,15,10};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
