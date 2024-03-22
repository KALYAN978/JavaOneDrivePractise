package Methods;

public class ReturnValues1 {
	
	static int myMethod(int x, int y) {
		return x + y;
	}
	
	
	static int add(int a, int b) {
		return a + b;
	}
	
	
	public int sub(int q, int z) {
		return q-z;
	}
	
	

	public static void main(String[] args) {

		System.out.println(myMethod(34, 45));
		
		add(23, 34);
		
		
		ReturnValues1 r = new ReturnValues1();
		
		r.sub(334,556);
		
		
	}

}
