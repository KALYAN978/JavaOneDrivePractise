package stringall;

public class TextBlock {

	public static void main(String[] args) {
		
		
		String bulletIt = " Print a Bulleted List:" + 
		"\t\u2022 First Point" +
				"\t\t\u2022 Sub Point";
		
		System.out.println(bulletIt);
		
		
		
		String textBlock = "Print a Bulleted List: \u2022 First Point		\u2022 Sub Point";

		
		System.out.println(textBlock);
		
		
		int age = 35;
		System.out.printf("Age = %d, Birth year = %d", age);

		
		
		for(int i = 1; i<=100000; i *= 10) {
			System.out.printf("Printing %6d %n", i);
		}
		
		
		String formattedString = String.format("Your age is  %d", age);
		System.out.println(formattedString);
	
	
	
	}

}
