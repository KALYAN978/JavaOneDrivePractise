package exceptions;

public class MultipleCatchBlock {
	
	
	public static void main(String args[]) {
		
		try {
			int a[] = new int[5];
			a[5] = 50/0;
		}catch(ArithmeticException e) {
			System.err.println("Arithmetic exception");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("Parent Exception");
		}
		System.out.println("rest of the code");
	}

}
