package Methods;

public class StaticPublicMethods{
	
	
	static void myStaticMethod() {
		System.out.println("This method without creating an object");
	}
	
	public void myPublicMethod() {
		System.out.println("This method can be called Only with help of the object");
	}
	
	
	public static void main(String args[]) {
		
		
		myStaticMethod();
		
		StaticPublicMethods s = new StaticPublicMethods();
		
		s.myPublicMethod();
	}
	
}
