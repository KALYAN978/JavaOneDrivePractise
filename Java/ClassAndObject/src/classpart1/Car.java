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
	
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}
	
	
	

	public static void main(String[] args) {
		
		Car car = new Car();
		
//		car.describeCar();
		
		car.setMake("Porsche");
//		car.make = "posh";
		
		car.setModel("Carrera");
//		car.model = "Carrera";
		
		car.setColor("black");
		
		car.setDoors(2);
		
		car.setConvertible(true);
		
		
		System.out.println("make " + car.getMake());
		System.out.println("model = " + car.model);
		car.describeCar();
		
		

	}

}
