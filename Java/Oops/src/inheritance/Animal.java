package inheritance;

public class Animal {
	
	private String type;
	private String size;
	private double weight;
	
	
	
	public Animal() {
		
	}
	
	
	public Animal(String type, String size, double weight) {
		this.type = type;
		this.size = size;
		this.weight = weight;
	}
	
	
	

	@Override
	public String toString() {
		return "Animal [type=" + type + ", size=" + size + ", weight=" + weight + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	public void move(String speed) {
		System.out.println(type + " moves " + speed);
	}


	
	public void makeNoise() {
		System.err.println(type + " Make some kind of weird noise ");
	}


	public static void main(String[] args) {

	}

}
