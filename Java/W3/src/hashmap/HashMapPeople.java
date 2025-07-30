package hashmap;

import java.util.HashMap;

public class HashMapPeople {
	
	public static void main(String args[]) {
		
		HashMap<String,Integer> people = new HashMap<String,Integer>();
		
		people.put("One", 1);
		people.put("two", 2);
		people.put("Three", 3);
		people.put("Four", 4);
		
		
		
		for(String i : people.keySet()) {
			System.out.println(people.get(i));
		}
		
	}

}
