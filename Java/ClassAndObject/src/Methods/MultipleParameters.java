package Methods;

public class MultipleParameters {
	
	
	static void myStaticMethod(String sname, int x) {
		System.out.println("This is Static method: ");
	}
	
	public void myPublicMethod() {
		System.out.println("This is public method");
	}
	
	
	public static void main(String args[]) {
		myStaticMethod("Kalyan", 1);
		
		MultipleParameters m = new MultipleParameters();
		
		m.myPublicMethod();
				
	}

}
