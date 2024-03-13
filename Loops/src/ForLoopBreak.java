
public class ForLoopBreak {

	public static void main(String[] args) {
		
		int numbers[] = {10,20,30,40,50,60,70,80,90};
		
		for(int i =0; i < numbers.length; i++) {
			if(numbers[i] == 60) {
				break;
			}
			System.err.println("Printing the numbers : " + numbers[i]);
		}
		
		
		
		

	}

}
