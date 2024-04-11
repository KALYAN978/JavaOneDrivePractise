package encapsulation;

public class Encapsulation1 {
	
	private long acc;
	private String name;
	private String email;
	private float amount;
	
	public long getAcc() {
		return acc;
	}
	
	
	public void setAcc(long acc) {
		this.acc = acc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
	
	public static void main(String args[]) {
		
		Encapsulation1 e = new Encapsulation1();
		
		e.setAcc(78623487);
		e.setAmount(8768769f);
		e.setEmail("capgemini@gmail.com");
		e.setName("Capgemini");
		
		
		System.out.println(e.getAcc() + " " + e.getAmount() + " " + e.getEmail() + " " + e.getName() + " " + e.getClass());
		
		
	}
	

}
