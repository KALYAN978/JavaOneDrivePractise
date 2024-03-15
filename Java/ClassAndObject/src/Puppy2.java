
public class Puppy2 {
	
	int puppyAge;
	
	public Puppy2(String name) {
		System.out.println("Name chosen is : "+ name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Puppy's age is : " + puppyAge);
		return puppyAge;
	}
	
	public static void main(String args[]) {
		
		Puppy2 py = new Puppy2("tommy");
		
		py.setAge(32);
		py.getAge();
		
		System.out.println("Variable Value : " + py.puppyAge);
		
		
	}
	
	
	

}
