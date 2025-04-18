package collectionPriorityQueue;

import java.util.*;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		sortByPrice s=new sortByPrice();
		PriorityQueue<Mobile> p = new PriorityQueue<>(s);

		p.add(new Mobile(1,"Apple",80000.0));
		p.add(new Mobile(2,"Redmi",8000));
		p.add(new Mobile(3,"Real me",6799));

		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
	}
}
