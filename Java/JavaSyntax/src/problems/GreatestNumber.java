package problems;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String args[]) {
		
		System.out.println("lets start finding the greatest number among the three numbers");
		System.out.println("1st Take any three numbers");
		
		Scanner sc = new Scanner(System.in);
		
		double n1 = sc.nextInt();
		double n2 = sc.nextInt();
		double n3 = sc.nextInt();
		
		//lets assume one number is the greatest one
		
		double greatest = n1;
		
		if(greatest < n2) {
			greatest = n2;
		}
		
		if(greatest < n3) {
			greatest = n3;
		}
		
		System.out.println("Displaying the greatest Number : "+ greatest);
	}

}
