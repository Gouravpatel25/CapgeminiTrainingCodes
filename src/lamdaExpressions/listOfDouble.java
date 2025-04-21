package lamdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listOfDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Double> list = new ArrayList<>(List.of(1.25, 2.36, 78.25, 54.94,89.654,1.10));
		 Collections.sort(list, (d1,d2) -> Double.compare(d1, d2));
		 System.out.println(list);
	}

}
