package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2DArray {
    
    public static int[] checkIn2D(int[][] arr, int n) {
        int[] pos = {-1, -1}; 

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == n) {
                    pos[0] = i;
                    pos[1] = j;
                    return pos; 
                }
            }
        }

        return pos; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
            {1, 5}, {895, 14}, {963, 45}
        };
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        
        int[] poss = checkIn2D(arr, target);
        
        System.out.println(Arrays.toString(poss)); 
        sc.close();
    }
}
