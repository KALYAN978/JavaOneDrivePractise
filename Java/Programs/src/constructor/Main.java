package constructor;

public class Main {

	public static void main(String[] args) {
		
		Customer cst = new Customer("Tim",1000,"capgemini@gmail.com");
		
		System.out.println(cst.getName());
		System.out.println(cst.getCreditLimit());
		System.out.println(cst.getEmail());
		
		
		Customer cs2  = new Customer("Cap", 12020, "cap@gemini");
		
		
		cs2.getName();
		cs2.getCreditLimit();
		cs2.getEmail();

	}

}
