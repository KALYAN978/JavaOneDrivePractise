package hashmap;

import java.util.HashMap;

public class GetElements {

	public static void main(String[] args) {
		
		HashMap<String,String> cities = new HashMap<String,String>();
		
		cities.put("One", "1");
		cities.put("two", "2");
		cities.put("Three", "3");
		cities.put("Four", "4");
		cities.put("Five", "5");
		
		for(String i : cities.keySet()) {
			System.out.println(i);
			
		}
		
		System.out.println("\n");
		
		for(String i : cities.values()) {
			System.out.println(i);
		}
		
		System.out.println("\n");
		
		for(String i : cities.keySet()) {
			System.out.println(cities.get(i));
		}
		
		System.out.println(cities);
		
		System.out.println(cities.size());
		
		//Get or Access an Item
		System.out.println(cities.get("One"));
		
		// Delete Or Remove an item from HashMap
		System.out.println(cities.remove("Two"));
		
		cities.clear();
		
		System.out.println(cities);
		
		System.out.println(cities.size());
		
		

	}

}
