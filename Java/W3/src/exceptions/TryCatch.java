package exceptions;

import java.util.Scanner;

public class TryCatch {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		try {
		
		float c = a/b;
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(a/(b+2));
		}
		
		
		
		
	}
}
