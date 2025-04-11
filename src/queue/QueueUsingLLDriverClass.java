package queue;

public class QueueUsingLLDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingLL q=new QueueUsingLL();
		
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		q.display();
		System.out.println(q.remove());
		q.display();
		System.out.println(q.peek());
	}

}
