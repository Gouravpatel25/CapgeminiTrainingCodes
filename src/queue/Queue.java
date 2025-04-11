package queue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Queue {
	
	private int[] data;
	private int pointer=-1;
	final private int intial_capacity=10;

	Queue(){
		data=new int[intial_capacity]; 
	}
	Queue(int size) {
		data=new int[size];
	}
	
	public boolean insert(int value) {
		
		if(isFull()) {
			data =Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	
	public boolean delete() {
		if(isEmpty()) {
			//throw an exception
			throw new EmptyStackException();
			//System.out.println("Stack is Empty");
		}
		
		System.out.println(data[0]);
		for(int i=1; i<=pointer; i++) {
			data[i-1]=data[i];
		}
		pointer--;
		return true;
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return data[0];
	}
	
	public int getSize() {
		return pointer+1;
	}
	
	public boolean isFull() {
		return data.length-1 == pointer;
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
