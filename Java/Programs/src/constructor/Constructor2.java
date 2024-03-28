package constructor;

public class Constructor2 {

	int x;

	public Constructor2() {
		x = 5;
	}

	public static void main(String[] args) {
		Constructor2 myObj = new Constructor2();
		System.out.println(myObj.x);
	}
}
