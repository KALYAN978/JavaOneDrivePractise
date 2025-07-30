import java.util.Scanner;

public class BasicSyntax {
	

	public static void main(String args[]) {
		
		System.out.println("Hi!!, shall we play a game?? Type Yes or No");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = sc.next();
		System.out.println("you have Typed : "+ choice);
		
		if(choice.equals("No")) {
			System.out.println("The game will not start\nand the game will end here");
			sc.close();
			return;
		}
		if(choice.equals("Yes")) {
			System.out.println("Lets Start the game\n");
			System.out.println("Choose any number between 1 to 10");
			
			int n = sc.nextInt();
			
			if(n > 0 || n < 100) {
				System.out.println("Sorry you have entered the wrong nunber\n");
				System.out.println("PLease choose the number between 1 to 10");
				sc.close();
			}else {
				System.out.println("The number you have choosen is : " + n);
				System.out.println("Thanks for playing");
			}
			sc.close();
			
			
		}
		
	}

}
