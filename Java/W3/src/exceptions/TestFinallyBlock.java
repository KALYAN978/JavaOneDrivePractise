package exceptions;

public class TestFinallyBlock {
	
	public static void main(String args[]) {
		
		try {
			//this code doesnt throw any exception
			int a = 25/5;
			System.out.println(a);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("Rest of the code");
	}

}
