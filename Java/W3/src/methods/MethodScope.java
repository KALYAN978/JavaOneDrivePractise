package methods;

public class MethodScope {
	
	
	
	static int x = 100;
	
	
	static int method(int a) {
		return a+x;
	}

	public static void main(String[] args) {
		
		System.out.println(method(2));
		
		
		
		
		

	}

}
