package oneDimArrays;// Given an array, print all the even numbers present in that array
// Ex: arr = {10,8,12,9,11,19,18,22}
// O/P: 10,8,12,18,22

public class EvenNumbers {

    public static void main(String[] args) {

        int[] arr = {10, 8, 12, 9, 11, 19, 18, 22};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.println(arr[i]);
        }
    }
}
