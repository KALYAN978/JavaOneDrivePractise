package inheritance.computerfactory;

public class Product {
	
	private String model;
	private  String manufacturer;
	private int width;
	private int height;
	private int depth;
	
	
	public Product(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	
	
	

}







class Monitor extends Product {
	
	private int size;
	private String resolution;
	
	public Monitor(String model, String manufacturer, int size, String resolution) {
		super(model,manufacturer);
		this.resolution = resolution;
		this.size = size;
		
	}
	
	
	public Monitor(String model, String manufacturer) {
		super(model,manufacturer);
	}
	
	
	public void drawPixelAt(int x, int y, String color) {
		System.out.println(String.format("Drawing pixel at %d, %d in color %s, x", x, y, color));
	}
	
	
}





class Motherboard extends Product {
	
	private int ramSlots;
	private int cardSlots;
	private String bios;
	
	
	public Motherboard (String model, String manufacturer) {
		super(model, manufacturer);
	}
	
	
	public Motherboard(int ramSlots, int cardSlots, String bios,String manufacturer, String model) {
		super(model,manufacturer);
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
	
	
	public void loadProgram(String programName) {
		System.out.println(" Program " + programName + " is now Loading...");
	}
}




class ComputerCase extends Product {
	
	public ComputerCase(String model,String manufacturer) {
		super(model,manufacturer);
	}
}
