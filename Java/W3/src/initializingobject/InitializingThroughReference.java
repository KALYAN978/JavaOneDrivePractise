package initializingobject;

public class InitializingThroughReference {
	
	int id;
	String name;

	public static void main(String[] args) {
		
		InitializingThroughReference in = new InitializingThroughReference();
		
		in.id = 2;
		in.name = "Capgemini";
		System.out.println(in.id);
		System.out.println(in.name);
	}

}
