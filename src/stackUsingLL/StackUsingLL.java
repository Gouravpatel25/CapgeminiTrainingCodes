package stackUsingLL;

import java.util.EmptyStackException;

import linkedList.singly_LL;

public class StackUsingLL {
	private singly_LL list; //creating a ref.variable list 
	private int pointer=-1;
	
	
	public StackUsingLL() {
		list=new singly_LL();  //creating object of singly_LL class
		
	}
	
	public boolean push(int value) {
		pointer++;
		//list.append(value);
		list.prepend(value);
		return true;
	}
	
	public int pop() {
		
		if(list.isEmpty()) {
			throw new EmptyStackException();
		}
		/*
		int value=list.getValue(pointer);
		list.deleteAtLast();
		pointer--;
		return value;
		*/
		
		// OR
		
		int value=list.getValue(0);
		list.delete();
		pointer--;
		return value;
		
	}
	
	public int peek() {
	/*	return list.getValue(pointer);
		    OR  					*/
		return list.getValue(0);
	}
	public void display() {
		list.display();
	}
	
}
