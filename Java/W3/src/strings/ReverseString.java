package strings;

import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String originalString = sc.nextLine();
		
		sc.close();
		
		String reversedString = reverseString(originalString);
		
		System.out.println("Reversed String: " + reversedString);
	}
	
	
	public static String reverseString(String str) {
		
		StringBuilder reversed = new StringBuilder();
		
		
		for(int i = str.length() - 1; i >= 0; i--) {
			reversed.append(str.charAt(i));
		}
		
		return reversed.toString();
		
	}

	
	
	
	
	
	


}
