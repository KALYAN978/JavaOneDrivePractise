package constructor;

public class Customer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	
	// Creating Getters
	
	public String getName() {
		return name;
	}
	
	public double getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;	
	}
	
	
	// Creating Constructors
	
	
	public Customer() {
		this("nobody", "nobody@capgemini@com");
	}
	
	
	public Customer(String name, String email) {
		this(name, 1000, email);
//		this.name = name;
//		this.email = email;
	}
	
	public Customer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	

	

}
