package doublyLinkedList;

public class DLL_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL list=new DLL();
		System.out.println(list.isEmpty());
		
		list.append(10);
		list.append(20);
		list.append(30);
		list.append(40);
		list.display();
		list.prepend(80);
		list.display();
		list.insertInMiddle(90, 4);
		list.display();
		list.delete();
		list.display();
		list.deleteAtLast();
		System.out.println("delete at last");
		list.display();
		list.deletAtMiddle(2);
		System.out.println("delete at middle");
		list.display();
		System.out.println(list.searchElement(90));
		list.update(88, 2);
		list.display();
		System.out.println("reverse print");
		list.reverseLL();
		//temp=temp.prev;
	}

}
