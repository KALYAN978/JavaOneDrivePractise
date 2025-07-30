package exceptions;

public class TestThrow {
	
	
	public static void validate(int age) {
		if(age < 18) {
			throw new ArithmeticException("a new exception has been throwned");
		}else {
			System.out.println("You are eligible");
		}
	}
	 
	
	public static void main(String args[]) {
		validate(13);
		System.out.println("rest of the code will executed");
		
	}

}
