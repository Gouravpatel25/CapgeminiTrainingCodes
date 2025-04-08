package stackDS;

import java.util.Arrays;

public class Stack {

	private int[] data;
	private int pointer=-1;
	final private int intial_capacity=10;

	Stack(){
		data=new int[intial_capacity]; 
	}

	public boolean push(int value) {
		if(isFull()) {
			data =Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public int pop() {
		if(isEmpty()) {
			//throw an exception
			System.out.println("Stack is Empty");
		}
		
		int returnData=data[pointer];
		pointer--;
		return returnData;
	}
	
	public int peek() {
		return data[pointer];
	}
	
	private boolean isFull() {
		return pointer == data.length-1;
	}
	
	private boolean isEmpty() {
		return pointer==-1;
	}

	public void display() {
		for(int i=0; i<=pointer; i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}

