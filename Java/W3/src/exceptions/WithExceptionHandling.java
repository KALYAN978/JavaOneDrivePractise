package exceptions;

public class WithExceptionHandling {
	
	public static void main(String args[]) {
		
		try {
		
		int a = 50/0;
		}
		catch(Exception e) {
			System.out.println("Cant divide number by Zero");
		}
	}

}
