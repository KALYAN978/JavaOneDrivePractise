
public class BreakWithInfiniteWhileLoop {

	public static void main(String[] args) {
		
		int x = 10;
		
		while(true) {
			System.out.println("Value of x : "+ x);
			x++;
			
			if(x == 15) {
				break;
			}
			System.out.println("\n");
		}
		
		

	}

}
