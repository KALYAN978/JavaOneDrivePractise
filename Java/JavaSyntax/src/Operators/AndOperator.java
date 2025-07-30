package Operators;

public class AndOperator {
	
	//It is only True when the both conditions are true.
	
	public static void main(String args[]) {
		
		int a = 10;
		int b = 4;
		int c = 20;
		
		System.out.println(a<b && a>c);
		System.out.println(a<b&&a++<c);
		System.out.println(a);
		
	// Ternary Operator
		
		int min = (a<b)?a:b;
		System.out.println(min);
		
		
	}

}
