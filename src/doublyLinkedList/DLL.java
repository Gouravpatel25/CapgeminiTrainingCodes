package doublyLinkedList;


public class DLL {
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value=value;
		}
	}
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	public int getSize() {
		Node temp=head;
		int count=0;
		if (isEmpty()) {
			return 0;
		}
		else if(head==tail) {
			return 1;
		}
		else {
			while(temp!=null) {
				temp=temp.next;
				count++;
			}
		}
		return count;

	}
	
	public boolean append(int value) {
		Node node=new Node(value);

		if(isEmpty()) {
			head=node;
			tail=node;
		}
		else
		{
			node.prev=tail; 
			tail.next=node;
			tail=node;
			
		}
		size++;
		return true;
	}
	
	public boolean prepend(int value) {
		Node node= new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		}
		
		else {
			node.next=head;
			head.prev=node;
			head=node;
		}
		size++;
		return true;


	}
	
	public boolean insertInMiddle(int value,int index) {
		if(index<=0) {
			return prepend(value);
		}
		else if(index>=size) {
			return append(value);
		}
		else {
			Node node= new Node(value);
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.next=temp;
			node.prev=prev;
			temp.prev=node;
			size++;
			return true;
		}
	}
	
	public boolean delete() {
		if (isEmpty()) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			head=head.next;
			head.prev=null;
		}
		size--;
		return true;
	}
	
	public boolean deleteAtLast() {
		if (isEmpty()) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
		return true;
	}
	
	public boolean deletAtMiddle(int index) {
		if (isEmpty() || index<0 || index>=size) {
			return false;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else if(index==0) {
			return delete();

		}
		else {
			Node temp=head;
			Node prev=null;
			int i=0;

			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=temp.next;
			temp.prev=prev;
		}
		size--;
		return true;
	}
	
	public int searchElement(int data) {
		Node current=head;
		if (isEmpty()) {
			return -1;
		}
		else if(head==tail) {
			head=null;
			tail=null;
		}
		else {
			int index = 0;

		    while (current != null) {
		        if (current.value == data) {
		            return index;
		        }
		        current = current.next;
		        index++;
		    }

		}
		 return -1;
	}
	
	public boolean update(int value, int index) {
	    Node current = head;
	    int pos = 0;

	    while (current != null) {
	        if (pos == index) {
	            current.value = value;
	            return true;
	        }
	        current = current.next;
	        pos++;
	    }

	    return false; // index out of bounds
	}
	
	public void reverseLL() {
		if(isEmpty() || size==1) {
			return;
		}
		
		Node current=tail;
		while(current.prev!=null) {
			System.out.print(current.value+" <->");
			current=current.prev;
		}
		System.out.println();
	}
	
	
	public void display() {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp == tail ? temp.value : temp.value + " <-> ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}
