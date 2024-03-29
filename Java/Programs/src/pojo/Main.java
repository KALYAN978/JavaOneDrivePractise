package pojo;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			Student s = new Student("345365" + i, switch (i) {
			case 1 -> "Mary";
			case 2 -> "Thomas";
			case 3 -> "Harry";
			case 4 -> "Ruby";
			case 5 -> "Lisa";
			default -> "Unexpected value: ";
			}, "05/11/2143", "Java MasterClass");
			System.out.println(s);
		}

	}

}
