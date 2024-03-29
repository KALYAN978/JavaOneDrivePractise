package java.lang.object;

public class Main extends Object{

	public static void main(String[] args) {
		
		
		Student s = new Student("max",23);
		
		System.out.println(s.toString());

	}

}



class Student{
	
	private String name;
	private int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
