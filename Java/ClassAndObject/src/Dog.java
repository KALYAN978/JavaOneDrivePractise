
public class Dog {
	
	String breed;
	int age;
	String color;
	
	
	//Methods to set breed,color, age of the dog
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void printDetails() {
		System.out.println("Dog Details: ");
		System.out.println(this.breed);
		System.out.println(this.age);
		System.out.println(this.color);
		
	}

}
