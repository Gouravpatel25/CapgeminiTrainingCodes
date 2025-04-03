package Algorithms;

import java.util.ArrayList;

public class TwoDArrayMakingZeroes {

	public static void twoDArrayMakingZero(int[][] arr) {
		int rows = arr.length;
        int cols = arr[0].length;

        ArrayList<Integer> rowList = new ArrayList<>(); 
        ArrayList<Integer> colList = new ArrayList<>(); 

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowList.add(i);
                    colList.add(j);
                }
            }
        }

        
        for (int row : rowList) {
            for (int j = 0; j < cols; j++) {
                arr[row][j] = 0;
            }
        }

       
        for (int col : colList) {
            for (int i = 0; i < rows; i++) {
                arr[i][col] = 0;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub	

		int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
		//int[][] arr= {{1,1,1},{1,0,1},{1,1,1}};
		twoDArrayMakingZero(arr);
	}

}
