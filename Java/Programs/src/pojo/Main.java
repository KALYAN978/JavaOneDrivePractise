package pojo;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			LPAStudent s = new LPAStudent("345365" + i, switch (i) {
			case 1 -> "Mary";
			case 2 -> "Thomas";
			case 3 -> "Harry";
			case 4 -> "Ruby";
			case 5 -> "Lisa";
			default -> "Unexpected value: ";
			}, "05/11/2143", "Java MasterClass");
			System.out.println(s);
		}
		
		
		
		Student pojoStudent = new Student("S934983497", "siav",
				"05/11/1343","JavaMasterClass");
		
		
		LPAStudent  recordStudent = new LPAStudent("s8u987", "Bill",
				"04/34/3453", "JavaMasterClass");
		
		
		System.out.println(pojoStudent);
		
		System.out.println(recordStudent);
		
		
//		System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
	}

}
