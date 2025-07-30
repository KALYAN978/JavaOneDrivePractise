import java.util.Scanner;

public class OperatorSyntax {
	
	public static void main(String args[]) {
		
		System.out.println("Hi welcome back");
		
		System.out.println("Lets add two Numbers");
		
		int a = 100;int b = 344;int c;
		c = a+b;
		System.out.println(c);
		
		System.out.println("lets do something crazy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose any number from 1 to 10");
		int n = sc.nextInt();
		
		if(n > 0 && n < 11 ) {
			System.out.println("The number you have entered is : " + n);
			sc.close();
			return;
		}else {
			System.out.println("You have choosen the number which is out of range\nsorry");
			sc.close();
		}
		return;
		
	}

}
