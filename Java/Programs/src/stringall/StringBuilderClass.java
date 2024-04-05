package stringall;

public class StringBuilderClass {
	
	
	
	
	
	public static void printInformation(String string) {
		
		System.out.println("String = " + string);
		System.out.println("length = " + string.length());
		
	}
	
	public static void printInformation(StringBuilder builder) {
		System.out.println("StringBuilder = " + builder);
		System.out.println("length = " + builder.length());
	}

	public static void main(String[] args) {
		
		String helloWorld = "Hello"  + "World";
		
		// We cant assign String literal to StringBuilder Variable
		// For this We have to assign a constructor
		
		
		
		StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
		printInformation(helloWorld);
		printInformation(helloWorldBuilder);

	}

}
