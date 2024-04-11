package encapsulationch;

public class Printer {

	
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerLevel,int pagesPrinted, boolean duplex) {
		this.pagesPrinted = pagesPrinted;
		this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
		this.duplex = duplex;
	}
	
	public int addToner(int tonerAmount) {
		
		int tempAmount = tonerAmount + tonerLevel;
		if (tempAmount > 100 || tempAmount < 0) {
			return -1;
		}
		
		tonerLevel += tonerAmount;
		return tonerLevel;
	}
	
	
	
	public int printPages(int pages) {
		int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
		return jobPages;
	}
	
	
	public int getPagesPrinted() {
		return pagesPrinted;
	}
	
	
	

}
