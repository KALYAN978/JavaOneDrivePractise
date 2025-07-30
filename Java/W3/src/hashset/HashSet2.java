package hashset;

import java.util.HashSet;

public class HashSet2 {

	public static void main(String[] args) {
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		
		
		
		System.out.println(numbers);
		
		System.out.println("\n");
		for(int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println(numbers.remove(1));
		
		System.out.println("\n");
		
		System.out.println(numbers);
		

	}

}
