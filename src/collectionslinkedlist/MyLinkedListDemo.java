package collectionslinkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));
        System.out.println(list.contains(60));
        System.out.println(list.remove(0));
        list.addFirst(80);
        System.out.println(list);
        list.addLast(65);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
