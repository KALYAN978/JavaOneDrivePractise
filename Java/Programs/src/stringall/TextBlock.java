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
		
		
		
		String helloWorld = "HelloWorld";
		System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
		System.err.printf("index of World = %d %n", helloWorld.indexOf("world"));
		
		
		System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
	
	
		
		
		String helloWorldLower = helloWorld.toLowerCase();
		if (helloWorld.equals(helloWorldLower)) {
			System.out.println("Values matches Exactly");
		}
		if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
			System.out.println("Values Matches Ignore Case");
		}
		if (helloWorld.startsWith("Hello")) {
			System.out.println("String Starts with Hello");
		}
		if (helloWorld.endsWith("Hello")) {
			System.out.println("String ends with World");
		}
		if (helloWorld.contains("World")) {
			System.out.println("String contains World");
		}
		if (helloWorld.contentEquals("Hello World")) {
			System.out.println("Values match exactly");
		}
	
	}

}
