package Methods;

public class MethodIfElse {
	
	
	
	static void checkAge(int age) {
		
		if (age < 18){
			System.out.println("Access Denied - You are not old enough");
		}
		else {
			System.out.println("Access granted - You can enter");
		}
	}

	public static void main(String[] args) {
		
		
		checkAge(90);

	}

}
