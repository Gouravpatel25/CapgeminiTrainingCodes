package collectionHashsetsortUsingComparator;

import java.util.TreeSet;

public class BookDriver {
    public static void main(String[] args) {

        sortByPrice p = new sortByPrice(); //creating the comparator object
        TreeSet<Book> set = new TreeSet<>(p); //passing the comparator object in the TreeSet. 

        Book b1 = new Book(200, "DSA", 856);
        Book b2 = new Book(5, "Networks", 690);

        set.add(b1);
        set.add(b2);

        System.out.println(set);
    }
}
