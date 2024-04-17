package conditionalstatements;


// Nested ForLoop
public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1; i <=4 ; i++)
		{
			System.out.println(i);
			
			for(int j = 1; j<=7; j++) {
				System.out.println(j);
			}
		}
	}

}
