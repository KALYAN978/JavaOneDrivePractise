package Operators;

public class AssignmentOperator {
	

	public static void main(String args[]) {
		
		System.out.println("Now lets see how to use AssignmentOperator");
		
		int a = 23;
		System.out.println(a += 5);
		System.out.println(a -= 6);
		System.out.println(a *= 7);
		System.out.println(a /= 8);
		System.out.println(a %= 9);
		
		
		
		int b =10; int c = 34; int d = 35;
		if(b>c) {
			System.out.println("print Right");
		}else {
			System.out.println("print Wrong");
		}if(d>c) {
			System.out.println("print Right");
		}else {
			System.out.println("print wrong");
		}if(d>b) {
			System.out.println("print Right");
		}else {
			System.out.println("Print wrong");
		}
		
		if(b>c && b >d) {
			System.out.println("b is greater than all");
		}else{
			System.out.println("b is not greater among the three");
		}if(c>b && c>d) {
			System.out.println("C is greater than all");
		}else {
			System.out.println("C is not greater than all");
		}if(d>b && d>c) {
			System.out.println("d is greater than all");
		}else {
			System.out.println("d is not greater than all");
		}
		
		
		
		int u = 10;
		int f = 20;
		
		u += 5;
		f -= 5;
		
		System.out.println(u);
		System.out.println(f);
		
		
		
		}
}
