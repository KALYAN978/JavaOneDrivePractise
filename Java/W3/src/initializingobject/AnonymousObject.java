package initializingobject;

public class AnonymousObject {
	
	void fact(int n) {
		int fact = 1;
		for(int i = 0; i<=n; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		
	}

	public static void main(String[] args) {
		
		new AnonymousObject().fact(4);

	}

}
