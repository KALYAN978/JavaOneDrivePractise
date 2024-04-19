package oops;

public class Main {
	
	static void staticMethod() {
		System.out.println("this i static method");
	}
	
	
	public void myPublicMethod(int speed) {
		System.out.println("public methods must be called by creating objects " + speed);
	}
	

	public static void main(String[] args) {
		
		staticMethod();
		
		Main m = new Main();
		m.myPublicMethod(34);
		

	}

}
