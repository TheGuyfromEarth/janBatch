// given a sorted array, print the index of first and last occurrence of the given element.
// If the element is not present, then print -1 -1
// If present, then print the indices

// Ex: arr = {1,3,3,5,5,5}, element = 3
// O/P: 1 2
// total count of given element = 2

// Ex: arr = {1,3,3,5,5,5}, element = 5
// O/P: 3 5
// total count of given element = 3

package search;

public class FirstLastOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5, 5, 5};
        int element = 3;

        int firstOcc = firstOccurrence(arr, element);
        int lastOcc = lastOccurrence(arr, element);
        System.out.println(firstOcc+" "+lastOcc);
        System.out.println("total count of given element: "+(lastOcc-firstOcc+1));
    }

    public static int firstOccurrence(int[] arr, int element) {
        int first = 0;
        int last = arr.length - 1;
        int mid = 0;
        int ans = -1;

        while (first <= last) {

            mid = (first + last) / 2;

            if (arr[mid] == element) {
                ans = mid;
                last = mid - 1;
            } else if (arr[mid] < element) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurrence(int[] arr, int element) {
        int first = 0;
        int last = arr.length - 1;
        int mid = 0;
        int ans = -1;

        while (first <= last) {

            mid = (first + last) / 2;

            if (arr[mid] == element) {
                ans = mid;
                first = mid + 1;
            }
            else if (arr[mid] < element) {
                first = mid + 1;
            }
            else {
                last = mid - 1;
            }
        }
        return ans;
    }
}

// {1,3,3,5,5,5}
//  0 1 2 3 4 5

// mid = (first + last)/2 = 4
// ans = 3
// first = mid+1;
// last = mid-1;