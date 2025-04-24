package annotation2ReflectionCombined;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter role: ");
		String role = sc.nextLine();

		System.out.println("Enter the method that you want to call: ");
		String method_name = sc.next();

		Task task = new Task();

		userValidCheck(role, method_name, task);
		sc.close();
	}

	public static void userValidCheck(String role_by_user, String method_name, Task t)
			throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
		Class<Task> c = Task.class;
		Method m = c.getMethod(method_name);

		if (m.isAnnotationPresent(Role.class)) {
			Role role = m.getAnnotation(Role.class);
			if (role.value().equals(role_by_user)) {
				m.invoke(t); // Fixed this line
			} else {
				System.out.println("Role is not valid... Don't have access");
			}
		} 	
	}
}
