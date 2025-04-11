package queue;

import java.util.EmptyStackException;

import linkedList.singly_LL;

public class QueueUsingLL {
	private singly_LL list; //creating a ref.variable list 
	private int pointer=-1;
	
	
	public QueueUsingLL() {
		list=new singly_LL();  //creating object of singly_LL class
		
	}
	
	public boolean insert(int value) {
		pointer++;
		list.append(value);
		return true;
	}
	
	public int remove() {
		if(list.isEmpty()) {
			throw new EmptyStackException();
		}
		
		int value=list.getValue(0);
		list.delete();
		pointer--;
		return value;
	}
	
	public int peek() {
		return list.getValue(0);
	}
	
	public void display() {
		list.display();
	}
}
