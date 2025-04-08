package Algorithms;


/* Input - [5,7,7,8,8,10]

 * Target-8
 * Output-[3,4]
 * Target - 6
 * Output - [-1,-1]

 */


import java.util.Arrays;

public class FirstLastPositionUsingBinarySearch {


    public static int[] checkPos(int[] arr, int target) {
        int[] result = {-1, -1}; 


        result[0] = binarySearch(arr, target, true);
        result[1] = binarySearch(arr, target, false);


        return result;
    }

   
    public static int binarySearch(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid; 
                if (findFirst) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};


        int target1 = 8;
        System.out.println("Target: " + target1  + Arrays.toString(checkPos(arr, target1)));

        int target2 = 6;
        System.out.println("Target: " + target2  + Arrays.toString(checkPos(arr, target2)));
    }
}
