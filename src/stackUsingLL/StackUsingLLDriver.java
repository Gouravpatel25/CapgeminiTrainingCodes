package stackUsingLL;

public class StackUsingLLDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingLL stack=new StackUsingLL();
		
		stack.push(10);
		stack.push(50);
		stack.push(30);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		stack.display();
		}

}
