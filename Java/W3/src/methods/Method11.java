package methods;

public class Method11 {
	
	
	static void method1(String name,int age) {
		System.out.println(name + " is " + age);
	}
	
	
	
	static int add(int x,int y) {
		return x+y;
	}
	
	
	static void checkAge(int age) {
		if(age < 18) {
			System.out.println("You cannot vote");
		}else {
			System.out.println("You can vote");
		}
	}
	
	public static void main(String []args) {
		
		method1("Capgemini", 12);
		
		System.out.println(add(2,3));
		
		checkAge(28);
	}
	

}
