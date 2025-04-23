package generics;

import java.util.LinkedList;

public class Wildcards2LinkedList {
	public static void printLinkedList(LinkedList<? super Integer> list)
	{
		list.add(10);
		for(Object i:list)
		{
			System.out.print(i+" ");
		}
		Object i=list.get(0);
	}

	public static void main(String[] args) {
		LinkedList<Integer> list1=new LinkedList<Integer>();
		list1.add(2);
		list1.add(3);

		printLinkedList(list1);
	}
}
