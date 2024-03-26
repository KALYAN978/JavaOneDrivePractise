package classpart1;

public class Car {
	
	private String make = "Ferrari";
	private String model = "Model X";
	private String color = "Gray";
	private int doors = 2;
	private boolean convertible = true;
	
	public void describeCar() {
		System.out.println(doors + " Door " + 
				color + " " +
				make + " " + 
				model + " " +
				(convertible ? "Convertible " : " "));
	}
	
	
	public String getMake() {
		return make;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public int getDoors() {
		return doors;
	}
	
	
	public boolean isConvertible() {
		return convertible;
	}
	
	
	

	public static void main(String[] args) {
		
		Car car = new Car();
		
//		car.describeCar();
//		car.make = "posh";
//		car.model = "Carrera";
		
		System.out.println("make " + car.getMake());
		System.out.println("model = " + car.model);
		car.describeCar();
		
		

	}

}
