package oops.classandobjects;

public class ConstructorOverloading {
	
	
	int id;
	String name;
	int age;
	
	
	//Constructor overloading
	
	public ConstructorOverloading(int id, String n) {
		this.id = id;
		name = n;
	}
	
	
	public ConstructorOverloading(int id,String n, int g) {
		this.id = id;
		name = n;
		age = g;
	}
	
	void display() {
		System.err.println(id + " "+ name+ " " + age);
	}
	
	

	public static void main(String[] args) {

		
		ConstructorOverloading c = new ConstructorOverloading(2, "cap");
		ConstructorOverloading c1 = new ConstructorOverloading(3, "Cap", 767);
		
		c1.display();
		c.display();
	}

}
