// Given an array and N, it will have all numbers starting from 1 to N,
// except that one number would be missing, find that number.

// Ex: N = 5, arr = {1,2,3,5}
// O/P: 4

// Ex: N = 4, arr = {4,1,2}
// O/P: 3

package oneDimArrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int N = 5;

        int sumOfNatNos = (N*(N+1))/2;

        int sumOfArr = 0;
        for(int x:arr){
            sumOfArr = sumOfArr + x;
        }

        System.out.println(sumOfNatNos - sumOfArr);
    }
}
