package exceptions;

public class Exception2 {
	
	public static void main(String args[]) {
		
		try {
		int a = 60/0;
		
		}
		catch(Exception e) {
			
			// Generating the exception in catch block
			
			int dat = 60/0;
		}
		
		System.out.println("rest of the code");
	}

}
