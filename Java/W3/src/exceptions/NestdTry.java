package exceptions;

public class NestdTry {

	public static void main(String args[]) {
		
		
		try {
			try {
				System.out.println("going to divide by zero");
				int a = 89/0;
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
			
			try {
				int a[] = new int[10];
				a[10] = 9;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
}
