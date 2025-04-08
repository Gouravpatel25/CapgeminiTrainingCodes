package stackDS;

public class StackDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack=new Stack();
		
		stack.display();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("PUSH operation");
		stack.display();
		stack.pop();
		System.out.println("POP Operation");
		stack.display();
		System.out.println(stack.peek());
	}

}
