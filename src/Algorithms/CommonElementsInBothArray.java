package Algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsInBothArray {
    
    public static void checkCommonEle(int[] arr1, int[] arr2) {
       
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        
        for (int num : arr1) {
            set1.add(num);
        }

       
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);  
            }
        }

        System.out.println("Common Elements: " + common);
    }

    public static void main(String[] args) {
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};

        checkCommonEle(arr1, arr2);
    }
}
