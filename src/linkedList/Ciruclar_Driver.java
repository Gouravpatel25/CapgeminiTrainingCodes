package linkedList;

public class Ciruclar_Driver {
	 public static void main(String[] args) {
		   Circular_LL list=new Circular_LL();
		   list.append(10);
		   list.append(20);
		   list.append(30);
		   list.append(40);
		   list.display();
		   list.prepend(80);
		   list.display();
		   list.insertInMiddle(55, 3);
		   System.out.println("Inserted at middle");
		   list.display();
		   list.delete();
		   System.out.println("Deleted at First");
		   list.display();
		   list.deleteAtLast();
		   System.out.println("Deleted last");
		   list.display();
		   list.deletAtMiddle(2);
		   System.out.println("Deleting at middle");
		   list.display();
		   System.out.println(list.searchElement(30));
		   list.update(66,1);
		   list.display();
		   list.reverse();
		  list.display();
		   
		}
}
