package arrayDeque;

public class SmallestSubArrayWithTarget {

    public static int smallestTargetSum(int[] arr, int tar) {

        for (int windowSize = 1; windowSize <= arr.length; windowSize++) {

            int sum = 0;
            int j = 0;

            for (; j < windowSize; j++) {
                sum += arr[j];
            }

            if (sum >= tar)
                return windowSize;

            for (int i = j; i < arr.length; i++) {

                sum = sum + arr[i] - arr[i - windowSize];

                if (sum >= tar)
                    return windowSize;
            }
        }
        return 0;
    }
}
