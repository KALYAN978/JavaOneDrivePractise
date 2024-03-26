package classpart1;

public class Bus {
	
	private String make = "ByBus";
	private String model = "Travels";
	private String color = "Orange";
	private int doors = 2;
	private boolean convertible = true;
	
	
	public void describeBus() {
		System.out.println("doors " + doors +
				color + " " + 
				make + " " +
				model + " " +
				(convertible ? "convertible " : " "));
	}
	
	
	public String getMake() {
		return make;
	}
	
	
	public String getModel() {
		return model;
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
		
		Bus bus = new Bus();
		
		bus.setMake("Bollero");
		bus.setModel("Travels");
		bus.setDoors(2);
		bus.setConvertible(false);
		
		
		System.out.println("make " + bus.getMake());
		System.out.println("Model : " + bus.getModel());
		System.out.println("color : " + bus.getColor());
		

	}

}
