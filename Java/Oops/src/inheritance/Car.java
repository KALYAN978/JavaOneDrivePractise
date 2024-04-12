package inheritance;

public class Car extends Vehicle{

	private String modelName = "Huas";
	
	
	
	public static void main(String[] args) {
		
		Vehicle c = new Car();
		
		c.honk();
		
		System.out.println(c.brand);
		

	}

}
