package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomNumbers {
    public static void main(String[] args) {
        
    	List<Integer> list = Arrays.asList(7, 5, 6, 8, 4, 5, 2, 3, 1); // Corrected here
    	/*
        List<Integer> list2 = new ArrayList<>();

        for (Integer i : list) {
            if (i % 2 == 0) {
                list2.add(i);
            }
        }

        System.out.println(list2);
        */
    	
    	//Filtering even numbers from list using stream
    	List<Integer> list2 = list.stream().filter( i -> i % 2 == 0).toList();
    	System.out.println(list2);
    	
    	//Doubling the elements of list using Stream
    	List<Integer> list3 = list.stream().map( i -> i * 2 ).toList();
    	System.out.println(list3);
    	
    	
    }
}
