package collectionPriorityQueue;

import java.util.Comparator;

public class sortByPrice<T> implements Comparator<Mobile>  {
	public int compare(Mobile m1,Mobile m2) {
		return Double.compare(m1.getPrice(),m2.getPrice());
	}
}
