package annotation2ReflectionCombined;

public class Task {
	
	@Role("user")
	public void userTask() {
		System.out.println("User task");
	}
	
	@Role("admin")
	public void adminTask() {
		System.out.println("Admin task");
	}
}
