package oops.classandobjects;

public class Constructor2 {
	
	
	int model;
	int year;
	
	public Constructor2(int model,int year) {
		this.model = model;
		
		
	}

	public static void main(String[] args) {
		
		Constructor2 c = new Constructor2(21,1998);
		
		System.out.println(c.model);

	}

}
