package initializingobject;

public class InitializeThroughMethod {

	int roll;
	String name;
	
	void insertRecord(int r,String n) {
		this.roll = r;
		this.name = n;
	}
	
	
	void displayInformation() {
		System.out.println(roll + " " + name);
	}
	
	
	public static void main(String[] args) {
		
		InitializeThroughMethod im = new InitializeThroughMethod();
		
		im.insertRecord(3, "Cap");
		im.displayInformation();
		

	}

}
