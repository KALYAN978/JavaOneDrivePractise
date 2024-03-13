
public class NestedForLoop {

	public static void main(String[] args) {
		
		int num = 1;
		
		int i = 1;
		
		for(num =1; num <=10; num++) {
			System.out.println("The value of Num is: "+ num);
			
			for(i = 1;i<= 10; i++) {
				System.out.println(num * i);
			}
			
			System.out.println("\n");
		}

	}

}
