package hashMap;

import java.util.LinkedList;
import java.util.Objects;

public class HashMap {

	private LinkedList<Node>[] buckets;
	private int n; // no of nodes
	private int N; //total no of buckets

	public HashMap() {
		N=4;
		buckets=new LinkedList[N];

		for(int i=0; i<buckets.length; i++) {
			buckets[i]=new LinkedList<>();
		}
	}

	public void put(int key, String value) {
		int bi=hashFunction(key);
		int di=getDataIndex(bi,key);

		if(di != -1) { //if key is present 
			buckets[bi].get(di).value=value;
		}
		else {
			buckets[bi].add(new Node(key,value));
			n++;
		}

		double lamda = (double)n/N;
		if(lamda>2.0) {
			rehash();
		}

	}
	
	public String get(int key) {
	    int bi = hashFunction(key);        // Get the bucket index
	    int di = getDataIndex(bi, key);    // Get the index within the linked list

	    if (di != -1) {
	        return buckets[bi].get(di).value;
	    } else {
	        return null;
	    }
	}

	public boolean containsKey(int key) {
	    int bi = hashFunction(key);       // Find the bucket index
	    int di = getDataIndex(bi, key);   // Find the index in the linked list

	    return di != -1;                  // If index is -1, key doesn't exist
	}


	public void rehash() {
		LinkedList<Node>[] old=buckets;
		buckets=new LinkedList[N*2];

		for(int i=0; i<buckets.length; i++) {
			buckets[i]=new LinkedList<>();
		}
		n=0;
		for(int i=0; i<old.length; i++) {
			LinkedList<Node> list=old[i];
			for(int j=0 ;j<list.size(); j++) {
				Node node=list.get(j);
				put(node.key,node.value);
			}
		}

	}

	private int getDataIndex(int bi,int key) {
		LinkedList<Node> list=buckets[bi];
		for(int i=0; i<list.size(); i++) {
			Node node=list.get(i);
			if(node.key == key) {
				return i;
			}
		}

		return -1;

	}

	private int hashFunction(int key) {
		int hashcode=Objects.hash(key);
		hashcode=Math.abs(hashcode);

		return hashcode % buckets.length;
	}


	private class Node{
		int key;
		String value;

		Node(int key,String value){
			this.key=key;
			this.value=value;
		}


	}

	public void display() {
		// TODO Auto-generated method stub
		for(int i=0; i<buckets.length; i++) {
			LinkedList<Node> list = buckets[i];
			for(int j=0; j<list.size(); j++) {
				Node node=list.get(j);
				System.out.println("Key : " + node.key +" Value : "+ node.value);
			}
		}
	}
	
	public int getSize() {
	    return n;
	}


}


