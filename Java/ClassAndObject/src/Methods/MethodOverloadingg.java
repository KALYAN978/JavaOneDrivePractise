package Methods;

public class MethodOverloadingg {
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("player " + playerName + "scored " + score + "points");
		return score * 1000;
	}
	
	
	public static int calculateScore(int score) {
		return score * 1000;
	}
	
	

	public static void main(String[] args) {
		
		int newScore = calculateScore("Ronaldo", 100);
		System.out.println("New Score is " + newScore);
		
		
		calculateScore(75);
		calculateScore("Hundred",100);
	}
	
	
//	public static int calculateScore() {
//		System.out.println("Unnamed player scored " + score + " points");
//		
//	}
	
	
	

}
