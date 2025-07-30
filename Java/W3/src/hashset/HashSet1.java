package hashset;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> cars = new HashSet<String>();
		
		cars.add("Bollero");
		cars.add("Ferrari");
		cars.add("uhasiu");
		
		
		System.out.println(cars.contains("Bollero"));
		
		cars.remove("Bollero");
		
		System.out.println(cars);
		
		cars.clear();
		
		System.out.println(cars);
		
		cars.size();

	}

}
