package linkedList;

public class SLL_Driver {
	public static void main(String[] args) {
		   singly_LL list=new singly_LL();
		   list.append(10);
		   list.append(20);
		   list.append(30);
		   list.append(40);
		   list.prepend(50);
		   list.insertInMiddle(60, 3);
		   list.display();
		   
		   list.delete();
		   list.display();
		   list.deleteAtLast();
		   list.display();
		   list.deletAtMiddle(2);
		   list.display();
		   System.out.println("Size of LinkedList "  +list.getSize());
		   list.reverse();
		   list.display();
		   System.out.println(list.searchElement(10));
		   System.out.println(list.getValue(1));
		   
		  
		 }
}
