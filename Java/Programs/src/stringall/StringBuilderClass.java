package stringall;

public class StringBuilderClass {
	
	
	
	
	
	public static void printInformation(String string) {
		
		System.out.println("String = " + string);
		System.out.println("length = " + string.length());
		
	}
	
	public static void printInformation(StringBuilder builder) {
		System.out.println("StringBuilder = " + builder);
		System.out.println("length = " + builder.length());
		
		StringBuilder builderPlus = new StringBuilder("Hello" + "World");
		builderPlus.append("and GoodBye");
		
		builderPlus.deleteCharAt(16).insert(16, 'g');
		System.out.println(builderPlus);
		
		builderPlus.replace(16, 17, "G");
		
		
		builderPlus.reverse().setLength(7);
		System.err.println(builderPlus);
		
		
		
		
		String helloWorld = "Hello"  + "World";
		
		helloWorld.concat("and GoodBye");
		
		// We cant assign String literal to StringBuilder Variable
		// For this We have to assign a constructor
		
		
		
		StringBuilder helloWorldBuilder = new StringBuilder("Hello" + "World");
		helloWorldBuilder.append(" and GoodBye");
		printInformation(helloWorld);
		printInformation(helloWorldBuilder);

	}

}
