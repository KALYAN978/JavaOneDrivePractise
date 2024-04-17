package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		String[] cars = {"Volvo","BMW","Ford","Mazda"};
		
		System.out.println(cars[0]);
		
		cars[0] = "dfafs";
		
		System.out.println(cars);
		
		
		String[] carss = {"1","2","3","4","5"};
		for (int i =0; i < cars.length; i++) {
			System.out.println(carss);
		}
		carss[2] = "kjbadkufbo";
		System.out.println(carss[2]);
		
		System.out.println(cars.length);
		System.out.println(carss.length);
		
		
		
		
		
	}
}
