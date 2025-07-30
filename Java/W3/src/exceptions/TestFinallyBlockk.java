package exceptions;

public class TestFinallyBlockk {

	public static void main(String[] args) {
		
		
		
		try {
			int a = 70/0;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally will always be executed");
		}
		
		
		
//		try {
//			
//			int a = 50/0;
//			System.out.println(a);
//		}catch(ArithmeticException e){
//			System.out.println(e);
//		}finally {
//			System.out.println("finally will always be executed");
//		}

	}

}
