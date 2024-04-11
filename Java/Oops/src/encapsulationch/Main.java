package encapsulationch;

public class Main {

	public static void main(String[] args) {
		
		
		
		Printer printer = new Printer(50, 0, true);
		System.out.println("Initial page Count = " + printer.getPagesPrinted());
		
		
		
		int pagesPrinted = printer.printPages(5);
		System.out.printf("Current Job Pages: %d, Printer Total: %d %n",printer.getPagesPrinted());
	}

}
