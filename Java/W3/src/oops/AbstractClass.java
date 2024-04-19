package oops;



abstract class Mainn{
	
	public String fname = "John";
	public int age = 24;
	public abstract void study();    //Abstract Method 
}



class Primary extends Mainn{
	
	public int graduation = 20139;
	
	@Override
	public void study() {    //the body of the abstract method is written here
		System.out.println("Studying all day long");
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		Primary p = new Primary();
		
		System.out.println(p.age);
		System.out.println(p.fname);
		System.out.println(p.graduation);
		
		p.study();

	}

}
