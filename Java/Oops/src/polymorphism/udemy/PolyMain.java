package polymorphism.udemy;


import java.util.Scanner;

public class PolyMain {

	public static void main(String[] args) {
		
//		Movie movie = Movie.getMovie("ScienceFiction","Star Wars");
//		
//		movie.watchMovie();
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Type (A for Adventure, C for Comedy, S for ScienceFiction, or Q to quit)");
			String type = sc.nextLine();
			if("Qq".contains(type)) {
				break;
			}
		}
		
		

	}

}
