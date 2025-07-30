package initializingobject;

public class TestAmount {
	
	int acc;
	String name;
	float amount;
	
	
	//Method to initialize Object
	void insert(int a, String n,float amt) {
		acc = a;
		name = n;
		amount = amt;
	}
	
	void deposit(float amt) {
		amount = amount + amt;
		System.out.println(amount);
	}
	
	void withDraw(float amt) {
		if(amount<amt) {
			System.out.println("You have insufficient balance");
		}else {
			amount = amount - amt;
			System.out.println(amount);
		}
	}
	
	
	void checkBalance() {
		System.out.println("Your Balance is : " + amount);
	}
	
	
	void display() {
		System.out.println(acc + " " + name + amount);
	}
	
	
	public static void main(String args[]) {
		 TestAmount ts = new TestAmount();
		 
		 ts.insert(1, "Capgemini", 1000000);
		 ts.display();
		 ts.checkBalance();
		 ts.deposit(8979879);
		 ts.withDraw(988);
		 ts.checkBalance();
	}

}
