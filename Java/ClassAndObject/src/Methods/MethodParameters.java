package Methods;

public class MethodParameters {
	
	static void myMethod(String fname) {
		System.out.println("fname :   " + fname);
	}
	
	
	public void myPublicMethod(String name) {
		System.out.println("This is non-static method  "  + name);
	}
	
	
	
	
	public static void main(String args[]) {
		
		myMethod("This is Static Method");
		
		MethodParameters mp = new MethodParameters();
		
		mp.myPublicMethod("PublicMethod");
	}

}
